import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str=" Good bye bye world world";
        String[] s = str.split (" ");
        Map<String,Integer> map=new LinkedHashMap<> ();
        for(String word:s){
            if(map.get(word)==null){
                map.put(word,1);
            }
        }
        map.entrySet ().stream ().filter(e->e.getValue ()==1).map(e->e.getKey ()).forEach (System.out::println);
        //primitives to Object
        int a=10;
        Integer integer = Integer.valueOf (a);
        System.out.println (integer);

//        public class XYZ
//        {
//            void msg(Object obj) {
//                System.out.println("Good");
//            }
//            void msg(String str) {
//                System.out.println("Better");
//            }
//            void msg(Integer itr) {
//                System.out.println("Best");
//            }
//            public static void main(String[] args)
//            {
//                XYZ obj = new XYZ();
//                obj.msg(null);
//            }
//        }
//        (int a,int b)->(a+b);
        List<Integer> list=new LinkedList<> ();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        System.out.println (list);
       // count the elemnts
        System.out.println (list.size ());
        //reverse the linked list
        List<Integer>list1=new LinkedList<> ();
        for(int i=list.size ()-1;i>=0;i--){
            list1.add(list.get (i));
        }
        System.out.println (list1);

       }

}
