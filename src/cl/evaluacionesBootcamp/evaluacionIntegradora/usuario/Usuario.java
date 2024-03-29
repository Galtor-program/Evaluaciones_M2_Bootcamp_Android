package cl.evaluacionesBootcamp.evaluacionIntegradora.usuario;

import cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces.ICuentaBancaria;

/**
 * Clase principal de usuario
 */
public class Usuario {
    private String nombres;
    private int edad;
    private String rut;
    private ICuentaBancaria cuenta;

    /**
     *
     * @param nombres recibmos el nombre y el apellido del usuario a crear
     * @param edad recibimos la edad del usuario
     * @param rut recimibos el rut del usuairo
     * @param cuenta recibimos la cuenta del usuario desde la clase CuentaBancaria
     */
    public Usuario(String nombres, int edad, String rut, ICuentaBancaria cuenta) {
        this.nombres = nombres;
        this.edad = edad;
        this.rut = rut;
        this.cuenta = cuenta;
    }

    /**
     *
     * @return retorna la informacion de nombre y apellido
     */
    public String getNombres() {
        return nombres;
    }

    /**
     *
     * @return la informacion de edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @return la informacion del rut
     */
    public String getRut() {
        return rut;
    }

    /**
     *
     * @return la informacion de la cuenta
     */
    public ICuentaBancaria getCuenta() {
        return cuenta;
    }
}
