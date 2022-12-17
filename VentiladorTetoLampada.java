package br.ufv.caf.atividadepoo;

public class VentiladorTetoLampada {

    private boolean ligado;    
    private int velocidade;
    private Lampada lampada;
    
    private final int MAX_VELOCIDADE = 10;
    
    public VentiladorTetoLampada(){
        velocidade = 0;
        ligado = false;
        lampada = new Lampada();
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
    
    public void acenderLampada(){
        this.lampada.acender();
    }
    
    public void apagarLampada(){
        this.lampada.apagar();
    }
    
    public void aumentarIntensidadeLampada(){
        this.lampada.aumentarIntensidade();
    }
    
    public void diminuirIntensidadeLampada(){
        this.lampada.diminuirIntensidade();
    }
    
    
    
}
