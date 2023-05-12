import java.awt.*;
import javax.swing.*;


public class ModifGridInit {
    
    protected static JPanel panel;
    private static int j;
    private static int i;
    protected static JPanel[][] tab;
    
   
    public static void Grid_init() {
        tab = new JPanel[MenuInit.gridSize+2 ][MenuInit.gridSize+2 ];
        for (i=0; i<MenuInit.gridSize+2 ; i++){
            for (j=0 ; j <MenuInit.gridSize+2 ; j++){
                panel = new JPanel();
                
                if (GridStorage.grid[i][j] == 1){
                    panel.setBackground(Color.BLACK);
                    Display.frame.add(panel);
                    tab[i][j] = panel;
                }
                else if (GridStorage.grid[i][j] != 1){
                    panel.setBackground(Color.WHITE);
                    if (GridStorage.grid[i][j] == 2){
                        JLabel label = new JLabel("Θ");
                        panel.add(label);
                    }
                    else if (GridStorage.grid[i][j] == 3){
                        JLabel label = new JLabel("∩");
                        panel.add(label);
                    }
                    Display.frame.add(panel);
                    tab[i][j] = panel;
                }
                
                panel.addMouseListener(new ClickDetection(tab, GridStorage.grid));
            }
        }
        Display.frame.addKeyListener(new SpaceDetection());
    }
}
