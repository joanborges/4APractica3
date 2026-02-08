import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrmPrincipal extends JFrame {
    public FrmPrincipal() {
        setTitle("Main Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create "Docente" menu
        JMenu docenteMenu = new JMenu("Docente");
        JMenuItem docenteItem = new JMenuItem("Access Docente Panel");
        docenteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open Docente Panel
            }
        });
        docenteMenu.add(docenteItem);

        // Create "Estudiante" menu
        JMenu estudianteMenu = new JMenu("Estudiante");
        JMenuItem estudianteItem = new JMenuItem("Access Estudiante Panel");
        estudianteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open Estudiante Panel
            }
        });
        estudianteMenu.add(estudianteItem);

        // Add menus to menu bar
        menuBar.add(docenteMenu);
        menuBar.add(estudianteMenu);

        // Set the menu bar to the frame
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
}