public class Barbero extends Thread{
    
    private Barberia barberia;
    private boolean dormido;

    public Barbero(Barberia barberia, boolean dormido){
        this.barberia = barberia;
        this.dormido = dormido;
    }

    @Override 
    public void run(){
        while (true) {
            barberia.terminarCorte();
        }
    }
}
