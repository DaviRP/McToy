import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;
import java.lang.String;


class Arquivador{
    
    

    public Codigo arquiva(String Linhas[]){
        
        int i=0,j=0;
        Codigo Cod = new Codigo();
        
     while(Linhas[i]!=null){
        
    
            Linhas [i]= Linhas[i].replace("="," = ");
            Linhas [i]= Linhas[i].replace(")"," ) ");
            Linhas [i]= Linhas[i].replace("("," ( ");
            Linhas [i]= Linhas[i].replace("{"," { ");
            Linhas [i]= Linhas[i].replace("}"," } ");
            Linhas [i]= Linhas[i].replace("<"," < ");
            Linhas [i]= Linhas[i].replace(">"," > ");
            Linhas [i]= Linhas[i].replace(";"," ; ");
            Linhas [i]= Linhas[i].replace("-"," - ");
            
            
           
            
            
            i++;
        }
        
        
        Cod.Cod= new String[100][100];
        
        int k=0;
        
        for(i=0;i<Linhas.length;i++){
            
            
            
            while(Linhas[i].trim().isEmpty()){
                
                i++;
                
            }
           
            
            
            StringTokenizer token= new StringTokenizer(Linhas[i]);
            
            
            while(token.hasMoreTokens()){
                
                
                
                Cod.Cod[k][j]=token.nextToken();
                
                
                j++;
                
            }
            if(Linhas[i].contains("end")){
                break;
                
            }
            k++;
            j=0;
            
        }
        
        
        
        
     
        
             
        Cod.i=0;
        Cod.j=0;
        return Cod;
        
        
        
   
        
    }
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    

}









