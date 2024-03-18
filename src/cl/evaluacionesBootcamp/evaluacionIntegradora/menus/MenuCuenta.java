package cl.evaluacionesBootcamp.evaluacionIntegradora.menus;

import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.CuentaBancaria;
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
                        CuentaBancaria.convertirAEuros();
                        break;
                    case 4:
                        CuentaBancaria.converADolares();
                        break;
                    case 5:
                        CuentaBancaria.convertirAYenes();
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
