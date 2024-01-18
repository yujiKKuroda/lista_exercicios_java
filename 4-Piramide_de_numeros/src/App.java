public class App {
    public static void main(String[] args) {
        int inputNumber = 9;
        int i = 1;
        StringBuilder pyramidLine = new StringBuilder();

        while (i <= inputNumber) {
            for (int j = 0; j < i; j++) {
                pyramidLine.append(i);
            }
            System.out.println(pyramidLine);
            pyramidLine.delete(0, pyramidLine.length());
            i++;
        }
    }
}
