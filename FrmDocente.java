import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FrmDocente extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JTextField txtName;
    private JButton btnAdd, btnUpdate, btnDelete;

    public FrmDocente() {
        setTitle("Docentes List");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        model = new DefaultTableModel(new String[]{"ID", "Name"}, 0);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        txtName = new JTextField(15);
        panel.add(txtName);

        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");

        panel.add(btnAdd);
        panel.add(btnUpdate);
        panel.add(btnDelete);

        add(panel, BorderLayout.SOUTH);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                if (!name.isEmpty()) {
                    model.addRow(new Object[]{model.getRowCount() + 1, name});
                    txtName.setText("");
                }
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    String name = txtName.getText();
                    model.setValueAt(name, selectedRow, 1);
                }
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    model.removeRow(selectedRow);
                }
            }
        });
    }

    public static void main(String[] args) {
        FrmDocente frame = new FrmDocente();
        frame.setVisible(true);
    }
}