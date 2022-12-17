package br.ufv.caf.atividadepoo;

public class Lampada {
    private boolean acesa;
    private int intensidade;
    private final int MAX_INTENSIDADE = 10;
    
    public Lampada(){
        intensidade = 0;
        acesa = false;        
    }
    
    public void acender(){
        acesa = true;
        aumentarIntensidade();
    }
    
    public void apagar(){
        acesa = false;
        while(intensidade > 0)
            diminuirIntensidade();
    }
    
    public void aumentarIntensidade(){
        if(acesa){
            if(intensidade < MAX_INTENSIDADE)
                intensidade++;
        }
    }
    
    public void diminuirIntensidade(){
        if(acesa){
            if(intensidade > 0)
                intensidade--;            
        }
    }    
}
