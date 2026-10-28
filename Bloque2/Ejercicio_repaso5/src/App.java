/*
Crea un programa que genere un array de 1.000.000 de números enteros aleatorios y calcule su suma utilizando cuatro hilos.
Debe contener:
- Un array de enteros.
- Un índice inicial.
- Un índice final.
- Un atributo para guardar la suma parcial.
Crea un constructor que reciba estos datos.

El método run() debe:
1. Recorrer la parte del array que le corresponda.
2. Sumar los elementos de ese intervalo.
3. Guardar el resultado en el atributo de suma parcial.
4. Mostrar la suma parcial calculada por ese hilo.
Clase App.java
1. Crear un array de 1.000.000 de enteros.
2. Rellenarlo con números aleatorios entre 0 y 99.
3. Medir el tiempo que tarda en generarse.
4. Dividir el array en cuatro partes iguales.
5. Crear cuatro objetos de la clase Sumador, uno para cada parte.
6. Iniciar los cuatro hilos.
7. Esperar a que todos terminen utilizando join().
8. Sumar los cuatro resultados parciales.
9. Mostrar la suma total y el tiempo empleado.
Condiciones importantes
- Cada hilo debe recorrer únicamente su parte del array.
- No debes utilizar un único bucle para calcular toda la suma.
- El resultado final debe coincidir con la suma de todos los elementos del array.
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
