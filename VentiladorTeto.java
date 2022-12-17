package br.ufv.caf.atividadepoo;

public class VentiladorTeto {

    private boolean ligado;    
    private int velocidade;
    
    private final int MAX_VELOCIDADE = 10;
    
    public VentiladorTeto(){
        velocidade = 0;
        ligado = false;
    }
    
    public void ligar(){
        ligado = true;
        aumentarVelocidade();
    }
    
    public void desligar(){
        ligado = false;
        while(velocidade > 0)
            diminuirVelocidade();
    }   
    
    public void aumentarVelocidade(){
        if(ligado){
            if(velocidade 
                    < MAX_VELOCIDADE)
                velocidade++;
        }
    }
    
    public void diminuirVelocidade(){
        if(ligado){
            if(velocidade > 0)
                velocidade--;
        }
    }        
}
