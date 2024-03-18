package cl.evaluacionesBootcamp;

import java.util.Scanner;

/**
 * @author Felipe Toro G.
 */
public class Arreglando {
    public static void main(String[] args) {
        //difinir arreglo
        int [] numeros = new int [3];
        int numero;

        Scanner input = new Scanner(System.in);
        //recorrer arreglo
        for (int i = 0; i < 3; i++) {
            //ingreso de numero
            System.out.println("Ingrese el número" + (i + 1) + ": ");
            //validar que sea un numero
            if (input.hasNextInt()) {
                numero = input.nextInt();
                numeros[i] = numero;

            } else {
                System.out.println("No ha ingresado un número válido");
                return;
            }
            //recorrer el arreglo
            //asumiremos que el mayor se encuentra en la posicion 0 y ahi empezaremos a comprar
            //con las siguientes posiciones
        }
            int numeroMayor = numeros[0];
            for( int i = 0; i < numeros.length; i++){
                if(numeros[i] > numeroMayor){
                    numeroMayor= numeros[i];

            }

        }
        System.out.println("El número mayor del arreglo es: " +numeroMayor);
        input.close();

    }
}
