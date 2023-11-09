
package Controler;

import javax.swing.JOptionPane;

public class LoginManager {

    public boolean realizarInicioSesion(String usuario, String contraseña) {
        // Lógica de validación del usuario y la contraseña
        return usuario.equals("POO") && contraseña.equals("1234");
    }

    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
