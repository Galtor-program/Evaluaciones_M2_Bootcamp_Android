package cl.evaluacionesBootcamp.evaluacionIntegradora.vistas;
import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.Conversor;
import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.CuentaBancaria;
import cl.evaluacionesBootcamp.evaluacionIntegradora.usuario.Credenciales;
import cl.evaluacionesBootcamp.evaluacionIntegradora.usuario.Persona;

import java.util.Scanner;

/**
 * Menu para inicializar la cuenta
 */
public class Menus {
    /**
     * Creamos un metodo que llamamos desde AlkaWallet para inciar el programa.
     */

    public static void menuInicio() {
        Scanner input = new Scanner(System.in);
        int opcion;
        boolean flag = false;

        while (flag == false) {
            try {
                Logo.logoBrand();
                System.out.println(" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
                System.out.println(" Bienvenido                          ");
                System.out.println("    1.-   Ingresar al Sistema        ");
                System.out.println("    2.-   Salir                      ");
                System.out.println("   Elija su opcion y presione ENTER  ");
                System.out.println(" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        Login();
                        break;
                    case 2:
                        flag = true;
                        System.out.println("Usted Finalizo el programa");
                        System.out.println("       GRACIAS!           ");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            } catch (Exception e) {
                flag = true;
                System.out.println("Error " + e.getMessage());
                System.out.println("Ingreso de valor errado");
            }

        }

    }

    public static void Login() {
        Logo.logoBrand();
        System.out.println(" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("                LOGIN                ");
        System.out.println("          Ingrese Su correo:         ");
        Credenciales.Email();
        System.out.println("          Ingrese su password:       ");
        Credenciales.Password();
        System.out.println(" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        Credenciales.Acceso();
    }

    public static void mostrarMenuCuenta () {
        int opcion = 0;
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        Conversor conversor = new Conversor();
        while (flag == false) {
            try {
                Logo.logoBrand();
                System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                System.out.println("▀ Seleccione la operacion ▀");
                System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                System.out.println("▀     1.- Cargar Saldo    ▀");
                System.out.println("▀     2.- Restar Saldo    ▀");
                System.out.println("▀     3.- Pasar a Euro    ▀");
                System.out.println("▀     4.- Pasar a Dolar   ▀");
                System.out.println("▀     5.- Pasar a Yen     ▀");
                System.out.println("▀     6.- Salir           ▀");
                System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        CuentaBancaria.sumaCuenta();
                        break;
                    case 2:
                        CuentaBancaria.restaCuenta();
                        break;
                    case 3:
                        conversor.convertirAEuros();
                        break;
                    case 4:
                        conversor.convertirADolares();
                        break;
                    case 5:
                        conversor.convertirAYenes();
                        break;
                    case 6:
                        flag = true;
                        Persona.mostrarDatosActualizados();
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            } catch (Exception e) {
                flag = true;
                System.out.println("Error " + e.getMessage());
                System.out.println("Ingreso de valor errado");
                mostrarMenuCuenta();

            }

        }
    }
}
