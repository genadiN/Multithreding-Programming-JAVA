import javax.swing.*;

public class StockTest {
    public static void main(String[] args) {
        String symbol = JOptionPane.showInputDialog("Enter valid symbol: ");
        String name = JOptionPane.showInputDialog("Enter valid name: ");
        Stock stockTest = new Stock(symbol , name);
        System.out.println(stockTest.getSymbol() + " " + stockTest.getName());
        String prevPrice = JOptionPane.showInputDialog("Enter previous price: ");
        double price = Double.parseDouble(prevPrice);
        String currentPrice = JOptionPane.showInputDialog("Enter current price: ");
        double current = Double.parseDouble(currentPrice);
        stockTest.setPreviousClosingPrice(price);
        stockTest.setCurrentPrice(current);
        System.out.println("The previous price is: " + stockTest.getPreviousClosingPrice()
                + "\nThe current price is: " + stockTest.getCurrentPrice() + "" +
                "\nThe percentage of change is: " + stockTest.changePercent());
    }
}
