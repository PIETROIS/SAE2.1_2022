public class EmptyGridGen {
    public static int[][] grid;

    public static void EmptyGen(int a){
        grid = new int[a+2][a+2];
		for (int i=0;i<a+2;i++){
			for (int j=0;j<a+2;j++){
				if (i == 0){
					grid[i][j] = 1;
				}
				else if (i == a+1){
					grid[i][j] = 1;
				}
				else if (j == 0){
					grid[i][j] = 1;
				}
				else if (j == a+1){
					grid[i][j] = 1;
				}
				else {
                    grid[i][j] = 0;
                }
			}
		}
		GridStorage.grid = grid;

    }
}
