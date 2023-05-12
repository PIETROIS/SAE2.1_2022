import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SelectionFichier {
    public static File ChoixFichier(){
        JFileChooser choix = new JFileChooser(new File(System.getProperty("user.dir")));
        choix.setAcceptAllFileFilterUsed(false);
        choix.addChoosableFileFilter(new FileNameExtensionFilter("Labyrinthes .lab","lab"));
        int res = choix.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION){
            File file = choix.getSelectedFile();
            System.out.println(file.getAbsolutePath());
            return file;
        }
        return null;
    }
}
