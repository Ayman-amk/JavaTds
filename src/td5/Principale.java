import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principale {
    private static JFrame frame;
    private static JPanel page1Panel;
    private static JPanel page2Panel;

    public static void main(String[] args) {
        frame = new JFrame("Application Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JMenuBar menuBar = new JMenuBar();
        JMenu fichierMenu = new JMenu("Fichier");
        JMenu affichageMenu = new JMenu("Affichage");
        JMenu aideMenu = new JMenu("Aide");

        JMenuItem enregistrerItem = new JMenuItem("Enregistrer");
        JMenuItem quitterItem = new JMenuItem("Quitter");

        JMenuItem page1Item = new JMenuItem("Ajouter Etudiant");
        JMenuItem page2Item = new JMenuItem("Afficher liste");
        JMenuItem page3Item = new JMenuItem("Page 3");

        JMenuItem aproposItem = new JMenuItem("À propos");

        // Gestionnaire d'événements pour le menu Quitter
        quitterItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment quitter l'application ?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        fichierMenu.add(enregistrerItem);
        fichierMenu.add(quitterItem);

        affichageMenu.add(page1Item);
        affichageMenu.add(page2Item);
        affichageMenu.add(page3Item);

        aideMenu.add(aproposItem);

        menuBar.add(fichierMenu);
        menuBar.add(affichageMenu);
        menuBar.add(aideMenu);

        frame.setJMenuBar(menuBar);

        JPanel page1Panel = AjouterEtudiant.getPanel();
        JPanel page2Panel = AfficherEtudiant.getPanel();

        // Gestionnaire d'événements pour le menu Affichage
        page1Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(page1Panel);
                frame.revalidate();
                frame.repaint();
            }
        });

        page2Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(page2Panel);
                frame.revalidate();
                frame.repaint();
            }
        });

        aproposItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Apropos.showAproposDialog();
            }
        });

        frame.setVisible(true);
    }
}
