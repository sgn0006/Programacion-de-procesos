

public class hilo extends Thread {
    
     int[] array;
     int principio;
     int finall;
     long suma;

    

    public hilo(int[] array, int principio, int finall, long suma ){

        this.array = array;
        this.principio = principio;
        this.finall = finall;
        this.suma = suma;

    }

    @Override 

    public void run(){

        long antesSuma = System.currentTimeMillis();

        try{

            for (int i = principio; i < finall; i++) {
                
                suma += array[i];
            }

            long finalSuma = System.currentTimeMillis();
            System.out.println("suma total " + (antesSuma+finalSuma));

        } catch(Exception e){
            e.getMessage();
        }
    }

}
