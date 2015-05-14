//Classe Scanner responsavel por entradas do teclado, porem
//apenas variaveis compativeis com a linguagem (Double);
import java.util.Scanner;

class Scan{
    
    public void Entrada(Codigo Cod){//Funcao de estrada recebe um Objeto tipo "Codigo"
        
        Cod.j++;
        
        Scanner entrada = new Scanner(System.in);
        //conversao para Double
        Cod.variaveis[Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])].valor = entrada.nextDouble();
        
        Cod.j++;
    }

}