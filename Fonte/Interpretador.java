import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;


class Interpretador{

    



    public void interpreta(Codigo Cod){

      

     
        Logicos L=new Logicos();
        
        //Cod.ImprimeCodigo();
        Fluxo F= new Fluxo();
        Laco Lc =new Laco();
        Amostra A=new Amostra();
        Scan Scn=new Scan();

       

            while(Cod.Cod[Cod.i][Cod.j]!=null){
                
                
               
                
                if(Lc.state!=0 && Lc.state!=-1){
                    
                    if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        Lc.state++;
                    }
                    if(Cod.Cod[Cod.i][Cod.j].contains("}")){
                        
                        Lc.state--;
                    }
                    
                    
                }
                if(Cod.Cod[Cod.i][Cod.j].contains("}") && Lc.state==0){
                    
                    Cod.i=Lc.flipI;
                    Cod.j=Lc.flipJ;
                    
                    Lc.Flip(Cod);
                    
                    
                }
                


                if(Cod.Cod[Cod.i][Cod.j].contains("$")){

                   Cod.variaveis[Cod.VarAux]=new Variavel(Cod.Cod[Cod.i][Cod.j].replace("$",""));
                    
                    Cod.VarAux++;
                    Cod.j++;

                }
                if(Cod.Cod[Cod.i][Cod.j].contains("Amostra.O")){
                    
                    A.Amostrador(Cod);
                    
                }
                if(Cod.Cod[Cod.i][Cod.j].contains("Value.In")){
                    
                    Scn.Entrada(Cod);
                    
                    
                }
                 

                if(Cod.Cod[Cod.i][Cod.j].contains("=")){
                    
                    L.DistribuidorLogico(Cod);
                    Cod.j++;
                    

                }
                
                if(Cod.Cod[Cod.i][Cod.j].contains("True?")){
                    
                    F.True(Cod);
                    
                }
                if(Cod.Cod[Cod.i][Cod.j].contains("Flip")){
                    
                    Lc.Flip(Cod);
                    
                }
                
                if(Cod.Cod[Cod.i][Cod.j].equals("end") ){
                    
                    break;
                    
                    
                }
                
                
                
                
                
                if(Cod.Cod[Cod.i][Cod.j].contains(";") ||Cod.Cod[Cod.i][Cod.j].contains("{")  ||  Cod.Cod[Cod.i][Cod.j].contains("}")){
                    
                    
                    Cod.j=0;
                    Cod.i++;
                    
                    
                    
                }else{


                Cod.j++;
                
                }



            }
        
           Cod.ImprimeVars();





        }






    
    
    
 

    
    
    


}
