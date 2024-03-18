package cl.evaluacionesBootcamp.mascotas;

/**
 * @author Felipe Toro G.
 */
public class Mascotas {
    public static void main(String[] args) {
        //creacion de perros
        Perro perro1 = new Perro("Cachupin","Quilterrier", 5,60);
        Perro perro2 = new Perro("Bethoveen", "San Bernardo", 2, 80);

        //creacion de personas
        Persona persona1 =  new Persona("Felipe", "Toro",30,"234234-4",perro1);
        Persona persona2 =  new Persona("Scarlette", "Johanson",35, "1216351-1",perro2);

        //mostrar la informacion con el metodo extraido de la clase persona
        System.out.println("Persona 1");
        persona1.mostrarInformacionPersona();
        System.out.println("===========");
        System.out.println("Persona 2");
        persona2.mostrarInformacionPersona();




    }




}
