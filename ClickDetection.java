import javax.swing.*;
import java.awt.event.*;



public class ClickDetection implements MouseListener{
    
    private JPanel[][] tableau_panel;
    private int[][] tableau;
    protected static JPanel clickedpanel;

    public ClickDetection(JPanel[][] paneltab , int[][] grid){
        this.tableau_panel = paneltab;
        this.tableau = grid;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        clickedpanel = (JPanel) e.getComponent();
        ColorSwitch.Color_Switch(tableau_panel, tableau);
        ColorSwitch.Cptdep();
        ColorSwitch.Cptend();
    }

    @Override
    public void mouseReleased(MouseEvent e){
    }

    @Override
    public void mousePressed(MouseEvent e){
    }

    @Override
    public void mouseExited(MouseEvent e){
    }

    @Override
    public void mouseEntered(MouseEvent e){
    }

}
