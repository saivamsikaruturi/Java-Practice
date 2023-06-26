import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test1234 {
    public static void main(String[] args) {
        TestPerson t=new TestPerson ("Vamsi",23);
        TestPerson t1=new TestPerson ("Sai",23);
        TestPerson t2=new TestPerson ("Naveen",40);
        List<TestPerson>list= Arrays.asList (t,t1,t2);
        Map<Integer, List<TestPerson>> collect = list.stream ().collect (Collectors.groupingBy (TestPerson::getAge));
        List<Integer>integers=Arrays.asList (1,2,3,1,2,4);

    }
}
