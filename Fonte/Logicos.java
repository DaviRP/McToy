
class Logicos{
    
    
    
    
    
    public boolean DistribuidorLogico(Codigo Cod){
        
        
        if(Cod.Cod[Cod.i][Cod.j].contains("=")){
            if(Cod.Cod[Cod.i][Cod.j+2].contains(";")){
                
            this.igual(Cod);
            
            }else{
                //ATRIBUICAO RESULTANTE DE UM OPERACAO MATEMATICA
                
            }
            
            
            
            
        }else if(Cod.Cod[Cod.i][Cod.j].contains("<")){
            
            
            return menorQ(Cod);
            
            
        
        }
        
        
        
        
        return false;
        
        
    }





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
    
    public boolean menorQ(Codigo Cod){
        
        
        int Indi1 = Cod.indiceVar(Cod.Cod[Cod.i][Cod.j-1]);
        int Indi2  = Cod.indiceVar(Cod.Cod[Cod.i][Cod.j+1]);
            
            
        if(Indi1!=-1 && Indi2 !=-1){
            
            if(Cod.variaveis[Indi1].valor < Cod.variaveis[Indi2].valor){
                
                return true;
        }else{
                return false;
            }
            
            
        
        }else if(Indi1 == -1 && Indi2 !=-1){
            
            double valor1 = Double.parseDouble(Cod.Cod[Cod.i][Cod.j-1]);
                                               
            if(valor1 < Cod.variaveis[Indi2].valor){
                
                return true;
                
            }else{
                return false;
                    
                }
            
                                               
            
                                               
                    
            }else if(Indi1!=-1 && Indi2==-1){
                
                double valor2 = Double.parseDouble(Cod.Cod[Cod.i][Cod.j+1]);
                                                   
                if(valor2 > Cod.variaveis[Indi1].valor){
                    
                        return true;
                                                       
                }else{
                        return false;
                                                       
                }

                
                
                                                   
                }else{
                    
                    double valor1 = Double.parseDouble(Cod.Cod[Cod.i][Cod.j-1]);
                    double valor2 = Double.parseDouble(Cod.Cod[Cod.i][Cod.j+1]);
                                                       
                    if(valor1 < valor2){
                        
                        return true;
                                                           
                    }else{
                        return false;
                    }
                    
            }
                    
                                                       
    }
    
}
    

