import java.util.Random;
import javax.swing.*;

public class algorythmeRandom {

    private static int i;
    private static int j;
    private static Random gen = new Random(); 
    private static int rand;
    private static boolean moove;
    protected static boolean end;


    

    public static void RandomChoice(JPanel[][] tab, int[][] tableau){
        end = false;
        moove = false;
        rand = gen.nextInt(4);
        if (rand == 0){
            for ( i = 0 ; i < MenuInit.gridSize+2 ; i++){
                for ( j = 0 ; j < MenuInit.gridSize+2 ; j++){
                    if (GridStorage.grid[i][j] == 2){
                        if (GridStorage.grid[i][j-1] == 0 ){
                            GridStorage.grid[i][j-1] = 2;
                            GridStorage.grid[i][j] = 0;
                            moove = true;
                        }
                        else if (GridStorage.grid[i][j-1] == 3){
                            GridStorage.grid[i][j-1] = 2;
                            GridStorage.grid[i][j] = 0;
                            end = true;
                            moove = true;
                        }
                        else if (GridStorage.grid[i][j-1] == 1){
                            GridStorage.grid[i][j-1] = 1 ;
                            GridStorage.grid[i][j]= 2 ;
                        }
                    }
                    if ( moove == true){
                        break;
                    } 
                }
                if ( moove == true){
                    break;
                } 
            }
        }
        else if (rand == 1){
            for ( i = 0 ; i < MenuInit.gridSize+2 ; i++){
                for ( j = 0 ; j < MenuInit.gridSize+2 ; j++){
                    if (GridStorage.grid[i][j] == 2){
                        if (GridStorage.grid[i+1][j] == 0 ){
                            GridStorage.grid[i+1][j] = 2;
                            GridStorage.grid[i][j] = 0;
                            moove = true;
                        }
                        else if (GridStorage.grid[i+1][j] == 3){
                            GridStorage.grid[i+1][j] = 2;
                            GridStorage.grid[i][j] = 0;
                            end = true;
                            moove = true;
                        }
                        else if (GridStorage.grid[i+1][j] == 1){
                            GridStorage.grid[i+1][j] = 1 ;
                            GridStorage.grid[i][j]= 2 ;
                        }
                    }
                    if ( moove == true){
                        break;
                    }
                }
                if ( moove == true){
                    break;
                } 
            }
        }
        
        else if (rand == 2){
            for ( i = 0 ; i < MenuInit.gridSize+2 ; i++){
                for ( j = 0 ; j < MenuInit.gridSize+2 ; j++){
                    if (GridStorage.grid[i][j] == 2){
                        if (GridStorage.grid[i][j+1] == 0 ){
                            GridStorage.grid[i][j+1] = 2;
                            GridStorage.grid[i][j] = 0;
                            moove = true;
                        }
                        else if (GridStorage.grid[i][j+1] == 3){
                            GridStorage.grid[i][j+1] = 2;
                            GridStorage.grid[i][j] = 0;
                            end = true;
                            moove = true;
                        }
                        else if (GridStorage.grid[i][j+1] == 1){
                            GridStorage.grid[i][j+1] = 1 ;
                            GridStorage.grid[i][j]= 2 ;
                        }
                    }
                    if ( moove == true){
                        break;
                    }
                }
                if ( moove == true){
                    break;
                } 
            }
        }
        
        else if (rand == 3){
            for ( i = 0 ; i < MenuInit.gridSize+2 ; i++){
                for ( j = 0 ; j < MenuInit.gridSize+2 ; j++){
                    if (GridStorage.grid[i][j] == 2){
                        if (GridStorage.grid[i-1][j] == 0 ){
                            GridStorage.grid[i-1][j] = 2;
                            GridStorage.grid[i][j] = 0;
                            moove = true;
                        }
                        else if (GridStorage.grid[i-1][j] == 3){
                            GridStorage.grid[i-1][j] = 2;
                            GridStorage.grid[i][j] = 0;
                            end = true;
                            moove = true;
                        }
                        else if (GridStorage.grid[i-1][j] == 1){
                            GridStorage.grid[i-1][j] = 1 ;
                            GridStorage.grid[i][j]= 2 ;
                        }
                    }
                    if ( moove == true){
                        break;
                    }
                }
                if ( moove == true){
                    break;
                } 
            }
        }
    }
}
