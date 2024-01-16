import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner myInput = new Scanner(System.in)) {
            int inputNumber = myInput.nextInt();
            if (inputNumber == 0) {
                System.exit(0);
            }

            StringBuilder sequence = new StringBuilder();
            sequence.append("0");

            if (inputNumber > 1) {
                int i = 2;
                int current = 1;
                int last = 0;
                while (i <= inputNumber) {
                    sequence.append(" ").append(current);
                    current = current + last;
                    last = current - last;
                    i++;
                }
            }
            System.out.println(sequence);
        }
    }
}
