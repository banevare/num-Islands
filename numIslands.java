class Solution {
    public int numIslands(char [][] gridc) {
		int [][] grid = new int [gridc.length][gridc[0].length];
		for(int i = 0; i < grid.length; i++) {							//row
			for(int j = 0; j < grid[i].length; j++){					//column
				if (gridc[i][j] == '1') grid[i][j] = 1;
				else grid[i][j] = 0;
			}
		}
		int island = 0;
		for(int i = 0; i < grid.length; i++) {						//row
			for(int j = 0; j < grid[i].length; j++){					//column
				if (grid[i][j] == 1) adjacent(grid,--island,i,j);
			}
		}
		return -island;
    }
	public void adjacent(int[][] grid,int island, int i , int j){
		grid[i][j] = island;
		if (j > 0){
			if (grid[i][j-1] == 1) adjacent(grid,island,i,j-1);				//left
		}
		if (j < grid[i].length - 1){
			if (grid[i][j+1] == 1) adjacent(grid,island,i,j+1);				//right
		}
		if (i > 0){
			if (grid[i-1][j] == 1) adjacent(grid,island,i-1,j);				//down
		}
		if (i  < grid.length -1 ){
			if (grid[i+1][j] == 1) adjacent(grid,island,i+1,j);				//up
		}
	}
	hi
	public void test0(){
		char grid [][]= {
			{'0','0','0','0','0'},
			{'0','0','0','0','0'},
			{'0','0','0','0','0'},
			{'0','0','0','0','0'}
		};
		int a  = numIslands(grid);
		// print(grid);
		assert(a == 0);	
	}
	public void test1(){
		char grid [][]= {
			{'1','1','1','1','0'},
			{'1','1','0','1','0'},
			{'1','1','0','0','0'},
			{'0','0','0','0','0'}
		};
		int a  = numIslands(grid);
		// print(grid);
		assert(a == 1);	
	}
	public void test1Big(){
		char grid [][]= {
			{'1','1','1','1','1'},
			{'1','1','1','1','1'},
			{'1','1','1','1','1'},
			{'1','1','1','1','1'}
		};
		int a  = numIslands(grid);
		// print(grid);
		assert(a == 1);	
	}
	public void test3(){
		char grid [][]= {
			{'1','1','0','0','0'},
			{'1','1','0','0','0'},
			{'0','0','1','0','0'},
			{'0','0','0','1','1'}
		};
		int a  = numIslands(grid);
		// print(grid);
		assert(a == 3);	
	}
	
	public void print(int[][] grid){
		for(	int i = 0; i < grid.   length; i++) {						//row
			System.out.print("{");
			for(int j = 0; j < grid[i].length; j++){					//column
				System.out.print(grid[i][j] + " ");
			}
			System.out.println("}");
		}
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		s.test0();
		s.test1();
		s.test1Big();
		s.test3();
	}
}
