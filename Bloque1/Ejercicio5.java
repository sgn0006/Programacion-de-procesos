// 4. Haz un menu de inicio que pregunte al usuario que programa desea lanzar, mostrandole una lista de 2 o 3 opciones.
// en funcion de la que el usuario elija , el programa lanzará un software u otro. Una vez lanzado, preguntará por consola si desea cerrarlo.
// Cuando el usuario escriba "si" en consola, java cerrará el proceso ejecutado.

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        try {

        Scanner sc = new Scanner(System.in);

        int opciones; 

        
            System.out.println("===== MENU=====");
            System.out.println("Que programa quieres lanzar? ");
            System.out.println("1. Calculadora");
            System.out.println("2. paint");
            System.out.println("3. Brave");
            System.out.println("4. salir");
            System.out.println("Elige una de las opciones: ");

            opciones = sc.nextInt(); 

            switch(opciones){
                case 1:
                    ProcessBuilder calculadora = new ProcessBuilder("calc");
                     Process procesoCalculadora = calculadora.start(); 
                    Thread.sleep(4000);
                    System.out.println("calculadora abierta, quieres cerarrla si o no? ");
                    String respuesta = sc.next();

                    if (respuesta.equalsIgnoreCase("si")) {
                        procesoCalculadora.destroy();
                        System.out.println("calculadora cerrada");
                    }
                    
                    break;

               case 2: 

               ProcessBuilder paint = new ProcessBuilder("paint");
                Process procesoPaint = paint.start();
                Thread.sleep(4000);
                System.out.println("paint abierto ");

                respuesta = sc.next();

                if (respuesta.equalsIgnoreCase("si")) {
                    procesoPaint.destroy();
                    System.out.println("cerrando paint");
                }

                break;

                case 3: 
                ProcessBuilder brave = new ProcessBuilder("brave");
                Process procesoBrave = brave.start();
                Thread.sleep(4000);
                System.out.println("brave abierto ");
                respuesta = sc.next();

                if (respuesta.equalsIgnoreCase("si")) {
                    procesoBrave.destroy();
                    System.out.println("cerrando brave");
                    
                }

                break;

                case 4: 

                System.out.println("saliendo... ");

                break;

                    default: 
                    System.out.println("elige una de las opciones correctas ");

                    break;

                } 
                sc.close();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        }

}
