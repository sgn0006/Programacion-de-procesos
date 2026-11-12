
public class Estanco {

    private  boolean hayIngredientes = false;
    String[] ingredientes = {"papel", "tabaco", "cerilla"};
    int ingredienteGenerado1, ingredienteGenerado2;
    
    public synchronized void reponerIngrediente(){
        
        while (hayIngredientes) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        ingredienteGenerado1 = (int) (Math.random() * 3);
        do{
            ingredienteGenerado2 = (int) (Math.random() * 3);
        } while (ingredienteGenerado1 == ingredienteGenerado2);

        System.out.println("Estanquero coloca el ingrediente: " + ingredientes[ingredienteGenerado1]);
        System.out.println("Estanquero coloca el ingrediente: " + ingredientes[ingredienteGenerado2]);

        hayIngredientes = true;
        notifyAll();
    }


    public synchronized void cogerIngrediente(int ingredienteFumador) {

        while (!hayIngredientes || ((ingredienteGenerado1 == ingredienteFumador) 
            || (ingredienteGenerado2 == ingredienteFumador))) {
            
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        System.out.println("Fumador con " + ingredientes[ingredienteFumador] + " coge " 
        + ingredientes[ingredienteGenerado1] + " y " + ingredientes[ingredienteGenerado2]
    + " y se pone a fumar.");
    
        hayIngredientes = false;
        notifyAll();
    }


}