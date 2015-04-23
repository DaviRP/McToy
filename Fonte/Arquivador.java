import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;
import java.lang.String;


class Arquivador extends Interpretador{
    
    

    public void arquiva(String Linhas[]){
        
        int i=0,j=0;
        
        
        
        while(Linhas[i]!=null){
        
    
            Linhas [i]= Linhas[i].replace("="," = ");
            Linhas [i]= Linhas[i].replace(")"," ) ");
            Linhas [i]= Linhas[i].replace("("," ( ");
            Linhas [i]= Linhas[i].replace("{"," { ");
            Linhas [i]= Linhas[i].replace("}"," } ");
            Linhas [i]= Linhas[i].replace("<"," < ");
            Linhas [i]= Linhas[i].replace(">"," > ");
            Linhas [i]= Linhas[i].replace(";"," ; ");
            
            
           
            
            
            i++;
        }
        
        
        this.Cod= new String[100][100];
        
        int k=0;
        
        for(i=0;i<9;i++){
            
            
            while(Linhas[i].isEmpty()){
                
                i++;
                
            }
            
            
            
            StringTokenizer token= new StringTokenizer(Linhas[i]);
            
            
            while(token.hasMoreTokens()){
                
                
                
                Cod[k][j]=token.nextToken();
                
                
                j++;
                
            }
            k++;
            j=0;
            
        }
        i=0;
        
      
       /*
        while(Cod[i][j]!=null){
            
            while(Cod[i][j]!=null){
                
                
                System.out.println(Cod[i][j]);
                j++;
                
                
            }

            j=0;
            i++;
            
            
        }*/
        
        
        
      
        
    
        
        
        
   
        
    }
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    

}









