import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PnlDocente extends JPanel {
    private JTextField txtNombre;
    private JTextField txtIdentificacion;
    private JTextField txtCurso;
    private JButton btnRegister;

    public PnlDocente() {
        setLayout(new GridLayout(4, 2));

        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();

        JLabel lblIdentificacion = new JLabel("Identificación:");
        txtIdentificacion = new JTextField();

        JLabel lblCurso = new JLabel("Curso:");
        txtCurso = new JTextField();

        btnRegister = new JButton("Registrar");
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerDocente();
            }
        });

        add(lblNombre);
        add(txtNombre);
        add(lblIdentificacion);
        add(txtIdentificacion);
        add(lblCurso);
        add(txtCurso);
        add(new JLabel()); // empty cell
        add(btnRegister);
    }

    private void registerDocente() {
        String nombre = txtNombre.getText();
        String identificacion = txtIdentificacion.getText();
        String curso = txtCurso.getText();

        // Here we can add the registration logic
        JOptionPane.showMessageDialog(this, "Docente Registrado:\nNombre: " + nombre + "\nIdentificación: " + identificacion + "\nCurso: " + curso);
    }
}