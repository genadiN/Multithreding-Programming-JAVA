package table;

import javax.swing.*;

public class TableTest {
    public static void main(String[] args) {
        double a , b;
        int step;

        String aText = JOptionPane.showInputDialog("Enter interval left endpoint: ");
        a = Double.parseDouble(aText);

        String bText = JOptionPane.showInputDialog("Enter interval right endpoint: ");
        b = Double.parseDouble(bText);

        String stepText = JOptionPane.showInputDialog("Enter number of discrete intervals(int): ");
        step = Integer.parseInt(stepText);

        if( a > b ){
            double temp = a;
            a = b;
            b = temp;
        }

        Table table = new Table(a , b , step);
        table.makeTable();
    }
}
