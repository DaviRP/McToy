import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;


class Interpretador{
    
    public String Cod[][];
    
    private int i;
    private int j;
    
    public Variavel Vars[]=new Variavel[10];
    
    
    

    public void interpreta() {
        
        
        
        Variavel v
      
        
        while(this.Cod[i][j]!=null){
            
            
           
            if(this.Cod[i][j].contains("$")){
                
                
                
               
                
                
            }
            
            
            
            
            
            
            
            
            
            
            if(Cod[i][j].contains(";")){
            i++;
            }
        }
        
    }
    
    //GETS E SETS
    public void setI(int x){
        
        this.i=x;
        
        
    }
    
    public int getI(){
        
        
        return this.i;
        
    }
    
    public void setJ(int y){
        
        this.j=y;
        
    }
    public int getJ(){
        
        return this.j;
        
    }
    
    
}
