import java.io.*;


class Amostra{
    

    public void Amostrador(Codigo Cod){
        
        
        String S=new String();
        Cod.j++;
        
        while(Cod.Cod[Cod.i][Cod.j].contains(";")!=true){
        
            
    
            if(Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])!=1 && Cod.Cod[Cod.i][Cod.j].contains("$")){
                
                S += Cod.variaveis[Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])].valor;
                
                
            
            }else{
                
                S += Cod.Cod[Cod.i][Cod.j];
                
            }
            Cod.j++;
        }
        
      
        System.out.println(S);

    }

}