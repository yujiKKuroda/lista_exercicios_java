import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner myInput = new Scanner(System.in)) {
            int number = myInput.nextInt();
            String phrase = number + " é ";

            if (((number % 2) == 0) && (number >= 0)) {
                phrase += "par e positivo.";
            } else if (((number % 2) == 0) && (number < 0)) {
                phrase += "par e negativo.";
            } else if (((number % 2) == 1) && (number >= 0)) {
                phrase += "ímpar e positivo.";
            } else {
                phrase += "ímpar e negativo.";
            }

            System.out.println(phrase);
        }
    }
}
