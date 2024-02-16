import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {
        Scanner KeyboardInput = new Scanner(System.in);

        System.out.println("Insert your salary range: ");

        float salary = KeyboardInput.nextFloat();
        float needs = salary * 0.5f;
        float others = salary * 0.3f;
        float savings = salary * 0.2f;

        System.out.println("salary: " + "$" + salary);
        System.out.println("needs: " + "$" + needs);
        System.out.println("others: " + "$" + others);
        System.out.println("savings: " + "$" + savings);
    }
}
