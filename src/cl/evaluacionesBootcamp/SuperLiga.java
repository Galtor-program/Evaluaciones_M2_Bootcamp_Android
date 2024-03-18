package cl.evaluacionesBootcamp;

import java.util.Scanner;

public class SuperLiga {
    public static void main(String[] args) {
        /**
         * @author Felipe Toro
         */
        int partidosGanados;
        int partidosEmpatados;
        int partidosPerdidos;
        int resultadoGanados = 0;
        int resultadoEmpatados = 0;

        Scanner input = new Scanner(System.in);

        //Solicitud de datos por pantalla
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■  Bienvenido resumen de puntaje  ■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("Porfavor ingrese los partidos ganados : ");
        //comprobacion de que sea un numero
        if(input.hasNextInt()){
            partidosGanados=input.nextInt();
        }else{
            System.out.println("No ha ingresado un numero valido");
            return;
        }
        System.out.println("Porfavor ingrese los partidos empatados : ");
        if(input.hasNextInt()){
            partidosEmpatados=input.nextInt();
        }else{
            System.out.println("No ha ingresado un numero valido");
            return;
        }
        System.out.println("Porfavor ingrese los partidos perdidos : ");
        if(input.hasNextInt()){
            partidosPerdidos=input.nextInt();
        }else{
            System.out.println("No ha ingresado un numero valido");
            return;
        }
        //logica de desarrollo partidos ganados
        for( int i = 0; i < partidosGanados; i++){
            resultadoGanados = resultadoGanados +3;
        }
        //logica de desarrollo partidos empatados
        for( int i = 0; i < partidosEmpatados; i++){
            resultadoEmpatados = resultadoEmpatados + 1;
        }

        //Despliegue de resultados
        System.out.println("╔════════════════════╗");
        System.out.println("║ PG   ║  PE   ║ PP  ║");
        System.out.println("║════════════════════║");
        System.out.println("║"+resultadoGanados+"    ║  " + resultadoEmpatados+"    ║ "+ partidosPerdidos +"   ║");
        System.out.println("║════════════════════║");
        System.out.println("║Total pts: " + (resultadoGanados + resultadoEmpatados) +"       ║");
        System.out.println("╚════════════════════╝");
    input.close();
    }

}
