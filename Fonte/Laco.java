class Laco{


   // int state=-1;
    
    int flipI;
    int flipJ;
    
    public void Flip(Codigo Cod){
        
        
        this.flipI=Cod.i;
        this.flipJ=Cod.j;
        
        
        Logicos L=new Logicos();
        Cod.j++;
        boolean expre = false;
        Interpretador I=new Interpretador();
        
        if(Cod.Cod[Cod.i][Cod.j].contains("(")){
            
            
            Cod.j+=2;
            expre=L.DistribuidorLogico(Cod);
            
            
        
              
            if(expre){
                    
                    
                    
                    while(Cod.Cod[Cod.i][Cod.j]!=null){
                    
                        if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        
                            Cod.Looping=1;
                            
                            break;
                        }
                    }
                
                    
                        
                    
                    
                
            }else{
                
                while(Cod.Cod[Cod.i][Cod.j]!=null){
                    
                    if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        Cod.Looping=0;
                        break;
                    }else{
                        Cod.j++;
                    }
                    
                    
                }
                
                while(Cod.Cod[Cod.i][Cod.j]!=null){
                    
                    if(Cod.Cod[Cod.i][Cod.j].contains("{")){
                        
                        Cod.Looping++;
                        
                    }
                    if(Cod.Cod[Cod.i][Cod.j].contains("}")){
                        
                        Cod.Looping--;
                        
                    }
                    
                    if(Cod.Cod[Cod.i][Cod.j].contains(";") || Cod.Cod[Cod.i][Cod.j].contains("{") || Cod.Cod[Cod.i][Cod.j].contains("}")){
                        
                        if(Cod.Looping==0){
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