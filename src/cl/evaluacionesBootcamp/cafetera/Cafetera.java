package cl.evaluacionesBootcamp.cafetera;

import java.util.Scanner;

/**
 * @author Felipe Toro G.
 */
public class Cafetera {
    public static void main(String[] args) {
        int capacidad = 2000;
        int capacidadOcupada = 600;
        int opcion;
        int llenado = 0;
        int taza = 0;
        boolean flag = false;


        Scanner input = new Scanner(System.in);
        //inciamos nuestra cafetera con los valores de capacidad y cuanto tiene hasta el momento
        CafeteraInicial cafeteraInicial = new CafeteraInicial(capacidad, capacidadOcupada);
        while (flag == false) {
           try {
               System.out.println("Bienvenido a cafetera");
               System.out.println("╔════════════════════════════╗");
               System.out.println("║ Que desea hacer?           ║");
               System.out.println("║ 1.- Llenar Cafetera        ║");
               System.out.println("║ 2.- Agregar Café           ║");
               System.out.println("║ 3.- Servir una taza        ║");
               System.out.println("║ 4.- Vaciar la cafetera     ║");
               System.out.println("║ 5.- Salir                  ║");
               System.out.println("╚════════════════════════════╝");
               System.out.println("╔════════════════════════════════════════╗");
               System.out.println("║ La capicadad máxima es: " + capacidad + "           ║");
               System.out.println("║ Usted tiene  " + cafeteraInicial.getCantidadActual() + " de cafe ");
               System.out.println("╚════════════════════════════════════════╝");
               System.out.println("Ingrese opción");
               opcion = input.nextInt();

               switch (opcion) {
                   case 1:
                       cafeteraInicial.llenarCafetera();
                       break;
                   case 2:
                       System.out.println("Con cuanto café desea llenar la cafetera?");
                       llenado = input.nextInt();
                       cafeteraInicial.agregarCafe(llenado);
                       break;
                   case 3:
                       System.out.println("Cual es el tamano de la taza?");
                       taza = input.nextInt();
                       cafeteraInicial.servirTaza(taza);
                       break;


                   case 4:
                       System.out.println("Usted ha vaciado por completo la cafetera");
                       cafeteraInicial.vaciarCafetera();
                       break;
                   case 5:
                       flag = true;
                       break;
                   default:
                       System.out.println("Opcion incorrecta");
                       break;
               }
           } catch (Exception e) {
                System.out.println("Error " + e.getMessage());

           }
        input.close();
        }


    }
}
