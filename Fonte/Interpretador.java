import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;


class Interpretador{

    



    public void interpreta(Codigo Cod){

        Cod.i=0;
        Cod.j=0;

        int VarAux=0;
        Logicos L=new Logicos();





        while(Cod.Cod[Cod.i][Cod.j]!=null){

            while(Cod.Cod[Cod.i][Cod.j]!=null){


                if(Cod.Cod[Cod.i][Cod.j].contains("$")){

                   Cod.variaveis[VarAux]=new Variavel(Cod.Cod[Cod.i][Cod.j].replace("$",""));
                    
                    VarAux++;
                    Cod.j++;

                }

                if(Cod.Cod[Cod.i][Cod.j].contains("=")){
                    
                   L.igual(Cod);
                   

                }


                Cod.j++;
                




            }
            Cod.j=0;
            Cod.i++;






        }






    }
    
    
 

    
    
    


}
