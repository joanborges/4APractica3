import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PnlDocente extends JPanel {

    private JTextField txtNombre, txtApellido, txtEmail;
    private JButton btnRegistrar;

    public PnlDocente() {
        setLayout(new GridLayout(5, 2));

        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();

        JLabel lblApellido = new JLabel("Apellido:");
        txtApellido = new JTextField();

        JLabel lblEmail = new JLabel("Email:");
        txtEmail = new JTextField();

        btnRegistrar = new JButton("Registrar Docente");
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarDocente();
            }
        });

        add(lblNombre);
        add(txtNombre);
        add(lblApellido);
        add(txtApellido);
        add(lblEmail);
        add(txtEmail);
        add(new JLabel());
        add(btnRegistrar);
    }

    private void registrarDocente() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String email = txtEmail.getText();

        // Aquí se realizaría la lógica para registrar al docente en la base de datos.
        JOptionPane.showMessageDialog(this, "Docente registrado: " + nombre + " " + apellido + " - " + email);
    }
}