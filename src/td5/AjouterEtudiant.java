import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AjouterEtudiant {
    private static JPanel panel;

    public static JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel();
            panel.setLayout(new GridLayout(15, 2, 10, 10));

            Font labelFont = new Font("Arial", Font.BOLD, 14);

            JLabel cneLabel = new JLabel("CNE");
            cneLabel.setFont(labelFont);
            JTextField cneField = new JTextField();

            JLabel nomLabel = new JLabel("Nom");
            nomLabel.setFont(labelFont);
            JTextField nomField = new JTextField();

            JLabel prenomLabel = new JLabel("Prénom");
            prenomLabel.setFont(labelFont);
            JTextField prenomField = new JTextField();

            JLabel dobLabel = new JLabel("Date de Naissance");
            dobLabel.setFont(labelFont);
            JTextField dobField = new JTextField();

            JLabel emailLabel = new JLabel("Email");
            emailLabel.setFont(labelFont);
            JTextField emailField = new JTextField();

            JLabel passwordLabel = new JLabel("Mot de passe");
            passwordLabel.setFont(labelFont);
            JPasswordField passwordField = new JPasswordField();

            JLabel addressLabel = new JLabel("Adresse");
            addressLabel.setFont(labelFont);
            JTextField addressField = new JTextField();

            JLabel specialityLabel = new JLabel("Spécialité");
            specialityLabel.setFont(labelFont);
            String[] specialityOptions = {"Genie de informatique", "Master"};
            JComboBox<String> specialityComboBox = new JComboBox<>(specialityOptions);

            JLabel imageLabel = new JLabel("Photo");
            imageLabel.setFont(labelFont);
            JButton imageButton = new JButton("Parcourir");

            imageButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif");
                    fileChooser.setFileFilter(filter);

                    int returnVal = fileChooser.showOpenDialog(panel);

                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        String imagePath = fileChooser.getSelectedFile().getAbsolutePath();
                   }
                }
            });

            JButton submitButton = new JButton("S'inscrire");
            submitButton.setBackground(Color.GREEN);
            submitButton.setForeground(Color.WHITE);
            submitButton.setFont(labelFont);

            cneField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            nomField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            prenomField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            dobField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            emailField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            addressField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

            panel.add(cneLabel);
            panel.add(cneField);
            panel.add(nomLabel);
            panel.add(nomField);
            panel.add(prenomLabel);
            panel.add(prenomField);
            panel.add(dobLabel);
            panel.add(dobField);
            panel.add(emailLabel);
            panel.add(emailField);
            panel.add(passwordLabel);
            panel.add(passwordField);
            panel.add(addressLabel);
            panel.add(addressField);
            panel.add(specialityLabel);
            panel.add(specialityComboBox);
            panel.add(imageLabel);
            panel.add(imageButton);
            panel.add(new JLabel());
            panel.add(submitButton);
        }
        return panel;
    }

}
