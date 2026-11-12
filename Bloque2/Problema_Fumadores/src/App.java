public class App {
    public static void main(String[] args) throws Exception {

        Estanco estanco = new Estanco();
        
        Fumador fumadorPapel = new Fumador("papel", estanco);
        Fumador fumadorCerilla = new Fumador("tabaco",estanco);
        Fumador fumadorTabaco = new Fumador("cerilla",estanco);

        Estanquero estanquero = new Estanquero(estanco);

        fumadorPapel.start();
        fumadorCerilla.start();
        fumadorTabaco.start();
        estanquero.start();
    }
}
