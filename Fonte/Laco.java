//Classe responsalvel pelo operador "Flip" funciona como um While
//A Classe trabalha com o codigo apena nos indices de inicio do laço ateo final
//chamando dentro dele mesmo uma Classe do tipo Interpretador para Interpretar o codigo
//contido dentro dos escopos do laço

class Laco{
    //variaveis que guardam o inicio do laço
    int flipI;
    int flipJ;
    
    public void Flip(Codigo Cod){
        
        Logicos L=new Logicos();
        Cod.j++;
        boolean expre = false;
        Interpretador InterInterpret=new Interpretador();
        
        if(Cod.Cod[Cod.i][Cod.j].contains("(")){// Analiza e expressao
            Cod.j+=2;
            expre=L.DistribuidorLogico(Cod);
            
                //Guarda o começo do laço
                this.flipI=Cod.i;
                this.flipJ=Cod.j;
                
                while(expre==true){
                    
                    while(Cod.Cod[Cod.i][Cod.j]!=null){
                        if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        
                            break;
                        }else if(Cod.Cod[Cod.i][Cod.j+1]==null){
                            Cod.i++;
                            Cod.j=0;
                        }else{
                            Cod.j++;
                        }
                    }
                
                    
                  
                    
                    
                    //Avisao para o interpretador que esta em um laço
                    InterInterpret.State=true;
                    
                    //interpreta o codigo que existe entre os escopos do laço ate o escopo correspondente
                    

                    InterInterpret.interpreta(Cod);
                    
                    Cod.i=flipI;
                    Cod.j=flipJ;
                    

                    
                    expre = L.DistribuidorLogico(Cod);
                }
            if(expre==false){// Caso a expressao nao seja verdadeira anda ate o escopo correspondente e devolve ao interpretador
                while(Cod.Cod[Cod.i][Cod.j]!=null){
                    if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        
                        break;
                        
                    }else if(Cod.Cod[Cod.i][Cod.j+1]==null){
                        Cod.i++;
                        Cod.j=0;
                    }else{
                        Cod.j++;
                    }
                }
                int CountE=0;
            
                while(Cod.Cod[Cod.i][Cod.j]!=null){
                    if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        
                        CountE++;
                    }else if(Cod.Cod[Cod.i][Cod.j].contains("}")){
                        CountE--;
                    }
                  
                    if(Cod.Cod[Cod.i][Cod.j].contains(";")||Cod.Cod[Cod.i][Cod.j+1]==null ||Cod.Cod[Cod.i][Cod.j]==null){
                        Cod.i++;
                        Cod.j=0;
                        if(CountE==0){
                            
                            break;
                            
                        }
                       
                        

                    }else{
                        Cod.j++;
                        
                        if(CountE==0){
                            
                            break;
                            
                        }
                        

                    }
                    
                }
            }
        }else{
            
            //ERRRROOORORORO
        }
        
    }
}
