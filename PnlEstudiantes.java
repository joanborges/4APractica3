import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PnlEstudiantes extends JPanel {
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JComboBox<String> comboCarrera;
    private JRadioButton rbMasculino, rbFemenino;
    private ButtonGroup bgSexo;
    private JSlider sliderCalificacion;
    private JCheckBox cbAceptaTerminos;
    private JList<String> listEstudiantes;
    private DefaultListModel<String> model;

    public PnlEstudiantes() {
        setLayout(new GridLayout(0, 2));

        // Nombre
        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        // Edad
        add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        add(txtEdad);

        // Carrera
        add(new JLabel("Carrera:"));
        comboCarrera = new JComboBox<>(new String[]{"Informatica", "Electronica", "Mecanica"});
        add(comboCarrera);

        // Sexo
        add(new JLabel("Sexo:"));
        rbMasculino = new JRadioButton("Masculino");
        rbFemenino = new JRadioButton("Femenino");
        bgSexo = new ButtonGroup();
        bgSexo.add(rbMasculino);
        bgSexo.add(rbFemenino);
        JPanel sexoPanel = new JPanel();
        sexoPanel.add(rbMasculino);
        sexoPanel.add(rbFemenino);
        add(sexoPanel);

        // Calificacion
        add(new JLabel("Calificacion:"));
        sliderCalificacion = new JSlider(0, 100);
        add(sliderCalificacion);

        // Terminos
        cbAceptaTerminos = new JCheckBox("Acepto los terminos");
        add(cbAceptaTerminos);

        // List
        model = new DefaultListModel<>();
        listEstudiantes = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(listEstudiantes);
        add(scrollPane);

        // Boton de agregar
        JButton btnAgregar = new JButton("Agregar Estudiante");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEstudiante();
            }
        });
        add(btnAgregar);
    }

    private void agregarEstudiante() {
        String nombre = txtNombre.getText();
        String edad = txtEdad.getText();
        String carrera = (String) comboCarrera.getSelectedItem();
        String sexo = rbMasculino.isSelected() ? "Masculino" : "Femenino";
        int calificacion = sliderCalificacion.getValue();
        boolean aceptaTerminos = cbAceptaTerminos.isSelected();

        // Simular agregar estudiante a la lista
        if (!nombre.isEmpty() && !edad.isEmpty() && aceptaTerminos) {
            model.addElement(nombre + " - " + edad + " - " + carrera + " - " + sexo + " - " + calificacion);
            txtNombre.setText("");
            txtEdad.setText("");
            sliderCalificacion.setValue(0);
            cbAceptaTerminos.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos y acepte los términos.");
        }
    }
}