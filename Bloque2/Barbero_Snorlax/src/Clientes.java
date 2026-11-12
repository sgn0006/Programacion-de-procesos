/**
 * Clientes
 */
public class Clientes extends Thread{

    
    private Barberia barberia;

    public Clientes(int sala, Barberia barberia){
        this.sala = sala;
        this.barberia = barberia;
    
    if (sala > 5) {
        sala = 5;
    }
    }

    @Override 
    public void run(){

        while (true) {
            
            barberia.entrar(this.sala);

            try {
                Thread.sleep(3000+(int)(Math.random()*3001));
            } catch (Exception e) {
                // TODO: handle exception
            }

            System.out.println("Un cliente ha entrado.");
        }
    }
    
}