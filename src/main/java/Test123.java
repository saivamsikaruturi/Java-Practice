import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test123 {
    public static void main(String[] args) {

        String localDate = LocalDate.now()
                .plusDays(1)
                .format (DateTimeFormatter.ofPattern ("MM/dd/YYYY"));
        System.out.println (localDate);


    }
}
