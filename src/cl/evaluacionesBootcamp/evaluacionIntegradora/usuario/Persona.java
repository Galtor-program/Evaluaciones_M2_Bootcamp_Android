package cl.evaluacionesBootcamp.evaluacionIntegradora.usuario;

import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.CuentaBancaria;
import cl.evaluacionesBootcamp.evaluacionIntegradora.menus.MenuCuenta;
import cl.evaluacionesBootcamp.evaluacionIntegradora.menus.Nuevo;

import java.util.Scanner;

/**
 * Clase Persona donde crearemos al usuario de la Cta.
 */
public class Persona {

    public static String nombreUsuario;
    public static String apellidoUsuario;
    private static String rutUsuario;
    public static CuentaBancaria saldocuenta;

    /**
     * constructor vacio
     */
    public Persona() {
    }

    /**
     *
     * @param nombreUsuario recibimos el nombre de usuario desde el menu inicial
     * @param apellidoUsuario recibimos el apellido del usuario desde el menu inicial
     * @param rutUsuario recibimos el rut del usuario desde el menu inicial
     * @param saldoCuentaBancaria recimibos el saldo de la cuenta desde el menu inicial
     */
    public Persona(String nombreUsuario, String apellidoUsuario, String rutUsuario, CuentaBancaria saldoCuentaBancaria) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.rutUsuario = rutUsuario;
        this.saldocuenta= saldoCuentaBancaria;

    }
    //getter  de rut por ser private

    /**
     *
     * @return el rut del usuario que esta en private
     */
    public static String getRutUsuario() {
        return rutUsuario;
    }

    /**
     * Metodo para mostrar los datos del usuario y su saldo inicial
     * Ademas se genera un input para saber si el usuario quiere pasar
     * al menu de la cuenta para realizar gestiones.
     */
    public void mostrarDatosDelUsuario(){
        Scanner input = new Scanner(System.in);
        String opcion;
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■  CUENTA  CREADA EXITOSAMENTE ☻ ");
        System.out.println("■ NOMBRE: " +nombreUsuario );
        System.out.println("■ APELLIDO: "+apellidoUsuario);
        System.out.println("■ RUT: " +getRutUsuario());
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("   SU SALDO EN ESTOS MOMENTOS ES  ");
        System.out.println("       " +saldocuenta.saldoCuenta    );
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓ Desea realizar alguna operacion? S/N:   ▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        opcion = input.nextLine().toLowerCase();
        if (opcion.equals("s")){
            MenuCuenta.mostrarMenuCuenta();
        }else{
            Nuevo.crearNuevaCuenta();
        }

    }

    /**
     * Una vez que realice una modificacion a la cuenta llamaremos a este metodo para mostrar los cambios.
     */
    public static void mostrarDatosActualizados() {
        Scanner input = new Scanner(System.in);
        String opcion;
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■  CUENTA  ACTUALIZADA EXITOSAMENTE ☻ ");
        System.out.println("■ NOMBRE: " + nombreUsuario);
        System.out.println("■ APELLIDO: " + apellidoUsuario);
        System.out.println("■ RUT: " + getRutUsuario());
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("   SU SALDO EN ESTOS MOMENTOS ES  ");
        System.out.println("       " + saldocuenta.saldoCuenta);
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓ Desea realizar alguna operacion? S/N:   ▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        opcion = input.nextLine().toLowerCase();
        if (opcion.equals("s")) {
            MenuCuenta.mostrarMenuCuenta();
        } else {
            Nuevo.crearNuevaCuenta();
        }
    }
}
