package cl.evaluacionesBootcamp.mascotas;

public class Persona {
    public String nombrePersona;
    public String ApellidoPersona;
    public int edadPersona;
    private String rutPersona;
    //Perro es del tipo perro
    public Perro perro;

    public Persona() {
    }

    /**
     *
     * @param nombrePersona recibe el nombre de la persona
     * @param apellidoPersona recibe el apellido de la persona
     * @param edadPersona recibe la edad de la persona
     * @param rutPersona recibe el rut de la persona
     * @param perro recibe el perro
     */
    public Persona(String nombrePersona, String apellidoPersona, int edadPersona, String rutPersona, Perro perro) {
        this.nombrePersona = nombrePersona;
        this.ApellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
        this.rutPersona = rutPersona;
        this.perro = perro;
    }

    /**
     * Proceso de impresion de los datos recibidos por la clase Persona y clase Perro
     */
    public void mostrarInformacionPersona(){
        System.out.println("Nombre : " +nombrePersona);
        System.out.println("Apellido: " +ApellidoPersona);
        System.out.println("Edad: " + edadPersona);
        System.out.println("Rut: " + rutPersona);
        System.out.println("Su mascota");
        System.out.println("☻☻☻☻☻☻☻");
        System.out.println("Nombre del perro: " + perro.nombreDelPerro);
        System.out.println("Raza del perro: " +perro.razaDelPerro);
        System.out.println("Edad del perro: " +perro.edadDelPerro);
        System.out.println("Tamano del perro: " +perro.tamanoDelPerro);
    }




}
