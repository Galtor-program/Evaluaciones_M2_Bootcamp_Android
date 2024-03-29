package cl.evaluacionesBootcamp.evaluacionIntegradora.vistas;
import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.ConversorDivisas;
import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.TransaccionesBancarias;
import cl.evaluacionesBootcamp.evaluacionIntegradora.usuario.Login;
import cl.evaluacionesBootcamp.evaluacionIntegradora.usuario.Usuario;
import cl.evaluacionesBootcamp.evaluacionIntegradora.usuario.ValidacionUsuario;

import java.util.Scanner;

/**
 * Clase que contiene los menus de la aplicacion
 */
public class Menus {
    /**
     * Declaramos las variables globales
     */
    private static Scanner input = new Scanner(System.in);
    private static Login login = new Login();
    private static Usuario usuario;
    private static ConversorDivisas conversor = new ConversorDivisas();

    /**
     * Menu que nos permite loguear en el sistema
     * aplicando la logica del Login
     */

    public static void menuLogin() {

        boolean autenticado = false;
        int opcion;
        /**
         * Realiza mientras la opcion sea distinta de 2
         * si autenticado pasa a ser true entonces podremos
         * ingresar al menu de crear el usuario y su cuenta
         */
        do {
            Logo.logoBrand();
            System.out.println(" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            System.out.println("    Bienvenido a Billetera Digital   ");
            System.out.println(" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            System.out.println("    1.-   Ingresar al Sistema        ");
            System.out.println("    2.-   Salir                      ");
            System.out.println("   Elija su opcion y presione ENTER  ");
            System.out.println(" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    autenticado = intentarLogin();
                    if (autenticado) {
                        System.out.println("Login exitoso. Bienvenido al sistema.");
                        mostrarMenuUsuario();
                    } else {
                        System.out.println("Credenciales incorrectas. Intente nuevamente.");
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 2);

        input.close();

    }


    /**
     * Menu del login que llama los metodos Credenciales.Email y Credenciales.Password para verificar que el usuario y
     * password sean correctos
     */
    public static boolean intentarLogin() {

        Logo.logoBrand();
        System.out.println(" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("                LOGIN                ");
        System.out.println("          Ingrese Su correo:         ");
        String email = input.nextLine();
        System.out.println("          Ingrese su password:       ");
        String password = input.nextLine();
        System.out.println(" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        /**
         *  retornamos el correo y password pasados por el validaodr
         */
        return login.verificarCredenciales(email, password);
    }

    /**
     * Menu del usuario donde podemos crear o no el usuario.
     */
    private static void mostrarMenuUsuario() {
        System.out.println("1. Crear usuario");
        System.out.println("2. Volver");
        System.out.print("Ingrese la opción deseada: ");
        int opcion = input.nextInt();
        input.nextLine(); // Limpiar el buffer del scanner

        switch (opcion) {
            case 1:
                crearUsuario();
                break;
            case 2:

                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }
    }

    /**
     * Metodo para crear nuestro usuario donde el saldo sera almacenado en CuentaBancaria
     */
    private static void crearUsuario() {
        /**
         * llamamos al metodo validador para revisar la edad y el saldo
         */
        ValidacionUsuario validador = new ValidacionUsuario();
        System.out.print("Ingrese los nombres del usuario: ");
        String nombres = input.nextLine();

        System.out.print("Ingrese la edad del usuario: ");
        int edad = input.nextInt();
        if (!validador.validarEdad(edad)) {
            System.out.println("Error: El usuario debe ser mayor de 18 años.");
            return;

        }
        input.nextLine();
        System.out.print("Ingrese el RUT del usuario: ");
        String rut = input.nextLine();

        System.out.print("Ingrese el saldo inicial de la cuenta bancaria: ");
        double saldoInicial = input.nextDouble();
        if (!validador.validarSaldoInicial(saldoInicial)) {
            System.out.println("Error: El saldo inicial debe ser al menos de 100000.");
            return;

        }

        usuario = new Usuario(nombres, edad, rut, new TransaccionesBancarias(saldoInicial));
        System.out.println("Usuario creado exitosamente.");
        mostrarInformaciondelUsuario();

        menuTransacciones();

    }

    /**
     * Metodo al cual ingresamos una vez que ha creado la cuenta y que nos permite llamar
     * a nuestras operaciones de Transaccion y de Conversion.
     */
    public static void menuTransacciones() {
        int opcion;
        /**
         * Se realiza mientras la opcion sea distinto de 3
         */
        do {
            System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
            System.out.println("▀ Seleccione la operacion ▀");
            System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
            System.out.println("▀     1.- Cargar Saldo    ▀");
            System.out.println("▀     2.- Retirar Saldo   ▀");
            System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
            System.out.println("▀▀▀▀▀▀▀▀▀CONVERSORES▀▀▀▀▀▀▀");
            System.out.println("▀     3.- Pasar a Euro    ▀");
            System.out.println("▀     4.- Pasar a Dolar   ▀");
            System.out.println("▀     5.- Pasar a Yen     ▀");
            System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
            System.out.println("▀     6.- Salir           ▀");
            System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
            System.out.print("Ingrese la opción deseada: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a sumar: ");
                    double cantidadSumar = input.nextDouble();
                    ((TransaccionesBancarias) usuario.getCuenta()).sumarSaldo(cantidadSumar);
                    mostrarInformaciondelUsuario();
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a restar: ");
                    double cantidadRestar = input.nextDouble();
                    ((TransaccionesBancarias) usuario.getCuenta()).restarSaldo(cantidadRestar);
                    mostrarInformaciondelUsuario();
                    input.nextLine();
                    break;
                case 3:
                    conversor.valorEuro(usuario.getCuenta().obtenerSaldo());
                    break;
                case 4:
                    conversor.valorDolar(usuario.getCuenta().obtenerSaldo());
                    break;
                case 5:
                    conversor.valorYen(usuario.getCuenta().obtenerSaldo());
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");

            }

        }while (opcion != 6) ;
    }

    /**
     * Metodo que nos muestra la informacion de la cuenta a medida que vamos haciendo transacciones con el saldo inicial.
     */
    public static void mostrarInformaciondelUsuario(){
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓ Estado de la Cuenta Bancaria ▓");
        System.out.println("▓ Nombres :"+ usuario.getNombres());
        System.out.println("▓ Edad: " + usuario.getEdad());
        System.out.println("▓ Rut: " + usuario.getRut());
        System.out.println("▓ Saldo: " + usuario.getCuenta().obtenerSaldo());
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");

    }
}
