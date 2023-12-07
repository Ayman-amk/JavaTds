import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class Apropos {
    public static void showAproposDialog() {
        String imagePath = "C:/Users/Ayman/OneDrive/Desktop/Study Folder/Cycle d'ingénieur FSTE/Semstre 3/2023 - 2024/Programmation Java/TPs/TP_5/clipboard.png";

        ImageIcon originalIcon = new ImageIcon(imagePath);

        Image image = originalIcon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);

        ImageIcon resizedIcon = new ImageIcon(image);

        JOptionPane.showMessageDialog(
                null,
                "\t Version Beta 0.8\nDéveloppé par Ayman Amokrane",
                "À propos",
                JOptionPane.INFORMATION_MESSAGE,
                resizedIcon
        );
    }

}
