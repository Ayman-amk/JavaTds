import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class InfoReseaux {

    public static void main(String[] args) {
        try {
            // Récupérer l'ensemble des interfaces réseau
            afficherInterfacesReseaux();
            // Afficher l'adresse IP utilisée pour communiquer avec la machine locale
            afficherAdresseIPLocale();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    private static void afficherInterfacesReseaux() throws SocketException {
        System.out.println("Interfaces réseau disponibles :");
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface iface = interfaces.nextElement();
            System.out.println("Nom : " + iface.getName());
            System.out.println("Display Name : " + iface.getDisplayName());
            System.out.println("Adresse physique (MAC) : " + getAdresseMAC(iface));
            System.out.println();
        }
    }

    private static void afficherAdresseIPLocale() throws SocketException {
        System.out.println("Adresse IP locale :");
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface iface = interfaces.nextElement();
            Enumeration<InetAddress> addresses = iface.getInetAddresses();
            while (addresses.hasMoreElements()) {
                InetAddress addr = addresses.nextElement();
                if (!addr.isLoopbackAddress() && !addr.isLinkLocalAddress() && !addr.isMulticastAddress()) {
                    System.out.println("Adresse IP : " + addr.getHostAddress());
                    System.out.println("Nom de l'interface : " + iface.getDisplayName());
                }
            }
        }
    }

    private static String getAdresseMAC(NetworkInterface networkInterface) throws SocketException {
        byte[] mac = networkInterface.getHardwareAddress();
        if (mac == null) {
            return "Non disponible";
        }

        StringBuilder sb = new StringBuilder();
        for (byte b : mac) {
            sb.append(String.format("%02X:", b));
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}
