import java.util.Scanner;
import java.io.*;

class Toy{
    public static void main(String args[]) throws Exception {
        File f;
        Scanner s;
        Interpretador I;
        Arquivador a;
        String linhas[] = new String[100];
        int count;
        
        f = new File(args[0]);
       
        s = new Scanner(f);
        
        a = new Arquivador();
        
        I =new Interpretador();
        
        count=0;
        
        while(s.hasNext()) {
            linhas[count] = s.nextLine();
            count++;
        }
        
        
        I.interpreta(a.arquiva(linhas));
        
        
    }
}
