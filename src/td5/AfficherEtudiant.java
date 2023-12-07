import javax.swing.*;
import java.awt.*;

public class AfficherEtudiant {
    private static JPanel panel;

    public static JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel();
            panel.setLayout(new BorderLayout());

            String[] columnNames = {"CNE", "Nom", "Prénom", "Date de Naissance", "Email", "Adresse", "Spécialité", "Photo"};
            Object[][] data = {
                    {"U111111", "Ayman", "Amokrane", "30/11/2002", "ayman@example.com", "123 Errachidia", "Genie de informatique", "photo1.jpg"},
                    {"U123456", "Malak", "Alaoui", "26/10/2003", "Malak@example.com", "123 Rabat", "Economie", "photo2.jpg"},
            };

            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);

            panel.add(scrollPane, BorderLayout.CENTER);
        }
        return panel;
    }

}
