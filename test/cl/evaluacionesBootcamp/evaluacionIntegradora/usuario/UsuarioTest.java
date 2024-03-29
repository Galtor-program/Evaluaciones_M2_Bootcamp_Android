package cl.evaluacionesBootcamp.evaluacionIntegradora.usuario;

import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.TransaccionesBancarias;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    /**
     * traemos usuario de la cuenta Usuario y cuenta de TransaccionesBancarias
     */
    private Usuario usuario;
    private TransaccionesBancarias cuenta;

    /**
     * Antes de cada prueba creamos una instancia de nuestro objeto cuenta y usuario
     * cuenta llevara un saldo inicial y usuario tendra el resto de datos del usuario de la cuenta.
     */
    @BeforeEach
    void setUp() {

        cuenta = new TransaccionesBancarias(1000.0);
        usuario = new Usuario("Felipe Toro G.", 44, "13545345-5", cuenta);
    }

    /**
     * Aca comprobamos que al getNombres llegue el nombre correcto que hemos ingresado al crear el usuario.
     */
    @Test
    void testGetNombres() {

        assertEquals("Felipe Toro G.", usuario.getNombres(), "El nombre del usuario es el esperado.");
    }

    /**
     * Test para comprobar que getEdad contenga el valor ingresado
     */
    @Test
    void testGetEdad() {

        assertEquals(44, usuario.getEdad(), "La edad del usuario es la esperada.");
    }

    /**
     * Test que prueba getRut recibiendo el valor esperado.
     */
    @Test
    void testGetRut() {

        assertEquals("13545345-5", usuario.getRut(), "El RUT del usuario es el esperado.");
    }

    /**
     * Aca revisamos que usuario.getCuente reciba la cuenta
     */
    @Test
    void testGetCuenta() {
        assertEquals(cuenta, usuario.getCuenta(), "La cuenta bancaria del usuario  es la esperada.");
    }

}