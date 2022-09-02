/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej13Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la escalera");
         int num = leer.nextInt(); int cont=0;
         for (int i = 0; i < num; i++) {
             for (int j = 0; j < i+1; j++) {
                 cont++;
                 System.out.print(cont);
             }
             System.out.println("");
             cont=0;
         }
    }

}