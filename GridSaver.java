import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GridSaver {
	public static void SaveGrid(int[][] grille, int taille, String nom_fich){
		//Formatage de la grille
		int iterations = (int)Math.ceil((double)(taille*taille)/8);
		int x=0;
		int y=0;
		byte[] octets = new byte[iterations+5];
		octets[0] = (byte) taille;
		octets[1] = 0; // pos x de l'entrée
		octets[2] = 0; // pos y de l'entrée
		octets[3] = 0; // pos x de la sortie
		octets[4] = 0; // pos y de la sortie
		int[] octet_courant = new int[8];
		for (int i=5;i<iterations+5;i++){
			for(int j=0;j<8;j++){
				if (x>=taille){
					x=0;
					y+=1;
				}
				if (y>=taille){
					octet_courant[j] = 0;
				}else {
					if ((grille[y][x] != 0) && (grille[y][x] != 1)){
						octet_courant[j] = 0;
						if (grille[y][x] == 2){
							octets[1] = (byte)x;
							octets[2] = (byte)y;
						}
						if (grille[y][x] == 3){
							octets[3] = (byte)x;
							octets[4] = (byte)y;
						}
					} else {
						octet_courant[j] = grille[x][y];
					}
				}
				x++;
			}
			octets[i] = (byte)Bit.ByteToInt(octet_courant);
		}
		//Fin du formatage de la grille
		/*for (int buffer : octets) {
			System.out.println(buffer & 0xFF);
		}
		for (int[] tab:
			 grille) {
			for (int bit:
				 tab) {
				System.out.print(bit);
			}
			System.out.print("\n");
		}*/
		//Sauvegarde dans un fichier
		try{
			FileOutputStream fos = new FileOutputStream(nom_fich);
			try {
				fos.write(octets);
			} catch (IOException e) {
				System.err.println("Erreur d'ecriture dans le fichier");
			}
			try {
				fos.close();
			} catch (IOException e){
				System.err.println("Erreur lors de la fermeture du fichier");
			}
		} catch (FileNotFoundException e){
			System.err.println(nom_fich+" n'a pas été trouvé");
		}
	}
}

