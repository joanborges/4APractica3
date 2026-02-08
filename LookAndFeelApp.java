import javax.swing.*;
import java.awt.*;

public class LookAndFeelApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Set Metal Look and Feel
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                // Set Nimbus Look and Feel
                // UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                // Set Windows Look and Feel
                // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                // Set Motif Look and Feel
                // UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            } catch (Exception e) {
                e.printStackTrace();
            }
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Look and Feel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JButton button = new JButton("Click Me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setVisible(true);
    }
}