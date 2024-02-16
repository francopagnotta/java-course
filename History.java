import java.util.Scanner;

public class History {
    public static void main(String[] args) {
       create();
    }
    private static void create() {
        Scanner keyboardInput = new Scanner(System.in);
        String characterName = keyboardInput.nextLine();

        String history = "\n" +
                "La caja de música\n" +
                characterName + " despertó en la madrugada por una melodía melancólica. Siguiendo el sonido, encontró en el desván una caja de música. Al abrirla, una bailarina giraba al ritmo de una dulce canción. En el fondo, una carta amarillenta revelaba la historia de amor de sus abuelos, escrita al ritmo de la misma melodía.\n" +
                "\n" +
                "Conmovida, " + characterName + " restauró la caja. La melodía la transportaba al mundo de sus abuelos, un recordatorio del amor que perdura más allá del tiempo.";

        System.out.println(history);
    }
}
