import java.util.Scanner;

public class IVACalculator {
    static Scanner keyboardInput = new Scanner(System.in);
    static float iva = 21;
    public static void main(String[] args) {
        System.out.println("Insert price: ");
        float price = keyboardInput.nextFloat();

        System.out.println("price + IVA: " + "$" + calculate(price));
    }
    public static float calculate(float price) {
        return price + ((iva * price) / 100);
    }
}
