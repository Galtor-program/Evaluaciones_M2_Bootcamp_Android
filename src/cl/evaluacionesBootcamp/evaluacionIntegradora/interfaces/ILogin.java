package cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces;

/**
 * Intefaz para login
 */
public interface ILogin {
    /**
     *
     * @param email indicamos que necesitamos el email
     * @param password indicamos que necesitamos la password
     * @return pasan por el verificador.
     */
    boolean verificarCredenciales(String email, String password);
}
