package cl.evaluacionesBootcamp;

import java.util.Scanner;

/**
 * @author Felipe Toro G.
 */
public class NumeroMayor {
    public static void main(String[] args) {
        //comprobacion de 2 numeros
        int numero1;
        int numero2;
        //solicitud datos por pantalla

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número :");
        if (input.hasNextInt()) {
            numero1 = input.nextInt();
        } else {
            System.out.println("No ha ingresado un número válido");
            return;
        }
        System.out.println("Ingrese el segundo número :");
        if (input.hasNextInt()) {
            numero2 = input.nextInt();
        } else {
            System.out.println("No ha ingresado un número válido");
            return;
        }

        //condicional
        if (numero1 > numero2) {
            System.out.println("El primer número es mayor");
        } else {
            System.out.println("El segundo número es mayor");
        }
        input.close();
    }
}
