public class CeaserCipher {
    private  static final int SHIFT_LENGTH = 3;
    private static int ALPHABET_LENGTH = 26;

    private static char[] alphabet(){
        char[] alphabet =  new char[ALPHABET_LENGTH];
        char iter = 'A';
        for ( int i = 0 ; i < ALPHABET_LENGTH ; i++){
            alphabet[i] = iter;
            iter++;
        }
        return alphabet;
    }
// or return String without printing
    public static void encrypt( String plainText){
        char[] alphabet = alphabet();
        char[]  resultString = plainText.toCharArray();
        int index ; // position in alphabet

        for ( int i = 0 ; i < resultString.length ; i++){
            index =( resultString[i] + SHIFT_LENGTH  - 'A')
                    % ALPHABET_LENGTH;
            resultString[i] = alphabet[index];
        }
        System.out.println( new String(resultString));

    }

    public static void decrypt( String cyberText){
        char[] alphabet = alphabet();
        char[]  resultString = cyberText.toCharArray();
        int index ; // position in alphabet

        for ( int i = 0 ; i < resultString.length ; i++){
            index =(( resultString[i] - SHIFT_LENGTH  - 'A')
                    + ALPHABET_LENGTH) % ALPHABET_LENGTH;
            resultString[i] = alphabet[index];
        }
        System.out.println( new String(resultString));

    }
}
