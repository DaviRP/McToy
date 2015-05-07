class Codigo{

    public String [][]Cod;
    public int i;
    public int j;

    public Variavel []variaveis=new Variavel[100];
    public int VarAux;
    


    
    
    
    
    public void ImprimeCodigo(){
        
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
    public int indiceVar(String Nome){
        
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
    
    
    public void ImprimeVars(){
        
        int i;
        
        for(i=0;i<this.VarAux;i++){
            
            System.out.println(this.variaveis[i].nome + ":" + this.variaveis[i].valor);
            
            
        }
        
        
    }







}