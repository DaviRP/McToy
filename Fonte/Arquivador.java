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
            Linhas [i]= Linhas[i].replace("+"," + ");
            Linhas [i]= Linhas[i].replace("*"," * ");
            Linhas [i]= Linhas[i].replace("^"," ^ ");
            Linhas [i]= Linhas[i].replace("/"," / ");
            Linhas [i]= Linhas[i].replace("Amostra.O"," Amostra.O ");
            Linhas [i]= Linhas[i].replace("True?"," True? ");
            Linhas [i]= Linhas[i].replace("Flip"," Flip ");
            Linhas [i]= Linhas[i].replace("Value.In"," Value.In ");
         
           
            
            
           
            
            
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









