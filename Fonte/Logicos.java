//Classe de Responsalvel pela avalicao de exprecoes com valores
//logicos usadas em controle de fluxo e atribuicoes.:
class Logicos{
    
    public boolean DistribuidorLogico(Codigo Cod){//Classe principal de distruicao de Exprecoes, apenas retorna valore Booleanos
        
        if(Cod.Cod[Cod.i][Cod.j].contains("=")){
            if(Cod.Cod[Cod.i][Cod.j+2].contains(";")){//Em caso de atribuicao normal
                
            this.igual(Cod);
            
            }else{//Em caso de atribuicao com exprecoes matematicas
                Matematica M=new Matematica();
                
                Cod.variaveis[Cod.indiceVar(Cod.Cod[Cod.i][Cod.j-1])].valor=M.DistribuidorMatematico(Cod);
            }
            
        }else if(Cod.Cod[Cod.i][Cod.j].contains("<")){
            
            return menorQ(Cod);
            
        }else if(Cod.Cod[Cod.i][Cod.j].contains(">")){
            //negando a saida do metodo "Menos que" para obter um "Maior que"
            if(menorQ(Cod)==false){
                return true;
                }else{
                return false;
            }
        }
        
        return false;// restorna falso se a exprecao nao foi Compreendida ou usada com um simbolo invalido
    }

    
    public void igual(Codigo Cod){//Atribuicao simples com apenas um valor
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
                    
        //ERRO AO RECEBER VARIAVEL EROOOOOOOOOOOOOOO))()(;
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
    

