public class Humedad extends Thread{
    
    private int humedades;

    public Humedad(int humedades){

      this.humedades = humedades;
    }

    @Override 
    public void run(){

        try{

            for (int i = 0; i < 3; i++) {
                Thread.sleep(6000);

                int cambio = (int)(Math.random()*4);

                if (Math.random() <0.5) {
                    humedades += cambio;
                } else {
                    humedades -= cambio;
                }

                if (humedades > 0 || humedades <100) {
                    System.out.println("Lectura de humedad relativa: " + humedades + " %");
                } else{
                    System.out.println("sensor de temperatura apagado por valor fuera de rango");
                }
            }


        }catch(Exception e){
            e.getMessage();
        }
    }
}
