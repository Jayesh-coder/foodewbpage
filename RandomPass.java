import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        int passwordLength = 12; // Change this to your desired password length
        String password = generatePassword(passwordLength);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        StringBuilder password = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}
