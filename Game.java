import java.awt.*;
import javax.swing.*;

public class Game {

    protected static JPanel panel;
    private static int j;
    private static int i;
    
    public static void Game_init() {
        for (i=0; i<MenuInit.gridSize+2 ; i++){
            for (j=0 ; j <MenuInit.gridSize+2 ; j++){
                panel = new JPanel();
                
                if (GridStorage.grid[i][j] == 1){
                    panel.setBackground(Color.BLACK);
                    Display.frame.add(panel);
                }
                else if (GridStorage.grid[i][j] == 0){
                    panel.setBackground(Color.WHITE);
                    Display.frame.add(panel);
                }
                else if (GridStorage.grid[i][j] == 3){
                    panel.setBackground(Color.RED);
                    Display.frame.add(panel);
                }
                else if (GridStorage.grid[i][j] == 2){
                    panel.setBackground(Color.BLUE);
                    Display.frame.add(panel);
                }
            }
        }
        Display.frame.addKeyListener(new GameSpaceDetection(ModifGridInit.tab, GridStorage.grid));
    }
}
