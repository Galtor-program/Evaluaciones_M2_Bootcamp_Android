package cl.evaluacionesBootcamp;

import java.util.Scanner;

/**
 * @author Felipe Toro G.
 */
public class Calculadora {
    public static void main(String[] args) {
        int opcion = 0;
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;

        Scanner input = new Scanner(System.in);
        /**
         * Menu
         */
        do {
            /**
             * try catch para revisar si las opciones son las correctas
             */
            try {
                System.out.println("Ingrese el primer numero:");
                numero1 = input.nextDouble();
                System.out.println("Ingrese el segundo numero:");
                numero2 = input.nextDouble();
                System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                System.out.println("▀Bienvenidos a calculadora▀");
                System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                System.out.println("■ Sus numeros son: " + numero1 + " y " + numero2);
                System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                System.out.println("▀ Seleccione la operacion ▀");
                System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                System.out.println("▀     1.- Suma            ▀");
                System.out.println("▀     2.- Resta           ▀");
                System.out.println("▀     3.- Multiplicacion  ▀");
                System.out.println("▀     4.- Division        ▀");
                System.out.println("▀     5.- Salir           ▀");
                System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        resultado = operacionSuma(numero1, numero2);

                        break;
                    case 2:
                        resultado = operacionResta(numero1, numero2);
                        break;
                    case 3:
                        operacionMultiplicacion(numero1, numero2);
                        break;
                    case 4:
                        resultado = operacionDivision(numero1, numero2);

                        break;
                    case 5:
                        System.out.println("╔═════════════════════════════════╗");
                        System.out.println("║ Usted ha finalizado el programa ║");
                        System.out.println("╚═════════════════════════════════╝");
                        break;
                    default:
                        System.out.println("La opcion ingresada no es valida");
                        break;
                }
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
                System.out.println("El resutado de la operacion es :" + resultado);
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");

            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }

        } while (opcion != 5);
        input.close();
    }

    /**
     * @param num1 recibe el primer numero
     * @param num2 recibe el segundo numero
     *             Se realiza una division, pero se comprueba que el segundo numero no sea cero, ya que no se puede divir un numero por cero.
     */
    private static double operacionDivision(double num1, double num2) {
        boolean sinCero = false;
        while (!sinCero) {
            if (num2 <= 0) {
                Scanner input = new Scanner(System.in);
                System.out.println("No se puede dividir por 0, porfavor elija otro numero :");
                num2 = input.nextDouble();
            } else {

                sinCero = true;
            }

        }
        return num1/num2;
    }


    /**
     *
     * @param num1 recibe el primer numero
     * @param num2 recibe el segundo numero
     *             
     */
    private static double operacionMultiplicacion(double num1, double num2) {
       return num1 * num2;
    }
    /**
     *
     * @param num1 recibe el primer numero
     * @param num2 recibe el segundo numero
     *             
     */
    private static double operacionResta(double num1,double num2) {
        return num1 - num2;
    }
    /**
     *
     * @param num1 recibe el primer numero
     * @param num2 recibe el segundo numero
     *             
     */

    private static double operacionSuma(double num1, double num2) {
        return  num1 + num2;
    }
}



