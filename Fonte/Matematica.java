class Matematica{

    
    public double value;
    
    
    
    public double DistribuidorMatematico(Codigo Cod){
        
        
        while(Cod.Cod[Cod.i][Cod.j]!=null){
            Cod.j++;
            
            
            if(Cod.Cod[Cod.i][Cod.j].contains("+")){
                
                this.somador(Cod);
                
                
            }else if(Cod.Cod[Cod.i][Cod.j].contains("^")){
                
                this.subtrair(Cod);
            
            
            
            
            
            }else if(Cod.Cod[Cod.i][Cod.j].contains("*")){
                
                
                this.multiplicador(Cod);
            
            
        
            }else if(Cod.Cod[Cod.i][Cod.j].contains("/")){
                this.divisor(Cod);
            
            
            
        
            }else if(Cod.Cod[Cod.i][Cod.j].contains(";")){
               Cod.j--;
                return value;
                
                
                
            }else if(Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])!=-1){
                
                value=Cod.variaveis[Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])].valor;
               
            
                
            }else if(Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])==-1){
                
            
                this.value=Double.parseDouble(Cod.Cod[Cod.i][Cod.j]);
                
            
            
            }
            
            
            
        
            
        
        }
        return value;
        
        
    }
        
    public void somador(Codigo Cod){
            
            Cod.j++;
            
            if(Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])!=-1){
                
                this.value += Cod.variaveis[Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])].valor;
                
                
                
                
                
            }else{
                
                this.value += Double.parseDouble(Cod.Cod[Cod.i][Cod.j]);
                
            }
            
            
            
            
            
            
            
    }
    public void multiplicador(Codigo Cod){
        
        Cod.j++;
        if(Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])!=-1){
            
            this.value *= Cod.variaveis[Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])].valor;
            
            
        }else{
            
            this.value *= Double.parseDouble(Cod.Cod[Cod.i][Cod.j]);
            
            
        }
        
        
        
        
        
    }
    
    public void divisor(Codigo Cod){
        
        Cod.j++;
        
        if(Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])!=-1){
            
            
            this.value /= Cod.variaveis[Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])].valor;
            
            
            
        }else{
            
            this.value /= Double.parseDouble(Cod.Cod[Cod.i][Cod.j]);
            
            
        }
        
        
        
        
        
        
        
        
    }
    
    public void subtrair(Codigo Cod){
        
        Cod.j++;
        
        
        if(Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])!=-1){
            
            
            this.value -=Cod.variaveis[Cod.indiceVar(Cod.Cod[Cod.i][Cod.j])].valor;
            
            
            
        }else{
            
            this.value -=Double.parseDouble(Cod.Cod[Cod.i][Cod.j]);
            
        }
        
        
        
    }
        
        
        
    
    
    
    

}