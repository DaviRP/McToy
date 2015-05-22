//Classe Amostra responsavel pela interacao do usuario com a tela.
//Exibe na tela valores de variaveis e strings.
import java.io.*;

class Amostra{
    

    public void Amostrador(Codigo Cod){//Recebe como parametro um objeto tipo "Codigo"
        
        //string final de controle
        String S=new String();
        
        
        //string para facilitar a concatenacao de preciso
        String space=new String(" ");
        //looping que corre até o final da linha
        if(Cod.Cod[Cod.i][Cod.j].contains("Amostra.O")){
            
            if(Cod.Cod[Cod.i][Cod.j]==null){
                Cod.i++;
                Cod.j=0;
                
            }else{
                Cod.j++;
            }
        }
        while(Cod.Cod[Cod.i][Cod.j]!=null){
            if(Cod.Cod[Cod.i][Cod.j].contains(";")){
                break;
            }
            
            
            //checa se o parametro é uma variavel valida
            if(Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])!=-1 && Cod.Cod[Cod.i][Cod.j].contains("$")){
                
                S += Cod.variaveis[Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])].valor;
                S += space;
                
            
            }else{//ou imprime o conteudo
                
                S += Cod.Cod[Cod.i][Cod.j];
                
                S += space;
                
            }
            
            if(Cod.Cod[Cod.i][Cod.j]==null){
                Cod.i++;
                Cod.j=0;
                
            }else{
                Cod.j++;
            }
        }
        
        //final print
        System.out.println(S);

    }

}