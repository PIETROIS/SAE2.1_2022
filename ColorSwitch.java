import java.awt.*;
import javax.swing.*;

public class ColorSwitch {

    public static JButton[][] coo_button;
    protected static int coo_x;
    protected static int coo_y;
    public static int depcpt;
    public static int endcpt;

    public static void Color_Coo(){
        for (int i=0; i<MenuInit.gridSize+2 ; i++){
            for (int j=0 ; j <MenuInit.gridSize+2 ; j++){
                if ( ModifGridInit.tab[i][j]== ClickDetection.clickedpanel){
                    coo_x = i;
                    coo_y = j;
                }
            }
        }
    }

    public static void Color_Switch(JPanel[][] tab, int[][] tableau){
        for (int i=0; i<MenuInit.gridSize+2 ; i++){
            for (int j=0 ; j <MenuInit.gridSize+2 ; j++){
                if (tab[i][j]== ClickDetection.clickedpanel){
                    coo_x = i;
                    coo_y = j;
                }
            }
        }
        if (tableau[coo_x][coo_y] == 1 ) {
            tableau[coo_x][coo_y] = 0;
            tab[coo_x][coo_y].setBackground(Color.WHITE);
        }
        else if (tableau[coo_x][coo_y] == 0 ) {
            tableau[coo_x][coo_y] = 2;
            tab[coo_x][coo_y].setBackground(Color.BLUE);
        }
        else if (tableau[coo_x][coo_y] == 2) {
            tableau[coo_x][coo_y] = 3;
            tab[coo_x][coo_y].setBackground(Color.RED);
        }
        else if (tableau[coo_x][coo_y] == 3) {
            tableau[coo_x][coo_y] = 1;
            tab[coo_x][coo_y].setBackground(Color.BLACK);
        }
    }


    public static void Cptdep(){
        depcpt=0;
        for (int a = 0 ; a<MenuInit.gridSize+2 ; a++){
            for (int b = 0 ; b<MenuInit.gridSize+2 ; b++){
                if (GridStorage.grid[a][b] == 2){
                    depcpt+=1;
                }
            }
        }
    }

    public static void Cptend(){
        endcpt=0;
        for (int a = 0 ; a<MenuInit.gridSize+2 ; a++){
            for (int b = 0 ; b<MenuInit.gridSize+2 ; b++){
                if (GridStorage.grid[a][b] == 3){
                    endcpt+=1;
                }
            }
        }
    }

}
