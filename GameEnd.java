import javax.swing.*;

public class GameEnd {
    protected static JPanel endPanel;
    private static JLabel endLabel;

    public static void End_init(){
        endPanel = new JPanel();
        endLabel = new JLabel("Thésée est sorti");

        endPanel.add(endLabel);

        Display.frame.add(endPanel);
    }
}
