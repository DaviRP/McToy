import java.util.Scanner;
import java.io.*;

class Toy{
    public static void main(String args[]) throws Exception {
        File f;
        Scanner s;
        Interpretador b;
        Arquivador a;
        String linhas[] = new String[100];
        
        
        f = new File(args[0]);
       
        s = new Scanner(f);
        
        a = new Arquivador();
        
               int i = 0;
        while(s.hasNext()) {
            linhas[i] = s.nextLine();
            i++;
        }
        
        a.arquiva(linhas);
        a.interpreta();
        
        
    }
}
