import javax.swing.*;

public class NextStep {
    
    protected static JPanel stepPanel;
    private static JButton nextButton;
    private static JButton savebutton;
    private static JTextField zoneNom;
    private static JLabel erreurSave;

    public static void StepMenu(){
        stepPanel = new JPanel();
        zoneNom = new JTextField(32);
        nextButton = new JButton("next");
        savebutton = new JButton("save");
        erreurSave = new JLabel("Veuillez entrer un nom de fichier");
        stepPanel.add(zoneNom);
        stepPanel.add(savebutton);
        stepPanel.add(nextButton);

        savebutton.addActionListener(e -> {
            String nom_fichier = zoneNom.getText();
            if (nom_fichier != " "){
                nom_fichier = nom_fichier + ".lab";
                GridSaver.SaveGrid(GridStorage.grid,MenuInit.gridSize+2,nom_fichier);
                Display.frame.dispose();
                Display.Algo_Choice();
            }else stepPanel.add(erreurSave);
        });
        nextButton.addActionListener(e -> {
            Display.frame.dispose();
            Display.Algo_Choice();
            }
        );  

        Display.frame.add(stepPanel);
    }

}
