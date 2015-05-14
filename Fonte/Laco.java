class Laco{

    int flipI;
    int flipJ;
    
    public void Flip(Codigo Cod){
        
        Logicos L=new Logicos();
        Cod.j++;
        boolean expre = false;
        Interpretador I=new Interpretador();
        
        if(Cod.Cod[Cod.i][Cod.j].contains("(")){
            
            
            Cod.j+=2;
            expre=L.DistribuidorLogico(Cod);
            
            
        
              
            if(expre){
                
                this.flipI=Cod.i;
                this.flipJ=Cod.j;
                
                while(expre){
                    
                    
                    
                
                    I.State=true;
                    
                    while(Cod.Cod[Cod.i][Cod.j]!=null){
                    
                        if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                            
                            break;
                            
                        }else if(Cod.Cod[Cod.i][Cod.j]==null){
                            Cod.i++;
                            Cod.j=0;
                        }else{
                            Cod.j++;
                        }
                    
                    }
                    
                    if(Cod.Cod[Cod.i][Cod.j+1]==null){
                        Cod.i++;
                        Cod.j=0;
                    }else{
                        Cod.j++;
                    }
                    
                    I.Scope++;
                    
                    I.interpreta(Cod);
                    
                    
                    
                    
                    Cod.i=flipI;
                    Cod.j=flipJ;
                    
                    expre = L.DistribuidorLogico(Cod);
            
                
                
                    
                }
                
                    
                        
                    
                    
                
            }
            if(expre==false){
                
                while(Cod.Cod[Cod.i][Cod.j]!=null){
                    
                    if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        
                        break;
                    }else{
                        Cod.j++;
                    }
                    
                    
                }
                int CountO=0;
                int CountU=0;
                
                while(Cod.Cod[Cod.i][Cod.j]!=null){
                    
                    if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        
                        CountO++;
                        
                    }
                    if(Cod.Cod[Cod.i][Cod.j].contains("}")){
                        
                        CountU--;
                        
                    }
                    
                    if(Cod.Cod[Cod.i][Cod.j].contains(";") || Cod.Cod[Cod.i][Cod.j].contains("{") || Cod.Cod[Cod.i][Cod.j].contains("}")){
                        
                        if(CountU==0){
                            break;
                            
                        }
                        Cod.i++;
                        Cod.j=0;
                        
                        
                        
                        
                    }else{
                        
                        Cod.j++;
                    }
                    
                    
                    
                }
                
                
                
                
                
            }
            
            
            
            
            
            
            
            
            
            
            
            
        }else{
            
            //ERRRROOOROROROROR
            
            
            
        }
        
        
        
        
        
        
        
        
        
    }
    









}