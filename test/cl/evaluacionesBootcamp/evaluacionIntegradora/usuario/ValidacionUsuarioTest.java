package cl.evaluacionesBootcamp.evaluacionIntegradora.usuario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionUsuarioTest {
    /**
     * Declaramos validador como metodo ValidacionUsuario para usarlo en el beforeeach
     */
    private ValidacionUsuario validador;

    /**
     * Antes de cada prueba inicamos el objeto validador
     */
    @BeforeEach
    void setUp() {

        validador = new ValidacionUsuario();
    }

    /**
     * Como la logica de validacion es booleana y la condicion de edad es ser mayor o igual a 18 solicitaremos un true
     */
    @Test
    void testValidarEdadCorrecta() {
       assertTrue(validador.validarEdad(18), "Si la edad es mayor o igual a 18, esta retorna true.");
    }

    /**
     * Aca esperamos un retorno falso ya que la edad la pondremos menor a 18
     */
    @Test
    void testValidarEdadIncorrecta() {

        assertFalse(validador.validarEdad(17), "Si la edad es menor a 18, esta retorna false");
    }

    /**
     * La logica de validar el saldo incial tambien es booleano
     * como la condicion es que sea mayor  o igual a 100000, esta sera true
     */
    @Test
    void testValidarSaldoInicialCorrecto() {
        assertTrue(validador.validarSaldoInicial(100000), "Si el saldo inicial es mayor o igual a 100000, debe retornar un true");

    }

    /**
     * Aca se espera un retorno falso ya que el saldo sera menor a 100000
     */
    @Test
    void testValidarSaldoInicialIncorrecto() {
        assertFalse(validador.validarSaldoInicial(99999), "Si el saldo inicial es menor a 100000, debe retornar false.");
    }


}