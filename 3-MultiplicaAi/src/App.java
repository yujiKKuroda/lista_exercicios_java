import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner myInput = new Scanner(System.in)) {
            int inputNumber = myInput.nextInt();
            if (inputNumber <= 0) {
                System.exit(0);
            }

            StringBuilder multiplicationLine = new StringBuilder();
            System.out.println("Tabela de multiplicação por " + inputNumber);
            int i = 1;
            int result = 0;
            while (i <= 10) {
                result = inputNumber * i;
                multiplicationLine.append(inputNumber).append(" x ").append(i).append(" = ").append(result);
                System.out.println(multiplicationLine);
                multiplicationLine.delete(0, multiplicationLine.length());
                i++;
            }
        }
    }
}
