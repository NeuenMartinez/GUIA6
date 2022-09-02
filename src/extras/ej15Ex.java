/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej15Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean exit = false;
        System.out.println("INGRESAR 2 NUMEROS");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        double division = 0;
        System.out.println("MENU\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n"
                + "Elija opción:");
        do {
            int eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    suma = sumar(num1,num2,suma);
                    System.out.println("SUMA = " + suma);
                    break;
                case 2:
                    resta = resta(num1,num2,resta);
                    System.out.println("RESTA = " + resta);
                    break;
                case 3:
                    multiplicacion = multiplicacion(num1,num2,multiplicacion);
                    System.out.println("MULTIPLICACION = " + multiplicacion);
                    break;
                case 4:
                    division = division(num1,num2,division);
                    System.out.println("DIVISION = " + division);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String confirmacion = leer.next();
                    if (confirmacion.equalsIgnoreCase("s")) {
                        exit = true;
                        break;
                    } else;
                    exit = false;
                    break;
                default:
                    System.out.println("LA OPCION INGRESADA NO ES VALIDA");
                    break;
            }
        } while (exit == false);
    }
    public static int sumar(int num1,int num2,int suma){
        suma = num1 + num2;
        return suma;
        
    }
    public static int resta(int num1,int num2,int resta){
        resta = num1 - num2;
        return resta;
        
    }
    public static int multiplicacion(int num1,int num2,int multiplicacion){
        multiplicacion = num1 * num2;
        return multiplicacion;
        
    }
    public static int division(int num1,int num2,double division){
        division = num1 / num2;
        return (int) division;
    }
}
