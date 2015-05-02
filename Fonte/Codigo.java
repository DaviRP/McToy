class Codigo{

    public String [][]Cod;
    public int i;
    public int j;

    public Variavel []variaveis=new Variavel[100];
    


    
    
    
    
    public void ImprimeCodigo(){
        
        int q=0;
        int k=0;
        
        
         while(this.Cod[k][q]!=null){
         
             while(this.Cod[k][q]!=null){
         
         
                 System.out.println(this.Cod[k][q]);
                 q++;
         
         
             }
         
             q=0;
             k++;
         
         
         }

        
        
        
        
        
    }







}