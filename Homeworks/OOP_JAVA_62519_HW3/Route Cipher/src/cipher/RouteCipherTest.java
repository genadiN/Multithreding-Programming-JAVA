package cipher;

public class RouteCipherTest {
    public static void main(String[] args) {
        RouteCipher test = new RouteCipher(5);
        String encryptedMsg = test.encrypt("Abort the mission, you have been spotted!");
        System.out.println(encryptedMsg);
        System.out.println("================================================================");

        test.setKey(-6);
        String encryptedMsg2 = test.encrypt("Abort the mission, you have been spotted!");
        System.out.println(encryptedMsg2);

        String decryptedMessage = test.decrypt(encryptedMsg2);
        System.out.println(decryptedMessage);
        System.out.println("================================================================");


        test.setKey(-8);
        String decryptedMessage1 = test.decrypt("TIEIXTXXEAHSIHSPNTLT");
        System.out.println(decryptedMessage1);
        System.out.println("================================================================");


        test.setKey(4);
        String decryptedMessage2 = test.decrypt("TIEIXTXXEAHSIHSPNTLT");
        System.out.println(decryptedMessage2);
        System.out.println("================================================================");

    }
}
