package cl.evaluacionesBootcamp.evaluacionIntegradora.usuario;

import cl.evaluacionesBootcamp.evaluacionIntegradora.vistas.GeneradordeCuentas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Credenciales {

    static Scanner input = new Scanner(System.in);
    static int flag = 0;

    /**
     * Se el Email y se setea el ingreso a lowerCase para que coincida con el string
     */
    public static void Email(){
        String email;
        email = input.nextLine().toLowerCase();
        if(email.equals("admin@prueba.cl")){
            flag=1;
        }

    }

    /**
     * Se lee la password y se setea el ingreso a lowerCase para que coincida con el string
     */
    public static void Password(){
        String password;
        password = input.nextLine().toLowerCase();
        if(password.equals("password123")){
            flag=2;
        }
    }

    /**
     *
     */
    /**
     * Revisamos si las credenciales son correctas, de ser asi cargamos la opcion de crear el usuario.
     */
    public static void Acceso(){
        if (flag == 2){
            System.out.println("Credenciales Correctas");
            GeneradordeCuentas.crearDatosDeLaCuenta();
        }else{
            System.out.println("email o password incorrectos");
        }
    }







}
