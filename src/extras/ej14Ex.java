/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej14Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("ingresar la cantidad de familias:");
        int n = leer.nextInt();
        double edades = 0;
        double hijos = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("cuantos hijos tiene la familia " + i + "?");
            int m = leer.nextInt();
            for (int j = 0; j < m; j++) {
                System.out.println("ingresar la edad:");
                edades += leer.nextInt();
                hijos++;
            }
        }
        System.out.println("el promedio de las edades de los hijos es de: " + (edades / hijos));
    }
}