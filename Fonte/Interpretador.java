import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;


class Interpretador {
    
    
    
    private String linhas[];
    
   
    public void interpreta(String l[]) {
        int i=0,j=0;
       /*

        for(i = 0; i < l.length; i++) {
            if(l[i] != null) {
                // TODO: interpretar a linha
                System.out.println("Linha " + (i + 1) + ": " + l[i]);
            }
        }
        */
         System.out.println("------------------------------------");
        
        

        
        String [][]teste= new String[100][100];
        
        
        
        for(i=0;i<5;i++){
            
            StringTokenizer token=new StringTokenizer(l[i]);
            
            while(token.hasMoreTokens()){
                
                
                
                teste[i][j]=token.nextToken();
                
                
                j++;
                
                }
            
            j=0;
            
        }
        i=0;
        
       
        
        
      
        while(teste[i][j]!=null){
            
            while(teste[i][j]!=null){
                
                System.out.println("coluna"+i+"linha"+j+":"+teste[i][j]);
                
                
                j++;
                
                
            }
            j=0;
            
            i++;
        }
      
       

        
        
       
    
    }
}
