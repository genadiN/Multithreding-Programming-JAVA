package cipher;

public class RouteCipher {
    private int key;

    public RouteCipher(int key) {
        setKey(key);
    }

    public int getKey() {
        int temp = key;
        return temp;
    }

    public void setKey(int key) {
        this.key = key;
    }

    private String formatString(String unformattedString) {
        String formattedString = unformattedString.replaceAll("[^a-zA-Z0-9]", "");
        formattedString = formattedString.toUpperCase();
        return formattedString;
    }

    private String encodeTopLeftCorner(char[][] table, int startPos, int rows, int cols, String encryptText) {
        if (rows < 0 && cols < 0) {
            return encryptText;
        }

        for (int i = startPos; i < rows; i++) { // from top left to bottom left
            encryptText += table[i][startPos];
        }

        for (int i = startPos + 1; i < cols - 1; i++) { // bottom left to bottom right
            encryptText += table[rows - 1][i];
        }
        if(startPos == cols - 1){
            return encryptText;
        }

        for (int i = rows - 1; i >= startPos; i--) { // bottom right to top right
            encryptText += table[i][cols - 1];
        }

        for (int i = cols - 2; i > startPos; i--) {
            encryptText += table[startPos][i];
        }


        return encodeTopLeftCorner(table, startPos + 1, rows - 1, cols - 1, encryptText);
    }

    private String encodeBottomRightCorner(char[][] table, int startPos, int rows, int cols, String encryptText) {
        if (rows < 0 && cols < 0) {
            return encryptText;
        }

        for (int i = rows - 1; i >= startPos; i--) { // bottom right to top right
            encryptText += table[i][cols - 1];
        }

        for (int i = cols - 2; i > startPos; i--) {
            encryptText += table[startPos][i];
        }
        if(cols - 1 == startPos){
            return encryptText;
        }

        for (int i = startPos; i < rows; i++) { // from top left to bottom left
            encryptText += table[i][startPos];
        }

        for (int i = startPos + 1; i < cols - 1; i++) { // bottom left to bottom right
            encryptText += table[rows - 1][i];
        }

        return encodeBottomRightCorner(table, startPos + 1, rows - 1, cols - 1, encryptText);
    }

    private char[][] decryptLeftTopCorner(char[][] table,int startPos, int rows, int cols, String encryptText,int index){
        if ((rows < 0 && cols < 0) || (index >= encryptText.length())) {
            return table;
        }

        for (int i = startPos; i < rows; i++) { // from top left to bottom left
            table[i][startPos] = encryptText.charAt(index);
            index++;
        }

        for (int i = startPos + 1; i < cols - 1; i++) { // bottom left to bottom right
            table[rows - 1][i] = encryptText.charAt(index);
            index++;
        }
        if(startPos == cols - 1){
            return table;
        }

        for (int i = rows - 1; i >= startPos; i--) { // bottom right to top right
            table[i][cols - 1] = encryptText.charAt(index);
            index++;
        }

        for (int i = cols - 2; i > startPos; i--) {
            table[startPos][i] = encryptText.charAt(index);
            index++;
        }

        return decryptLeftTopCorner(table, startPos + 1, rows - 1, cols - 1, encryptText,index);
    }

    private char[][] decryptRightBottomCorner(char[][] table,int startPos, int rows, int cols, String encryptText,int index) {
        if ((rows < 0 && cols < 0) || (index >= encryptText.length())) {
            return table;
        }

        for (int i = rows - 1; i >= startPos; i--) { // bottom right to top right
            table[i][cols - 1] = encryptText.charAt(index);
            index++;
        }

        for (int i = cols - 2; i > startPos; i--) {
            table[startPos][i] = encryptText.charAt(index);
            index++;
        }
        if(cols - 1 == startPos){
            return table;
        }

        for (int i = startPos; i < rows; i++) { // from top left to bottom left
            table[i][startPos] = encryptText.charAt(index);
            index++;
        }

        for (int i = startPos + 1; i < cols - 1; i++) { // bottom left to bottom right
            table[rows - 1][i] = encryptText.charAt(index);
            index++;
        }

        return decryptRightBottomCorner(table, startPos + 1, rows - 1, cols - 1, encryptText,index);
    }

    private int rowsCount(String text) {
        int length = text.length();
        int rows = length / Math.abs(key);

        length = length - (Math.abs(key) * rows);

        if (length != 0) {
            rows++;
        }

        return rows;
    }

    public String encrypt(String plainText) {
        String formattedString = formatString(plainText);
        int rows = rowsCount(formattedString);

        int index = 0;
        char[][] cipherTable = new char[rows][Math.abs(key)];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < Math.abs(key); j++) {
                if (index < formattedString.length()) {
                    cipherTable[i][j] = formattedString.charAt(index);
                    index++;
                } else {
                    cipherTable[i][j] = 'X';
                }
            }
        }

        String encodedMessage = "";
        int newRows = rows;
        int newCols = Math.abs(key);
        if (key < 0) {
            return encodeBottomRightCorner(cipherTable, 0, newRows, newCols, encodedMessage);
        } else if (key > 0) {
            return encodeTopLeftCorner(cipherTable, 0, newRows, newCols, encodedMessage);
        }
        return encodedMessage;
    }

    public String decrypt(String cipherText) {
        String formattedString = formatString(cipherText);
        int rows = rowsCount(formattedString);

        char[][] cipherTable = new char[rows][Math.abs(key)];
        int newRows = rows;
        int newCols = Math.abs(key);
        if(key < 0){
            cipherTable = decryptRightBottomCorner(cipherTable,0,newRows,newCols,formattedString,0);
        }
        else if(key > 0){
            cipherTable = decryptLeftTopCorner(cipherTable,0,newRows,newCols,formattedString,0);
        }

        String decryptedMessage = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < Math.abs(key); j++) {
                decryptedMessage += cipherTable[i][j];
            }
        }

        return decryptedMessage;
    }

    @Override
    public String toString() {
        return "Key = " + key;
    }
}
