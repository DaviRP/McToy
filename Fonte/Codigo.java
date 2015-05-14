//Classe incunbida de guardar as strings e variaveis dos codigo
//usada como parametro para maoria dos metodos.
//A classe tambem contem metodos de auxilio para o objeto.

class Codigo{
    //Matriz da liderança
    public String [][]Cod;
    //Indices da Matriz
    public int i;
    public int j;
    //Vetor de Variaveis limitado
    public Variavel []variaveis=new Variavel[100];
    public int VarAux;
    
    public void ImprimeCodigo(){//Funcao para imprimir a Matriz Cod[][]
        
        int q=0;
        int k=0;
        
        while(this.Cod[k][q]!=null){
             
             System.out.println("linha "+k);
         
             while(this.Cod[k][q]!=null){
                 System.out.println(this.Cod[k][q]);
                 q++;
             }
             q=0;
             k++;
        }
    }
    public int indiceVar(String Nome){//Acha o indice em que a variavel desejada, atraves da chamada do nome Obs: retorna -1 se
                                    //a varivel nao existir dentro do vetor
        String aux=Nome;
        
        if(aux.contains("$")){
            
            aux=aux.replace("$","");
        }
        
        int k;
        
        for(k=0;k<this.VarAux;k++){
            
            if(variaveis[k].nome.equals(aux)){
                
                return k;
            }
        }
        return -1;
    }
    public void ImprimeVars(){//imprime o Valor de todas as variaveis contidas no objedto
        
        int i;
        
        for(i=0;i<this.VarAux;i++){
            
            System.out.println(this.variaveis[i].nome + ":" + this.variaveis[i].valor);
        }
        
    }

}