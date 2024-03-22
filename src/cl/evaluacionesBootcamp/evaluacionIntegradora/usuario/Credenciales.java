package cl.evaluacionesBootcamp.evaluacionIntegradora.usuario;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Credenciales {

    static Scanner input = new Scanner(System.in);
    static int flag = 0;
    public static void Email(){
        String email;
        email = input.nextLine();
        if(email.equals("admin@prueba.cl")){
            flag=1;
        }

    }

    public static void Password(){
        String password;
        password = input.nextLine();
        if(password.equals("password123")){
            flag=2;
        }
    }
    public static void Acceso(){
        if (flag == 2){
            System.out.println("Credenciales Correctas");
            Persona.mostrarDatosDelUsuario();
        }else{
            System.out.println("email o password incorrectos");
        }
    }







}
