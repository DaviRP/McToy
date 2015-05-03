
class Logicos{
    





    public void igual(Codigo Cod){

        int Indice_recebe = Cod.indiceVar(Cod.Cod[Cod.i][Cod.j-1]);
        
        if(Indice_recebe != -1){
            Cod.j++;
            int Indice_doadora = Cod.indiceVar(Cod.Cod[Cod.i][Cod.j]);
            
            if(Indice_doadora != -1){
                
                Cod.variaveis[Indice_recebe].valor = Cod.variaveis[Indice_doadora].valor;
                

                
                
            }else{
                
                
                Cod.variaveis[Indice_recebe].valor=Double.parseDouble(Cod.Cod[Cod.i][Cod.j]);
                
                
                
                
                
                
            }
            
            
            
        }else{
                    
                    
            //ERRO AO RECEBER VARIAVEL
                    
                    
                    
                    
                    
                    
                    
                    
                }
        
       


    }






}
    

