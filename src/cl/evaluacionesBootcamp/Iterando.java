package cl.evaluacionesBootcamp;

/**
 * @author Felipe Toro G.
 */
public class Iterando {
    public static void main(String[] args) {

        int f = 0;
        int i=0;
        int suma = 0;
        int suma2 = 0;
        int suma3 = 0;
        // iterando con while
        while (i <= 10) {
            suma = suma + i;
            i++;
            System.out.println("La suma es: " +suma);

        }
        //iterando con do while
        do {
            suma2 =  suma2 + f;
            f++;
            System.out.println("La suma con do while es: " +suma2);

        } while ( f <= 10);

        //iterando con for
        for(int j =0; j <= 10; j++){
            suma3 = suma3 + j;
            System.out.println("La suma con for es: " +suma3);

        }

    }




}
