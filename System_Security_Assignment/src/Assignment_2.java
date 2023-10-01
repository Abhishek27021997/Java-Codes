import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Assignment_2 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hashed PIN: ");
        String hashedPin = scanner.nextLine();

        // Creating a MessageDigest object for MD5
        MessageDigest md = MessageDigest.getInstance("MD5");

        // Loop through all possible combinations of 4-digit PINs
        for (int i = 0; i < 10000; i++) {
            String pin = String.format("%04d", i);

            // Calculate the MD5 hash of the PIN
            byte[] bytes = md.digest(pin.getBytes());
            String hash = bytesToHex(bytes);

            // If the hash matches the hashed PIN, then print the PIN
            if (hash.equals(hashedPin)) {
                System.out.println("The PIN is: " + pin);
                break;
            }
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(String.format("%02x", bytes[i]));
        }
        return sb.toString();
    }
}