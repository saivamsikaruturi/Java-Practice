import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NullCheck {
    public static void main(String[] args) {
        List<BigDecimal>g= Arrays.asList (BigDecimal.valueOf (1),BigDecimal.ONE,null);
        g.stream ().map(e->e==null?0:e.intValue ()).forEach (System.out::println);
    }

}
