import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SpaceDetection implements KeyListener{
    
    protected static int spacedetection;

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        spacedetection = (int) e.getKeyCode();
        if (spacedetection == KeyEvent.VK_SPACE){
            if (ColorSwitch.depcpt == 1 && ColorSwitch.endcpt == 1){
                Display.frame.dispose();
                Display.Next_Grid(); 
            }
        }
    }
}
