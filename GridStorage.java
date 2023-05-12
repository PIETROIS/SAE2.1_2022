
public class GridStorage {
    public static int[][] grid;
    
    public static int [][] gridDisplay(){
		for (int i=0;i<MenuInit.gridSize+2;i++){
			for (int j=0;j<MenuInit.gridSize+2;j++){
				System.out.print(grid[i][j]);
			}
			System.out.print("\n");			
		}
		return grid;
	}
}
