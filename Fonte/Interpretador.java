import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;


class Interpretador{

    



    public void interpreta(Codigo Cod){

      

     
        Logicos L=new Logicos();
        
        //Cod.ImprimeCodigo();
        Fluxo F= new Fluxo();


       

            while(Cod.Cod[Cod.i][Cod.j]!=null){
                
                
                if(Cod.Cod[Cod.i][Cod.j].equals("end") ){
                    
                    break;
                    
                    
                }


                if(Cod.Cod[Cod.i][Cod.j].contains("$")){

                   Cod.variaveis[Cod.VarAux]=new Variavel(Cod.Cod[Cod.i][Cod.j].replace("$",""));
                    
                    Cod.VarAux++;
                    Cod.j++;

                }
                 

                if(Cod.Cod[Cod.i][Cod.j].contains("=")){
                    
                    L.DistribuidorLogico(Cod);
                    Cod.j++;
                    

                }
                
                if(Cod.Cod[Cod.i][Cod.j].contains("True?")){
                    
                    F.True(Cod);
                    
                }
                
                if(Cod.Cod[Cod.i][Cod.j].contains(";") || Cod.Cod[Cod.i][Cod.j]==null || Cod.Cod[Cod.i][Cod.j].contains("{") || Cod.Cod[Cod.i][Cod.j].contains("}")){
                    
                    Cod.j=0;
                    Cod.i++;
                    
                    
                    
                }else{


                Cod.j++;
                
                }



            }
        
           Cod.ImprimeVars();





        }






    
    
    
 

    
    
    


}
