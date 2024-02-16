import javax.swing.*;
import java.util.Scanner;

public class NumberSystems {
    public static void main(String[] args) {

        try {
            // using the popup from JOptionPane class
            int decimalNumber = Integer.parseInt(JOptionPane.showInputDialog("Insert a number"));
            JOptionPane.showMessageDialog(null, getResponseMessage(decimalNumber));

            // using the terminal from Scanner
//            Scanner scanner = new Scanner(System.in);
//            decimalNumber = scanner.nextInt();
//            System.out.println(getResponseMessage(decimalNumber));

        } catch (NumberFormatException e) { // extends Exception
            JOptionPane.showMessageDialog(null, "ERROR!" + '\n' + "Insert an integer number");
            main(args); // To execute the main method again
            System.exit(0); // To prevent an infinite execution of the main method in an exception is thrown.
        }

        System.out.println("------------------------------");

        int binaryNumber = 0B111110100; // binaryNumber = 500
        System.out.println("binaryNumber = " + binaryNumber);

        int octalNumber = 0764; // octalNumber = 500
        System.out.println("octalNumber = " + octalNumber);

        int hexadecimal = 0X1F4; // hexadecimal = 500
        System.out.println("hexadecimal = " + hexadecimal);
    }

    private static String getResponseMessage(int decimalNumber) {
        return "decimal number " + decimalNumber + " to binary string is " + Integer.toBinaryString(decimalNumber)
                + '\n'
                + "decimal number " + decimalNumber + " to octal string is " + Integer.toOctalString(decimalNumber)
                + '\n'
                + "decimal number " + decimalNumber + " to hexadecimal string is " + Integer.toHexString(decimalNumber);
    }
}
