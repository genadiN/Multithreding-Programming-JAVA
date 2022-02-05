import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class CeaserCipherTest {
    public static void main(String[] args) {
        CeaserCipher.encrypt("TOY");
        CeaserCipher.decrypt("WRB");

        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            do {
                System.out.println("Pick 1 for encryption" +
                        " 2 for decryption or 3 for exit:");
                choice = input.nextInt();
                switch(choice) {
                    case 1:
                        System.out.print("Enter word for encryption: ");
                        String wortToEncrypt = input.next();
                        wortToEncrypt = wortToEncrypt.toUpperCase();
                        // change to uuper cases letters only;

                        CeaserCipher.encrypt(wortToEncrypt);
                        break;
                    case 2:
                        System.out.print("Enter word for decryption: ");
                        String wortToDecrypt = input.next();
                        wortToDecrypt = wortToDecrypt.toUpperCase();
                        // change to uuper cases letters only;

                        CeaserCipher.decrypt(wortToDecrypt);
                        break;
                    case 3:
                        System.exit(0);
                }
            } while (choice != 1 && choice != 2 && choice != 3);

        }

    }
}
