public class Fumador extends Thread{

    private  String ingredientes;
    private int munIngrediente;
    private Estanco estanco;

    public Fumador(String ingredientes, Estanco estanco){
        this.ingredientes = ingredientes;
        this.estanco = estanco;

        if (ingredientes.equals("papel")) {
            this.munIngrediente = 0;
        } else if (ingredientes.equals("tabaco")) {
            this.munIngrediente = 0;
        } else if (ingredientes.equals("cerilla")) {
            this.munIngrediente = 0;
        }
    }

    @Override 
    public void run(){

        while (true) {
            
            estanco.cogerIngrediente(this.munIngrediente);

            try {
                Thread.sleep(3000+(int)(Math.random()*3001));
            } catch (Exception e) {
                // TODO: handle exception
            }

            System.out.println("El fumador con " + this.ingredientes + " ha terminado de fumar." );
        }
    }
}