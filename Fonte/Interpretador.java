import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;


class Interpretador{

    



    public void interpreta(Codigo Cod){

      

     
        Logicos L=new Logicos();
        
       // Cod.ImprimeCodigo();


       

            while(Cod.Cod[Cod.i][Cod.j]!=null){


                if(Cod.Cod[Cod.i][Cod.j].contains("$")){

                   Cod.variaveis[Cod.VarAux]=new Variavel(Cod.Cod[Cod.i][Cod.j].replace("$",""));
                    
                    Cod.VarAux++;
                    Cod.j++;

                }

                if(Cod.Cod[Cod.i][Cod.j].contains("=")){
                    
                   L.igual(Cod);
                    Cod.j++;
                    Cod.ImprimeVars();

                }
                
                
                
                
                if(Cod.Cod[Cod.i][Cod.j].equals(";")){
                    
                    Cod.j=0;
                    Cod.i++;
                    
                    
                    
                }else{


                Cod.j++;
                
                }



            }
        






        }






    
    
    
 

    
    
    


}
