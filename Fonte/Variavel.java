class Variavel{


    public String nome;
    private double valor;








    public Variavel(String N){

        this.nome=N;
        this.valor=0;
    }

    public boolean ExisteVar(String nome,Variavel var[]){
        
        int k=0;
        String aux=nome;
        
        if(aux.contains("$")){
            
            aux=aux.replace("$","");
            
        }

        for(k=0;k < var.length;k++){
            
            if(var[k].nome.equals(aux)){
                return true;
            }
        
            
        }
        
        
        
        return false;
        
    }



    public String getNome(){

        return this.nome;

    }
    public void setNome(String N){

        this.nome=N;

    }
    public double getValor(){

        return this.valor;


    }
    public void setValor(double N){


        this.valor=N;


    }






}
