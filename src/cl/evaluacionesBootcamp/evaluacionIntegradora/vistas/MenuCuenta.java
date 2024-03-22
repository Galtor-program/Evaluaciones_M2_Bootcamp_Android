package cl.evaluacionesBootcamp.evaluacionIntegradora.vistas;

import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.Conversor;
import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.CuentaBancaria;
import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.Transacciones;
import cl.evaluacionesBootcamp.evaluacionIntegradora.usuario.Persona;

import java.util.Scanner;

/**
 * Menu de acciones en la cuenta
 */
public class MenuCuenta {
    /**
     * Metodo de seleccion de operaciones que afecta directamente al saldo de la cuenta
     */
    public static void mostrarMenuCuenta() {
        int opcion = 0;
        boolean flag = false;
        Scanner input = new Scanner(System.in);

        while (flag == false) {
            try{
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
                        Transacciones.sumaCuenta();
                        break;
                    case 2:
                        Transacciones.restaCuenta();
                        break;
                    case 3:
                        Conversor.convertirAEuros();
                        break;
                    case 4:
                        Conversor.converADolares();
                        break;
                    case 5:
                        Conversor.convertirAYenes();
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
                flag= true;
                System.out.println("Error " + e.getMessage());
                System.out.println("Ingreso de valor errado");
                mostrarMenuCuenta();

            }

        }

    }

}
