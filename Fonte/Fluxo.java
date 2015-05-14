class Fluxo{

    public int state;


    public void True(Codigo Cod){
        
        Logicos L=new Logicos();
       
        Cod.j++;
        boolean expre=false;
        
        if(Cod.Cod[Cod.i][Cod.j].contains("(")){
            
            Cod.j+=2;
                       
               expre = L.DistribuidorLogico(Cod);
                
                
              
            if(expre){
                
                
                //Volta para a classe que o chamou
                
                    
                    
            }else{
                
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
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
    }
    
}

   