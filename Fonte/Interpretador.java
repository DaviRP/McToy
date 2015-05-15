import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;


class Interpretador{
    
    
    public boolean State = false;
    public int Scope = 0;
    
    

    public void interpreta(Codigo Cod){

      

     
        Logicos L=new Logicos();
        Fluxo F= new Fluxo();
        Laco Lc =new Laco();
        Amostra A=new Amostra();
        Scan Scn=new Scan();

       

            while(Cod.Cod[Cod.i][Cod.j]!=null){
                
                
               
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
                
                if(Cod.Cod[Cod.i][Cod.j].contains("end") ){
                    
                    break;
                    
                    
                }
                
                if(this.State){
                    
                    if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        
                        this.Scope++;
                        
                        
                        
                        
                        
                    }else if(Cod.Cod[Cod.i][Cod.j].contains("}")){
                        
                        this.Scope--;
                        
                    }
                    
                    if(this.Scope==0){
                        break;
                        
                    }
                }
              
                
                
                
                
                
                if(Cod.Cod[Cod.i][Cod.j].contains(";")|| Cod.Cod[Cod.i][Cod.j+1]==null || Cod.Cod[Cod.i][Cod.j]==null]{
                   
                    
                        Cod.j=0;
                        Cod.i++;
                        
                    
                }else{


                    Cod.j++;
                
                }



            }
        
        





        }






    
    
    
 

    
    
    


}
