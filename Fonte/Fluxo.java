//Classe responsavel pelo controle de Fluxo do codigo "True?"
//A funcao principal de Laço recebe como parametro um Objeto do tipo
//Codigo e devolve aonde ele deve continuar

class Fluxo{

    public int state;
    
    public void True(Codigo Cod){
        
        Logicos L=new Logicos();
        Cod.j++;
        boolean expre=false;
        
        if(Cod.Cod[Cod.i][Cod.j].contains("(")){//Acha o começo da exprecao e o operador logico
            
            Cod.j+=2;
                       
            expre = L.DistribuidorLogico(Cod);
                
            if(expre){
                //Volta para a classe que o chamou
            }else{//Se a conteudor for falso caminha entre os indices ate achar o escopo da "True?" chamado no metodo
                
                while(Cod.Cod[Cod.i][Cod.j]!=null){
                    
                    if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        break;
                    }
                    if(Cod.Cod[Cod.i][Cod.j]==null){
                        Cod.i++;
                        Cod.j=0;
                        
                    }else{
                        Cod.j++;
                    }
                    
                    
                }
                while(Cod.Cod[Cod.i][Cod.j]!=null){
                    
                    if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        this.state++;
                    }
                    if(Cod.Cod[Cod.i][Cod.j].contains("}")){
                        
                        this.state--;
                    }
                    if(this.state==0){
                        break;
                    }
                    if(Cod.Cod[Cod.i][Cod.j].equals(";") || Cod.Cod[Cod.i][Cod.j].equals("{") || Cod.Cod[Cod.i][Cod.j].equals("}")){
                        
                        Cod.j=0;
                        Cod.i++;
                    }else{
                        Cod.j++;
                    }
                }
                
            }
            
            
            
                
        }else{
                //ERROOOOOOO
        }
        
    }
    
}

   