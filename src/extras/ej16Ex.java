/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej16Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                String nombre;
        int edad;
        String opc;
        do {
            System.out.println("ingresar el nombre:");
            nombre = leer.next();
            System.out.println("ingresar la edad");
            edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");

            }
            System.out.println("desea seguir? (si/no)");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("si"));
    }

}