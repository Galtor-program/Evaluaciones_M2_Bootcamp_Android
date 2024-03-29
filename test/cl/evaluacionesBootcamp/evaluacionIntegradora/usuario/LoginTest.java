package cl.evaluacionesBootcamp.evaluacionIntegradora.usuario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
    private Login login;

    /**
     * Para cada objeto inicializaremos el objeto Login
     */
    @BeforeEach
    void setUp() {

        login = new Login();
    }

    /**
     * Para nuestra logica de login verificamos que las credenciales correctas retornen un valor true
     */
    @Test
    void testVerificarCredencialesCorrectas() {

        assertTrue(login.verificarCredenciales("admin@admin.cl", "password123"),
                "Las credenciales correctas deberían retornar true.");
    }

    /**
     * Para nuestra logica de login verificamos que las credenciales incorrectas retornen un valor false
     */
    @Test
    void testVerificarCredencialesIncorrectas() {

        assertFalse(login.verificarCredenciales("usuario@ejemplo.com", "contraseñaIncorrecta"),
                "Las credenciales incorrectas deberían retornar false.");
    }

}