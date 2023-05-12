import javax.swing.*;
import java.awt.*;

public class Display {
    public static JFrame frame;


    public static void Initialize() {
        start();
    }

    public static void modification_display() {
        start_Grid_Mod();
    }

    public static void Choose_frame(){
        Choose_Grid();
    }

    
    private static void start(){
        frame = new JFrame("Ariane");
        frame.setSize(700, 700);
        frame.setLocation(50, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MenuInit.menu();

        frame.add(MenuInit.menu_panel,BorderLayout.CENTER);
        frame.setVisible(true);

    }

    private static void start_Grid_Mod(){
        frame = new JFrame("Ariane");
        frame.setSize(700,700);
        frame.setLocation(50, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(MenuInit.gridSize+2,MenuInit.gridSize+2));
        ModifGridInit.Grid_init();

        frame.setVisible(true);

    }

    private static void Choose_Grid(){
        MenuInit.fichier = SelectionFichier.ChoixFichier();
        GridStorage.grid = GridReader.ReadGrid(MenuInit.fichier.getAbsolutePath());
        MenuInit.gridSize = GridStorage.grid.length-2;
        start_Grid_Mod();
    }

    public static void Next_Grid(){
        frame = new JFrame("Ariane");
        frame.setSize(700,700);
        frame.setLocation(50, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        NextStep.StepMenu();

        frame.setVisible(true);
    }

    public static void Algo_Choice(){
        frame = new JFrame("Ariane");
        frame.setSize(700,700);
        frame.setLocation(50, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuAlgo.StepMenu();

        frame.setVisible(true);
    }

    public static void start_Game(){
        frame = new JFrame("Ariane");
        frame.setSize(700,700);
        frame.setLocation(50, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(MenuInit.gridSize+2,MenuInit.gridSize+2));
        Game.Game_init();

        frame.setVisible(true);

    }

    public static void end_Game(){
        frame = new JFrame("Ariane");
        frame.setSize(700,700);
        frame.setLocation(50, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameEnd.End_init();

        frame.setVisible(true);

    }


}
