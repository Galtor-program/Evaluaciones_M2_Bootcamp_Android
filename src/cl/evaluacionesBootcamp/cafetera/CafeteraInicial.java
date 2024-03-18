package cl.evaluacionesBootcamp.cafetera;

import java.util.Scanner;

/**
 * @author Felipe Toro G.
 */
public class CafeteraInicial {
    private int capacidadMaxima;
    private int cantidadActual;

    //constructor vacio
    public CafeteraInicial() {
    }

    /**
     *
     * @param capacidad recibe la capacidad indicada al crear la nueva cafetera
     * @param capacidadOcupada recibe la cantidad con la cuenta la cafetera al ser creada
     */
    public CafeteraInicial(int capacidad, int capacidadOcupada) {
        this.capacidadMaxima = capacidad;
        this.cantidadActual = capacidadOcupada;
    }


    //getters y setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    /**
     * Metodo para llenar la cafetera donde igualamos la cantidad actual a la capacidad maxima
     */
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera cuenta con la cantidad máxima la cuál es: " +cantidadActual);
        return;

    }

    /**
     *
     * @param i aca recibimos la capacidad de cafe de la taza
     */
    public void servirTaza(int i) {
        //agregamos un scanner para presionar ENTER y poder ver el dato sin que se pierda en pantalla
        Scanner input = new Scanner(System.in);
        if (cantidadActual >= i){
            cantidadActual -= i;
            System.out.println("Usted sirvio una taza de café");
            System.out.println("El café restante es: " +cantidadActual);
            System.out.println("Presione Enter para continuar");
            input.nextLine();

        }else{

            System.out.println("No hay suficiente cafe en la cafetera");
            //aca mostramos con cuanto se lleno la taza e igualamos a 0 la cantidad actual
            System.out.println("solo se lleno la taza con: " +cantidadActual);
            cantidadActual=0;
            System.out.println("Presione Enter para continuar");
            input.nextLine();

        }
        input.close();

    }

    /**
     *
     * @param i aca recibimos la cantidad de cafe que deseamos agregar a la cafetera
     */
    public void agregarCafe(int i) {
        int suma;
        suma = cantidadActual + i;
        if(suma > 2000){
            System.out.println("No puede ingresar mayor cantidad que la capacidad");

        }else {

            System.out.println("Se han agragado: " + i + " de cafe, el contenedor tiene ahora: " + suma + " de café");
        }
    }

    /**
     * En este metodo dejamos la cantidad actual igualada a 0 vaciando completamente la cafetera
     */
    public void vaciarCafetera() {
        cantidadActual=0;
        System.out.println("La cafetera ha sido vaciada completamente");
    }
}
