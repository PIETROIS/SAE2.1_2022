import javax.swing.JFrame;
import javax.swing.JLabel;

public class AlgorithmeRecursif {

    public static void init(){
        int x = 0;
        int y = 0;
        int actions = 0;
        for (int i=0;i<MenuInit.gridSize+2;i++){
            for (int j=0;j<MenuInit.gridSize+2;j++){
                if (GridStorage.grid[i][j] == 2){
                    x = i;
                    y = j;
                }
            }
        }
        for (int i=0;i<1;i++){
            actions += Algo(0,x,y);
        }
        actions = actions/1;
        JFrame f = new JFrame();
        f.setSize(300,100);
        f.setLocation(100,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel("Nombre d'actions moyen : "+Integer.toString(actions)));
        f.setVisible(true);
    }

    public static int Algo(int actions,int x,int y){
        if (GridStorage.grid[x][y] == 3){
            return actions;
        }
        if (GridStorage.grid[x][y] == 1){
            return 0;
        }
        if (GridStorage.grid[x][y] == 4){
            return 0;
        }
        GridStorage.grid[x][y] = 4;
        int a = Algo(actions+1,x+1,y);
        int b = Algo(actions+1,x,y+1);
        int c = Algo(actions+1,x-1,y);
        int d = Algo(actions+1,x,y-1);
		int min = (MenuInit.gridSize+2)*(MenuInit.gridSize+2)*10;
		if (a != 0 && a < min){
			min = a;
		}
		if (b != 0 && b < min){
			min = b;
		}
		if (c != 0 && c < min){
			min = c;
		}
		if (d != 0 && d < min){
			min = d;
		}
		return min;
		


        
        
    }
}