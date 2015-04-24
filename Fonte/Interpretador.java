import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;


class Interpretador extends Logicos{

    public String [][]Cod;

    public int i;
    public int j;


    public Variavel []variaveis=new Variavel[10];
    
    //public Logicos logic=new Logicos();



    public void interpreta(){

        this.i=0;
        this.j=0;

        int VarAux=0;

        



     /*   while(Cod[i][j]!=null){

            while(Cod[i][j]!=null){


                System.out.println(Cod[i][j]);
                j++;


            }

            j=0;
            i++;


        }*/
        
        
        i=0;
        j=0;



        while(Cod[i][j]!=null){

            while(Cod[i][j]!=null){


                if(Cod[i][j].contains("$")){

                   this.variaveis[VarAux]=new Variavel(Cod[i][j].replace("$",""));
                    System.out.println(this.variaveis[VarAux].nome);

                    VarAux++;
                    j++;

                }

                if(Cod[i][j].contains("=")){
                    
                   this.DistribuidorOperacao();
                   

                }


                j++;
                




            }
            j=0;
            i++;






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
