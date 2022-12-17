package br.ufv.caf.atividadepoo;

public class VentiladorComLampada {
    private VentiladorTeto ventilador;
    private Lampada lampada;
    
    public VentiladorComLampada(){
        ventilador = new VentiladorTeto();
        lampada = new Lampada();
    }
    
    
    public void ligar(){
        ventilador.ligar();
    }
    
    public void desligar(){
        ventilador.desligar();
    }   
    
    public void aumentarVelocidade(){
        ventilador.aumentarVelocidade();
    }
    
    public void diminuirVelocidade(){
        ventilador.diminuirVelocidade();
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
