import javax.swing.*;

public class MenuAlgo {
    protected static JPanel algoPanel;
    private static JButton randomButton;
    private static JButton determinedButton;

    public static void StepMenu(){
        algoPanel = new JPanel();
        randomButton = new JButton("aléatoire");
        determinedButton = new JButton("déterministe");

        algoPanel.add(determinedButton);
        algoPanel.add(randomButton);

        determinedButton.addActionListener(e -> {
            Display.frame.dispose();
            AlgorithmeRecursif.init();
        });
        randomButton.addActionListener(e -> {
            Display.frame.dispose();
            Display.start_Game();
            }
        ); 

        Display.frame.add(algoPanel);
    }

}
