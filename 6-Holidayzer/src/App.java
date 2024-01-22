import java.util.ArrayList;
import java.util.List;

public class App {
    static List<Holiday> holidays = new ArrayList<>();
    static {
        holidays.add(new Holiday("01-01-2024", "Confraternização Mundial"));
        holidays.add(new Holiday("12-02-2024", "Carnaval"));
        holidays.add(new Holiday("13-02-2024", "Carnaval"));
        holidays.add(new Holiday("29-03-2024", "Sexta-feira Santa"));
        holidays.add(new Holiday("21-04-2024", "Tiradentes"));
        holidays.add(new Holiday("01-05-2024", "Dia do Trabalho"));
        holidays.add(new Holiday("30-05-2024", "Corpus Christi"));
        holidays.add(new Holiday("07-09-2024", "Independência do Brasil"));
        holidays.add(new Holiday("12-10-2024", "Nossa Senhora Aparecida"));
        holidays.add(new Holiday("02-11-2024", "Finados"));
        holidays.add(new Holiday("15-11-2024", "Proclamação da República"));
        holidays.add(new Holiday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
        holidays.add(new Holiday("25-12-2024", "Natal"));
    }

    public static void printHolidays(List<Holiday> holidays) {
        for (int i = 0; i < holidays.size(); i++) {
            holidays.get(i).toString();
        }
    }

    public static void main(String[] args) {
        printHolidays(holidays);
    }
}
