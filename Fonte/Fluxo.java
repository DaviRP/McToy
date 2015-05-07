class Fluxo{

    public int state;


    public void True(Codigo Cod){
        
        Logicos L=new Logicos();
        Interpretador I=new Interpretador();
        Cod.j++;
        boolean expre=false;
        
        if(Cod.Cod[Cod.i][Cod.j].equals("(")){
            
            
            while(Cod.Cod[Cod.i][Cod.j]!=null){
                
                Cod.j++;
               expre = L.DistribuidorLogico(Cod);
                
                
                if(Cod.Cod[Cod.i][Cod.j].equals("{")){
                    
                    break;
                }
                
                
                
                
            }
            
            if(expre){
                
                
                I.interpreta(Cod);
                    
                    
                    
                    
            }else{
                
                while(Cod.Cod[Cod.i][Cod.j]!=null){
                    
                    if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        this.state++;
                    }
                    if(Cod.Cod[Cod.i][Cod.j].contains("}")){
                        
                        this.state--;
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
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
    }
    
}

   