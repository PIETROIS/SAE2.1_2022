import java.util.Random;

public class GridGenerator {

	public static int[][] grid;
	
	public static void gridGeneration(int a) {
		grid = new int[a+2][a+2];
		Random gen = new Random();
		for (int i=0;i<a+2;i++){
			for (int j=0;j<a+2;j++){
				if (i == 0){
					grid[i][j] = 1;
				}
				if (i == a+1){
					grid[i][j] = 1;
				}
				if (j == 0){
					grid[i][j] = 1;
				}
				if (j == a+1){
					grid[i][j] = 1;
				}
				if (gen.nextInt(3) == 1){
					grid[i][j] = 1;
				}
			}
		}
		GridStorage.grid = grid;
	}

	public static int [][] gridDisplay(){
		GridGenerator.grid = GridStorage.grid;
		for (int i=0;i<MenuInit.gridSize+2;i++){
			for (int j=0;j<MenuInit.gridSize+2;j++){
				System.out.print(grid[i][j]);
			}
			System.out.print("\n");			
		}
		return grid;
	}
}

