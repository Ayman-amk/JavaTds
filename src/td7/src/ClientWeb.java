import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ClientWeb extends JFrame {

    private JTextField adresseTextField;
    private JEditorPane contenuEditorPane;

    public ClientWeb() {
        setTitle("Client Web");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel adresseLabel = new JLabel("Adresse ");
        adresseTextField = new JTextField(20);
        JButton envoyerButton = new JButton("Envoyer");
        JButton effacerButton = new JButton("Effacer");
        contenuEditorPane = new JEditorPane();
        contenuEditorPane.setContentType("text/html");
        JScrollPane scrollPane = new JScrollPane(contenuEditorPane);

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.add(adresseLabel);
        topPanel.add(adresseTextField);
        topPanel.add(envoyerButton);
        topPanel.add(effacerButton);

        // Boutton "Envoyer"
        envoyerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String adresse = adresseTextField.getText();
                chargerContenu(adresse);
            }
        });

        effacerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contenuEditorPane.setText("");
            }
        });

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

    }

    // Methode pour charger le contenu depuis une URL
    private void chargerContenu(String adresse) {
        try {
            URL url = new URL(adresse);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            contenuEditorPane.setText(content.toString());
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement de la page : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ClientWeb clientWeb = new ClientWeb();
                clientWeb.setVisible(true);
            }
        });
    }
}
