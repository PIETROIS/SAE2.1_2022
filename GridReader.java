import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GridReader {
    public static int[][] ReadGrid(String nom_fich) {
		int taille =0;
		int[][] grille = {};
        try{
            FileInputStream fis = new FileInputStream(nom_fich);
            try {
                taille = fis.read();
                int entree_x = fis.read();
                int entree_y = fis.read();
                int sortie_x = fis.read();
        		int sortie_y = fis.read();
        		int iterations = (int)Math.ceil((double)(taille*taille)/8);
        		int[] buffer = new int[iterations];
        		for (int i=0;i<iterations;i++){
        	    	buffer[i] = fis.read();
				}
				grille = new int[taille][taille];
				int x = 0;
				int y = 0;
				int f = 0;
				int[][] octets = new int[iterations][8];
				for (int octet : buffer){
					for (int i=7;i>=0;i--){
						if (Math.pow(2,i)<=octet){
							octets[f][i] = 1;
							octet = octet-(int)Math.pow(2,i);
						}
						
					}
					f++;
				}
				for (int[] octet : octets){
					for (int bit : octet){
						if ((bit == 1)&&(y<taille)){
							grille[x][y] = 1;
						}
						x++;
						if (x>=taille){
							x=0;
							y++;
						}
					}
		
				}
				grille[entree_x][entree_y] = 2;
				grille[sortie_x][sortie_y] = 3;
				try {
				fis.close();
				
				} catch (IOException e){
					System.err.println("Erreur de fermeture du fichier");
				}
			} catch (IOException e){
				System.err.println("Erreur de lecture du fichier");
			}
		} catch (FileNotFoundException e){
			System.err.println("Fichier non trouvé");
		}
		return grille;
	
    }
}
