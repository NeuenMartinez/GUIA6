/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej7Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR LA CANTIDAD DE NUMEROS");
        int n = leer.nextInt();
        if (n > 0){
        int max = 0;
        int min = 999999;
        int prom = 0;
        int aux = 0;
        int aux2 = 0;
        int aux3 = 0;
        System.out.println("PARA REALIZAR EL PROCEDIMIENTO A TRAVES DE UN BUCLE WHILE PULSE 1");
        System.out.println("PARA REALIZAR EL PROCEDIMIENTO A TRAVES DE UN BUCLE DO WHILE PULSE 2");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                System.out.println("INGRESAR LOS DATOS");
                System.out.println("(los numeros ingresados tienen que ser mayores a 0)");
                while (aux != n) {
                    aux2 = leer.nextInt();
                    aux3 = aux2;
                    if (aux2 < 0) {
                        break;
                    } else if (aux2 > max) {
                        max = aux2;
                    } else if (aux3 < min) {
                        min = aux3;
                    }
                    prom += aux2;
                    aux++;
                }
                if (aux2 <= 0) {
                    System.out.println("el numero ingresado en incorrecto y se finalizara el programa");
                } else {
                    System.out.println("EL NUMERO MAYOR INGRESADO ES: " + max);
                    System.out.println("EL NUMERO MENOR INGRESADO ES: " + min);
                    System.out.println("EL PROMEDIO DE LOS NUMEROS INGRESADOS ES DE: " + (prom / aux));
                }
                break;
            case 2:
                do {
                    System.out.println("INGRESAR LOS DATOS");
                    System.out.println("(los numeros ingresados tienen que ser mayores a 0)");
                    aux2 = leer.nextInt();
                    aux3 = aux2;
                    if (aux2 < 0) {
                        break;
                    } else if (aux2 > max) {
                        max = aux2;
                    } else if (aux3 < min) {
                        min = aux3;
                    }
                    prom += aux2;
                    aux++;

                } while (aux != n);
                if (aux2 <= 0) {
                    System.out.println("el numero ingresado en incorrecto y se finalizara el programa");
                } else {
                    System.out.println("EL NUMERO MAYOR INGRESADO ES: " + max);
                    System.out.println("EL NUMERO MENOR INGRESADO ES: " + min);
                    System.out.println("EL PROMEDIO DE LOS NUMEROS INGRESADOS ES DE: " + (prom / aux));
                }
                break;
            default:
                System.out.println("LA OPCION INGRESADA NO EXISTE");
        }
        } else {
            System.out.println("el numero ingresado no es valido");
        }
    }
}
