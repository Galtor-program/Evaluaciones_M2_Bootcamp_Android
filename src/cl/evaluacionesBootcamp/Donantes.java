package cl.evaluacionesBootcamp;

import java.util.Scanner;

/**
 * author Felipe Toro G.
 */
public class Donantes {
    public static void main(String[] args) {
        //vamos a solicitar la informacion de los donantes
        int edad = 0;
        double peso = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su edad: " );
        edad = input.nextInt();
        System.out.println("Ingrese su peso");
        peso = input.nextDouble();

        //realizaremos las condicionales

        if (edad >= 18 && edad <= 65 ){
            if ( peso >= 50){
                System.out.println("Usted cumple con la edad y peso para donar");

            }else{
                System.out.println("Usted cumple con la edad, pero no con el peso para donar");
            }

        }else{
            System.out.println("Usted no cumple con la edad mínima para donar");
        }

    }
}
