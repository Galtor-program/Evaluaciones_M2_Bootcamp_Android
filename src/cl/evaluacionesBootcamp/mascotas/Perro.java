package cl.evaluacionesBootcamp.mascotas;

public class Perro {
    String nombreDelPerro;
    String razaDelPerro;
    int edadDelPerro;
    double tamanoDelPerro;
    //constructor vacio
    public Perro() {

    }
    //constructor con parametros

    /**
     *
     * @param nombreDelPerro recibe el nombre al crear al perro
     * @param razaDelPerro recibe la raza al crear al perro
     * @param edadDelPerro recibe la edad del perro
     * @param tamanoDelPerro recibe el tamano del perro
     */
    public Perro(String nombreDelPerro, String razaDelPerro, int edadDelPerro, double tamanoDelPerro) {
        this.nombreDelPerro = nombreDelPerro;
        this.razaDelPerro = razaDelPerro;
        this.edadDelPerro = edadDelPerro;
        this.tamanoDelPerro = tamanoDelPerro;
    }
}
