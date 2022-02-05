import java.util.Scanner;
public class ComputeByMenu {
    private double x;
    private Scanner input = new Scanner(System.in);

    public ComputeByMenu(double x) {
        this.x = x;
    }

    public void displayMenu() {
        for (int i = 0; i < 60; i++) {
            System.out.println();
        }

        System.out.printf("%s",
                "1.\tInput number with double point\n" +
                        "2.\tPrint exp(x)\n" +
                        "3.\tPrint sin(x)\n" +
                        "4.\tPrint floor(x)\n" +
                        "2.\tFinish\n");
    }

    public void doSelection(int choice) {
        switch (choice) {
            case 1:
                System.out.print(" x = ");
                x = input.nextDouble();
                break;
            case 2:
                System.out.print("exp(x) = " + Math.exp(x));
                break;
            case 3:
                System.out.print("sin(x) = " + Math.sin(x));
                // Math.toRadians(x) = to convert int radians
                break;
            case 4:
                System.out.print("floor(x) = " + Math.floor(x));
                break;
            case 5:
                System.exit(0);
        }
    }

    public void getUserChoice(){
        while(true){
            displayMenu();
            int choise;

            do{
                System.out.print("Choose number from 1 to 5: ");
                choise = input.nextInt();
            }while(choise < 1 || choise > 5);

            doSelection(choise);

            System.out.println("Click 'Enter' for continuing");
            input.nextLine();
            input.nextLine();
        }

    }
}
