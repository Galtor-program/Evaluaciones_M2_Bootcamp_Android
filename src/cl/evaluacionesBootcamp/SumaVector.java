package cl.evaluacionesBootcamp;

import java.util.Scanner;

/**
 * @author Felipe Toro G.
 */
public class SumaVector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidadVector;
        int suma = 0;


        //Solicitamos los elementos del vector
        System.out.print("Ingrese la cuantos elementos desea: ");
        if (input.hasNextInt()) {
            cantidadVector = input.nextInt();
        } else {
            System.out.println("No ha ingresado un numero valido");
            return;
        }

        int[] vector = new int[cantidadVector];
        /**
         * Ciclo for para recorrer desde 0 hasta la cantidadVector
         */
        System.out.println("Ingrese " + cantidadVector + " Elementos :");
        for (int i = 0; i < cantidadVector; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            //vector toma el valor de la posicion i donde se va almacenar el elemento
            vector[i] = input.nextInt();
        }
        /**
         * Para realizar la suma de elemento por elemento
         */
        for (int i = 0; i < cantidadVector; i++) {
            suma += vector[i];
        }
        System.out.println("La suma de los elementos es: " + suma);
        input.close();

    }
}