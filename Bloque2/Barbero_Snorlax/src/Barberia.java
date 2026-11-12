public class Barberia {
    
    int sala;
    private boolean silla = false;
    
    public synchronized void terminarCorte(){

        while (silla) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        System.out.println("El Barbero ha terminado de cortar.");
        silla = false;
        notifyAll();
    }

    public synchronized void entrar(){

        while (sala >= 1) {
            
        }
    }
}
