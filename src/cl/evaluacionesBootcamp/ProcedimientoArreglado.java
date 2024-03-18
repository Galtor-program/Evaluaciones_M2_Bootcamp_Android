package cl.evaluacionesBootcamp;

/**
 * @autor Felipe Toro G.
 */
public class ProcedimientoArreglado {
    public static void main(String[] args) {

        //arreglo unidimensional
        String [] miArreglo ={"Uno", "Dos","Tres","Cuatro","Cinco"};

        //llamamos al metodo que recorre el arreglo
        mostrarArreglo(miArreglo);
    }

    /**
     *
     * @param miArreglo recibimos los elementos del arreglo
     */
    private static void mostrarArreglo(String[] miArreglo) {
        for(int i =0; i < miArreglo.length; i++){
            System.out.println("El elemento" + (i +1) + " es :" +miArreglo[i]);
        }
    }
}
