import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class HashMapTest {
    public static void main(String[] args) {
//        String s=" I am very bad boy , I am here";
//        Map<String,Integer> map=new HashMap<> ();
//        String[] split = s.split (" ");
//        for(String s1: split){
//            if(map.get(s1)==null){
//                map.put(s1,1);
//            }
//            else{
//                map.put (s1,map.get(s1)+1);
//            }
//        }
//        map.entrySet ().stream ().filter (e->e.getValue ()>1).forEach (System.out::println);
//        Map<String, Long> collect = Arrays.asList (s.split (" ")).stream ().collect (Collectors.groupingBy (Function.identity (), Collectors.counting ()));
//        System.out.println (collect);

        int[] array = {2, 3, 4, 5, 6};
        int[] array1 = {5, 6, 4, 10};
        Set<Integer> set = new HashSet<> ();
//        for (int i=0;i<array.length;i++){
//            set.add (array[i]);
//        }
//        for(int i=0;i<array1.length;i++){
//            if(set.contains (array1[i])){
//                System.out.println (array1[i]);
//            }
//        }


        //another question please
        List<Integer> list = Arrays.asList (1,2,3,4,4,5,6,67,8,10,11);
        List<Integer> list1 = Arrays.stream (array1).boxed ().collect (Collectors.toList ());

//        list.stream ().filter (list1::contains).forEach (System.out::println);
//        int[] array11 = {1, 2, 3, 4, 6};
//        int target = 3;
//        int l = 0;
//        int h = array11.length;
//        System.out.println (extracted(array11,target,l,h));
  part (list,2).stream ().forEach (e->test (e));

    }
   static  <T> Collection<List<Integer>> part(List<Integer>list, int size){
      //  Collection<List<Integer>>list11=();
        final AtomicInteger counter =new AtomicInteger ();
        return list.stream ()
                .collect(Collectors.groupingBy (s->counter.getAndIncrement ()/size)).values ();
   }


    static void test(List<Integer> e){
        System.out.print (e);
    }
}
