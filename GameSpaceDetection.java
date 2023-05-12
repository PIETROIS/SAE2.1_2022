import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class GameSpaceDetection implements KeyListener{
    
    protected static int spacedetection;
    private JPanel[][] tableau_panel;
    private int[][] tableau;
    
    public GameSpaceDetection(JPanel[][] paneltab , int[][] grid){
        this.tableau_panel = paneltab;
        this.tableau = grid;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        spacedetection = (int) e.getKeyCode();
        if (spacedetection == KeyEvent.VK_SPACE){
            algorythmeRandom.RandomChoice(tableau_panel, tableau);
            if (algorythmeRandom.end == true){
                Display.frame.dispose();
                Display.end_Game();
            }
            else if (algorythmeRandom.end == false) {
                Display.frame.dispose();
                Display.start_Game();
            }
        }

        
    }
    @Override
    public void keyReleased(KeyEvent e) {      
    }
}
