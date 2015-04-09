import java.util.Scanner;
import java.io.*;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileReader;

import java.util.StringTokenizer;

class McToy{
    
        
        
        
    public FileReader file;
    
    public BufferedReader buffer;
    
    public String linha;
        
    public String texto;
        
        
        
    public arquivador(){
        
        
        buffer=new BufferedReader(this.file);
        
        
        while(buffer.ready()){
            
        
            linha=this.buffer.readLine();
            
            texto+=linha;
            
            
            
            
        }
        System.out.println(texto);
        
        
        
        

        }



}