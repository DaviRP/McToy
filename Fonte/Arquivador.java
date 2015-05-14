//Classe responsavel pela organizacao do codigo e identacao.
//Objetivo na classe é separar os argumentos para melhor etendimento
//quando forem lidos novamente por outras classes como,separando
//palavras chaves de argumentos para melhor leitura.

import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;
import java.lang.String;

class Arquivador{
    
    public Codigo arquiva(String Linhas[]){//Funcao recebe um Vetor de Strings sem nenhum tipo de tratamento
        
        int i=0,j=0;
        Codigo Cod = new Codigo();
     //Separa as palavras chaves
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
        
        //Criacao da matriz aonde sera contido o Codigo depois da Tokanizacao
        Cod.Cod= new String[100][100];
        int k=0;
        
        for(i=0;i<Linhas.length;i++){
            
            while(Linhas[i].trim().isEmpty()){//Checa se a linha esta vazia ou com valores nullos
            i++;
                
            }
        
            StringTokenizer token= new StringTokenizer(Linhas[i]);
            
            while(token.hasMoreTokens()){//Separa cada linha em Tokens por "Espaço" e palavras Reservadas da linguagem
                
                Cod.Cod[k][j]=token.nextToken();
                j++;
            }
            if(Linhas[i].contains("end")){//End simboliza o final do codigo
                break;
            }
            k++;
            j=0;
        }
        Cod.i=0;
        Cod.j=0;
        return Cod;//Objeto final atendendo os pré-requisitos para ser interpretado
        
    }
}









