import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;


class Arquivador{
    
    
    private String lineas[][];




    public void arquiva(String Linhas[] ){
        
        int i=0,j=0;
        
       
        String [][]teste= new String[100][100];
        
        
        
        for(i=0;i<5;i++){
            
            StringTokenizer token=new StringTokenizer(Linhas[i]);
            
            while(token.hasMoreTokens()){
                
                
                
                teste[i][j]=token.nextToken();
                
                
                j++;
                
            }
            
            j=0;
            
        }
        i=0;
        
        lineas= new String[100][100];
        
        
        
        
        while(teste[i][j]!=null){
            
            while(teste[i][j]!=null){
                
                lineas[i][j]= teste[i][j].replace("="," = ");
                
                System.out.println(lineas[i][j]);
                
                
                j++;
                
                
            }
            j=0;
            
            i++;
        }
        
        
        
       
        
       
        
        
        
        
        
        
        
        
        
    }











}