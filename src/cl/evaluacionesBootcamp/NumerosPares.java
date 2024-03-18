package cl.evaluacionesBootcamp;

/**
 * @author Felipe Toro G.
 */

public class NumerosPares {
    public static void main(String[] args) {
        //utilizacion de bucle for
        for(int i =0; i<=100; i++){
            //condicion simple para revisar si un numero es par el resto debe ser 0
            if(i % 2 ==0){
                System.out.println("El numero par es:"+i);
            }

        }
    }
}
