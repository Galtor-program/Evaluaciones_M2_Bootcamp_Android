package cl.evaluacionesBootcamp;

import java.util.Scanner;

/**
 * @author Felipe Toro G.
 */
public class Operando {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int resultado;
        int cuadrado;
        String igualdad;

        Scanner input = new Scanner(System.in);

        //Solicitud de Datos
        System.out.println("Ingrese el primer numero: ");
        if (input.hasNextInt()) {
           numero1 = input.nextInt();
        } else {
            System.out.println("No ha ingresado un numero valido");
            return;
        }
        System.out.println("Ingrese el segundo numero: ");
        if (input.hasNextInt()) {
            numero2 = input.nextInt();
        } else {
            System.out.println("No ha ingresado un numero valido");
            return;
        }

        //operaciones
        resultado = numero1 + numero2;
        cuadrado = numero1 * numero1;

        //comprobacion de igualdad
        if( numero1 == numero2){
            igualdad = ("los numeros son iguales");

        } else {
            igualdad = ("los numeros no son iguales");
        }

        System.out.println("El resultado de la suma es: " + resultado+ ", El cuadrado del primer numero es: " + cuadrado+ ", y " +igualdad);









    }




}
