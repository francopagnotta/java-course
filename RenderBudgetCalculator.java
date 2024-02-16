import java.util.Scanner;

public class RenderBudgetCalculator {
    static Scanner keyboardInput = new Scanner(System.in);
    static float renderPrice = 10;
    static float time;
    public static void main(String[] args) {
        System.out.println("Insert the movie duration in minutes");

        time = keyboardInput.nextFloat();
        System.out.println("Render budget: " + "$" + calculate(time));
    }

    public static float calculate(float time) {
        return time * renderPrice;
    }
}
