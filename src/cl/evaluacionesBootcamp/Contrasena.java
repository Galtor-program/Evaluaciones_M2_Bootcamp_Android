package cl.evaluacionesBootcamp;

import java.util.Scanner;

/**
 * @author Felipe Toro G.
 */
public class Contrasena {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //definimos la contrasena
        String contrasena = "Password";
        String contrasenaUsuario;

        System.out.println("Favor ingrese su contraseña: ");
        contrasenaUsuario = input.nextLine().toLowerCase();
        //comprobamos utlizamos .toLowerCase para que no diferencie entre mayusculas/minusculas
        if( contrasenaUsuario.equals(contrasena.toLowerCase())){
            System.out.println("La contraseña es correcta");
        }else{
            System.out.println("La contraseña es incorrecta");
        }

    }
}
