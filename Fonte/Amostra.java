import java.io.*;


class Amostra{
    

    public void Amostrador(Codigo Cod){
        
        
        String S=new String();
        Cod.j++;
        String space=new String(" ");
        while(Cod.Cod[Cod.i][Cod.j].contains(";")!=true){
        
            
    
            if(Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])!=1 && Cod.Cod[Cod.i][Cod.j].contains("$")){
                
                S += Cod.variaveis[Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])].valor;
                S += space;
                
            
            }else{
                
                S += Cod.Cod[Cod.i][Cod.j];
                
                S += space;
                
            }
            Cod.j++;
        }
        
      
        System.out.println(S);

    }

}