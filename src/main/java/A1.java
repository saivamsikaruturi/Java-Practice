import java.time.LocalDate;

public class A1{
    public static void main(String[] args) {
        FunctionalInterface f =(a)->System.out.println(a);
         f.printSquareOfNumber (3);
    }
    public LocalDate getDate(){
        return LocalDate.now ();
    }

}
