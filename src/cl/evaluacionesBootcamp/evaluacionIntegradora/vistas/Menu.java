package cl.evaluacionesBootcamp.evaluacionIntegradora.vistas;
import cl.evaluacionesBootcamp.evaluacionIntegradora.usuario.Credenciales;

import java.util.Scanner;

/**
 * Menu para inicializar la cuenta
 */
public class Menu {
    /**
     * Creamos un metodo que llamamos desde AlkaWallet para inciar el programa.
     */

    public static void menuInicio()  {
        Scanner input = new Scanner(System.in);
        int opcion;
        boolean flag = false;
          while (flag == false) {
                try {
                    Logo.logoBrand();
                    System.out.println(" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
                    System.out.println(" Bienvenido                          ");
                    System.out.println("    1.-   Ingresar al Sistema        ");
                    System.out.println("    2.-   Crear nuevo Usuario        ");
                    System.out.println("    3.-   Salir                      ");
                    System.out.println("   Elija su opcion y presione ENTER  ");
                    System.out.println(" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

                    opcion = input.nextInt();
                    switch (opcion) {
                        case 1:
                            Login();
                            break;
                        case 2:
                            GeneradordeCuentas.crearDatosDeLaCuenta();
                            break;
                        case 3:
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
        public static void Login(){
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
}
