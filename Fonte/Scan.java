import java.util.Scanner;

class Scan{




    
    public void Entrada(Codigo Cod){
        
        Cod.j++;
        Scanner entrada = new Scanner(System.in);
        
        Cod.variaveis[Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])].valor = entrada.nextDouble();
        
        Cod.j++;
        
        
        
        
    }














}