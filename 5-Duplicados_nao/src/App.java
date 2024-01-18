import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};

        for (int i = 0; i < array1.length; i++) {
            if (Arrays.asList(array2).contains(array1[i])) {
                System.out.println(array1[i]);
            }
        }
    }
}
