import java.io.File;

import javax.swing.*;

public class MenuInit{

    private static JButton quit_button;
    public static JPanel menu_panel;
    private static JButton select_button;
    private static JTextField size_tfield;
    private static JButton generate_button;
    private static JLabel size_label;
    public static int gridSize;
    private static JLabel path_label;
    protected static File fichier;
    private static JButton generateEmpty_button;
    
    public static void menu(){
        quit_button = new JButton("Quitter");
        select_button = new JButton("Charger");
        menu_panel = new JPanel();
        size_tfield = new JTextField(20);
        generate_button= new JButton("générer");
        path_label= new JLabel("chemin du fichier");
        size_label = new JLabel("Entrer la taille :");
        generateEmpty_button =  new JButton("grille vide");

        select_button.addActionListener(e -> {
                Display.frame.dispose();
                Display.Choose_frame();
            }
        );

        quit_button.addActionListener(e -> {
                Display.frame.dispose();
            }
        );

        generate_button.addActionListener(e -> {
                gridSize = Integer.parseInt(size_tfield.getText());
                GridGenerator.gridGeneration(gridSize);
                Display.frame.dispose();
                Display.modification_display();

            }
        );

        generateEmpty_button.addActionListener(e -> {
            gridSize = Integer.parseInt(size_tfield.getText());
            EmptyGridGen.EmptyGen(gridSize);
            Display.frame.dispose();
            Display.modification_display();

        }
    );


        
        
        menu_panel.add(path_label);
        menu_panel.add(select_button);
        menu_panel.add(size_label);
        menu_panel.add(size_tfield);
        menu_panel.add(generate_button);
        menu_panel.add(generateEmpty_button);
        menu_panel.add(quit_button);
    }
}
