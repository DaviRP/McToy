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
            Linhas [i]=Linhas[i].replace(";"," ; ");
            
            
            i++;
        }
        
        
        this.Cod= new String[100][100];
        
        
        
        for(i=0;i<5;i++){
            
            StringTokenizer token=new StringTokenizer(Linhas[i]);
            
            while(token.hasMoreTokens()){
                
                
                
                Cod[i][j]=token.nextToken();
                
                
                j++;
                
            }
            
            j=0;
            
        }
        i=0;
        
        
   
        
    }
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    

}









