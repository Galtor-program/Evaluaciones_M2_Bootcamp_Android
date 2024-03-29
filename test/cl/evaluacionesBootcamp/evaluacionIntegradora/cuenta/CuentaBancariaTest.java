package cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaBancariaTest {
    private CuentaBancaria cuenta;

    /**
     * Usamos Before each para inicializar la cuenta antes de cada prueba con un saldo inicial
     */
    @BeforeEach
    void setUp() {

        cuenta = new CuentaBancaria(1000.0);
    }

    /**
     * Probamos que a nuestro saldo se sumen correctamente los 500 de la prueba
     */
    @Test
    void testDepositar() {

        cuenta.depositar(500.0);
        assertEquals(1500.0, cuenta.obtenerSaldo(), "El saldo después de depositar debería ser 1500.0");
    }

    /**
     * Este test es para probar que cada vez que solicitemos el obtenerSaldo nos entregue el valor correspondiente.
     */
    @Test
    void testObtenerSaldo() {

        assertEquals(1000.0, cuenta.obtenerSaldo(), "El saldo inicial debería ser 1000.0");
    }

}