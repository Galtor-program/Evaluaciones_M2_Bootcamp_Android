package cl.evaluacionesBootcamp;

import java.util.Scanner;

/**
 * @author Felipe Toro G.
 */
public class Conversor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double resultado = 0;
        double eurosIngresados;
        int opcion;

        //solicitamos la cantidad en euros
        System.out.println("Ingrese la cantidad de euros para la conversion :");
        if (input.hasNextDouble()) {
            eurosIngresados = input.nextDouble();
        } else {
            System.out.println("No ha ingresado un numero valido");
            return;
        }
        //creamos un menu para la conversion
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■ Ingrese la conversion  ■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■ 1.- convertir a libras ■");
        System.out.println("■ 2.- convertir a dolar  ■");
        System.out.println("■ 3.- convertir a yenes  ■");
        System.out.println("Ingrese numero de opcion: ");
        if (input.hasNextInt()) {
            opcion = input.nextInt();
        } else {
            System.out.println("No ha ingresado un numero valido");
            return;
        }
        /**
         * Menu de seleccion
         */
        switch (opcion) {
            case 1:
                resultado = convertirALibras(eurosIngresados);
                break;
            case 2:
                resultado = convertirADolar(eurosIngresados);
                break;
            case 3:
                resultado = convertirAYenes(eurosIngresados);

            default:
                System.out.println("Opcion ingresada es invalida");
                break;
        }
        System.out.println("El resultado es: " + resultado);
        input.close();

    }

    /**
     *
     * @param eurosIngresados recibimos los euros ingresados por pantalla
     * @return retonarmos la conversion a yenes
     */
    private static double convertirAYenes(double eurosIngresados) {
        return eurosIngresados * 129.852;
    }

    /**
     *
     * @param eurosIngresados recibimos los euros ingresados por pantalla
     * @return retornamos la conversion a dolar
     */
    private static double convertirADolar(double eurosIngresados) {
        return eurosIngresados * 1.28611;
    }

    /**
     *
     * @param eurosIngresados recibimos los euros ingresados por pantalla
     * @return retornamos la conversion a dolar
     */
    private static double convertirALibras(double eurosIngresados) {
        return eurosIngresados * 0.86;
    }


}


