package cl.evaluacionesBootcamp.evaluacionIntegradora.usuario;

import cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces.ILogin;

/**
 * Metodo login el cual usara la interfaz de ILogin
 */
public class Login implements ILogin {
    private final String EMAIL_CORRECTO = "admin@admin.cl";
    private final String PASSWORD_CORRECTO = "password123";

    // Implementamos el método de la interfaz
    public boolean verificarCredenciales(String email, String password) {
        return email.equals(EMAIL_CORRECTO) && password.equals(PASSWORD_CORRECTO);
    }
}
