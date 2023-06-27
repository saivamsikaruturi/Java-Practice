package InterviewQuestions;


import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.*;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class StringDemo {

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib (n - 1) + fib (n - 2);
    }


    public static void main(String[] args) throws IOException {


        /*palindrome*/
        String p = "madam";
        StringBuilder s = new StringBuilder ();
        StringBuilder append = s.append (p);
        StringBuilder reverse = append.reverse ();
        if (p.equals (reverse.toString ())) {
            System.out.println ("palindrome");
        }

        /*anagram*/
        String p1 = "LISTEN";
        String p2 = "silent";
        char q1[] = p1.toLowerCase ().toCharArray ();
        char q2[] = p2.toCharArray ();
        Arrays.sort (q1);
        Arrays.sort (q2);
        System.out.println (q1);
        System.out.println (q2);
        boolean equals = Arrays.equals (q1, q2);
        if (equals) {
            System.out.println ("anagram");

        } else {
            System.out.println ("not anagram");
        }

        // armstrong number 153: 1^3+ 5^3 + 3^3 = 1 + 125+ 27 = 153
        //  ("cubes of number")

        int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow (remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println (number + " is an Armstrong number.");
        else
            System.out.println (number + " is not an Armstrong number.");



        /* HCF/GCD OF 2 NUMBERS*/
        int a = 12;
        int b = 36;
        int hcf = 0;
        for (int i = 1; i < a || i < b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }

        }
        System.out.println (hcf);



        /*FIBINOCCI SERIES*/
        /*   In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8
            F(n)=F(N-1)+F(N-2); */

        int n = 3;
        System.out.println (fib (n));


        /*fibinocci*/
        int c = 0, d = 1;
        int x = 0;
        System.out.println (0);
        System.out.println (1);
        for (int i = 3; i < 10; i++) {
            x = c + d;
            System.out.println (x);
            c = d;
            d = x;
        }


        System.out.println ("Maximum occurence of a number");
        int arr1[] = {2, 3, 1, 3, 2, 2};
        Map<Integer, Integer> t1 = new HashMap<> ();
        for (int arrValue : arr1) {
            if (t1.get (arrValue) == null) {
                t1.put (arrValue, 1);
            } else {
                t1.put (arrValue, t1.get (arrValue) + 1);
                System.out.println (t1);
            }
        }
        t1.entrySet ().stream ().filter (j -> j.getValue () > 1).sorted ((x1, x2) -> x2.getKey ().compareTo (x1.getKey ())).limit (1).forEach (h -> System.out.println (h.getKey ()));

        /*Concurrent Hash Map*/
        ConcurrentHashMap<Integer, Integer> l = new ConcurrentHashMap<> ();
        ConcurrentHashMap<Integer, Integer> l1 = new ConcurrentHashMap<> ();
        System.out.println ("Hash map");
        l.put (1, 1);
        l.put (2, 2);
        l.remove (1, 1);
        l.putIfAbsent (3, 1); //it will check the key present already in the map
        l.putIfAbsent (4, 3);
        l1.putAll (l);
        l.entrySet ().stream ().forEach (System.out::println);
        l1.entrySet ().stream ().forEach (System.out::println);
        System.out.println ("for each remaining");
        l1.entrySet ()
                .iterator ()
                .forEachRemaining (System.out::println);

        java.util.List<Integer> m = Arrays.asList (455, 18, 20, 90, 2000);
        Integer integer = m.stream ().max (Comparator.naturalOrder ()).get ();
        System.out.println (integer);








        /*get non repeated characters from string*/
        String st = "SAMSUNG";
        char[] ch1 = st.toCharArray ();
        HashMap<Character, Integer> mapObj = new HashMap<> ();
        for (char ch : ch1) {
            if (mapObj.get (ch) == null)
                mapObj.put (ch, 1);
            else
                mapObj.put (ch, mapObj.get (ch) + 1);

        }

        mapObj.entrySet ().stream ().filter (m1 -> m1.getValue () == 1).map (m2 -> m2.getKey ()).forEach (System.out::println);

        /*Reverse a String*/

        String str = "I am a java programming language sentence";
        String arr[] = str.split ("\\s");
        String result1 = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result1 = result1 + arr[i] + " ";
        }
        System.out.println (result1);


        /*flatmap*/

        java.util.List<String> str1 = new ArrayList<> ();
        str1.add ("java");
        str1.add ("oops");
        str1.add ("spring boot");
        str1.stream ().flatMap (x1 -> {
            String[] value = x1.split ("");
            return Arrays.asList (value).stream ();
        });

        final int[] finalArray = {1, 2, 3};
        finalArray[1] = finalArray[1] * 10;
        System.out.println (finalArray[1]);


        FileInputStream file = new FileInputStream ("C:\\Users\\karukris\\Documents\\BLD API GATEWAY DETAILS.txt");
        file.read ();
        System.out.println (file.read ());

        try {
            // create a new file object
            File file123 = new File ("C:\\Users\\karukris\\Documents\\BLD API GATEWAY DETAILS.txt");

            // create an object of Scanner
            // associated with the file
            Scanner sc = new Scanner (file123);

            // read each line and
            // count number of lines
            int count = 0;
            while (sc.hasNextLine ()) {
                sc.nextLine ();
                count++;
            }
            System.out.println ("Total Number of Lines: " + count);

            // close scanner
            sc.close ();
        } catch (Exception fg) {
            fg.getStackTrace ();
        }

        int[] array123 = {1, 2, 3, 4, 5, 6, 7};
        int sum2 = Arrays.stream (array123).sum ();
        System.out.println (sum2);
        int sss = 0;
        for (int i1 = 0; i1 < array123.length; i1++) {
            sss += array123[i1];

        }
        System.out.println (sss);
        int number12 = 143;
        int reverse12 = 0;
        while (number12 != 0) {
            int remainder12 = number12 % 10;
            reverse12 = reverse12 * 10 + remainder12;
            number12 = number12 / 10;
        }
        System.out.println (reverse12);

        int[] ae = {1, 3, 2, 5, 4, 7};
        for (int i11 = 0; i11 < ae.length; i11++) {
            for (int j11 = i11 + 1; j11 < ae.length; j11++) {
                int tmp = 0;
                if (ae[i11] > ae[j11]) {
                    tmp = ae[i11];
                    ae[i11] = ae[j11];
                    ae[j11] = tmp;

                }

            }
            System.out.println (ae[i11]);
        }
        int sum111 = 0;
        for (int i111 = 0; i111 < ae.length; i111++) {
            sum111 += ae[i111];
        }
        System.out.println (sum111);
        int sum1234 = 0;
        for (int i1234 = 0; i1234 <= 7; i1234++) {
            sum1234 += i1234;
        }
        System.out.println (sum1234 - sum111);




        LinkedHashSet set = new LinkedHashSet ();
        set.add("kl");
        set.add (1);
        set.add (2);
        set.add (3);
        set.add (2);
        set.add("dg");
        System.out.println (set);

        HashSet set1 = new HashSet ();
        set1.add ("a");
        set1.add ("b");
        set1.add ("d");
        set1.add (null);
        set1.add (34);
        System.out.println (set1);

        String[] res={"vamsi","General","sai"};
        Predicate<String> employeePredicate=e->e.length ()>4;
        for(String s1:res){
            if(employeePredicate.test (s1))
            {
                System.out.println (s1);
            }
        }
        Employee e = new Employee (46050451, "Sai Vamsi", 23, "Male", "Java", LocalDate.of (2020, 12, 15), 27000);
        Employee e1 = new Employee (46050452, "Vamsi", 24, "Male", "Java", LocalDate.of (2020, 12, 15), 10000);
        Employee e2 = new Employee (46050453, "Rashmi", 33, "Female", "Full Stack", LocalDate.of (2014, 12, 15), 120000);
        Employee e3 = new Employee (46050454, "Gayatri", 25, "Female", "Data Base", LocalDate.of (2017, 01, 01), 27000);
        Employee e4 = new Employee (46050455, "Need Smith", 28, "Male", "UI", LocalDate.of (2018, 12, 15), 70000);

        java.util.List<Employee> employeeList = Arrays.asList (e, e1, e2, e3, e4);
        java.util.List<Integer> collect = employeeList.stream ()
                .sorted (Comparator.comparing (Employee::getSalary).reversed ()).limit(3).map(Employee::getSalary).collect (Collectors.toList ());
          System.out.println ("collect"+collect);
//        Predicate<Employee> eSalary=e123->e123.getSalary ()>50000;
//        for(Employee e1234:employeeList){
//            if(eSalary.test (e1234)){
//                System.out.println (e1234);
//            }
//        }
        Function<String,Integer> function=fn->fn.length ();
        System.out.println(function.apply("durga"));

        Function<String,String> function1=fn->fn.toUpperCase();
        System.out.println(function1.apply("durga"));

        Function<Integer,Double> function2=fn->fn.doubleValue ();
        System.out.println(function2.apply(1));

        Function<Employee, String> function3=emp->{
            int salary=emp.getSalary ();
            String des="";
            if(salary>100000)
                des="Sr Consultant";
            else if(salary>50000)
                des="Consultant";
            else
                des="Sr Analyst";
        return  des;
        };
        for(Employee e11:employeeList){
            System.out.println (e11.getEmpName ());
            System.out.println (function3.apply (e11));
        }

        Consumer<String> consumer=cn->System.out.println (cn);
        consumer.accept ("Capgemini");

        Consumer<Employee> emp1=emp123->{
            System.out.println (emp123.getEmpName ());
            System.out.println (emp123.getEmpId ());
        };
        for(Employee employee:employeeList){
            emp1.accept (employee);
        }

        Supplier<Date> date=()->new Date ();
        System.out.println (date.get ());

        Supplier<String> otp=()->{
            String otp1="";
            for(int i=0;i<=6;i++){
                otp1=otp1+(int)(Math.random ()*10);
            }
            return otp1;

        };
        System.out.println (otp.get ());
        String equals1="sai";
        String equals2="sai";
        String w=new String ("sai");
        String w1=new String ("sai");

        System.out.println ("equals");
        System.out.println (equals1.equals (equals2));
        System.out.println (w==w1);



        int autoBoxing=123;
        System.out.println(Integer.valueOf (autoBoxing));

        Integer autoUnBoxing=new Integer (23);
        System.out.println(autoUnBoxing.intValue ());


        String num="123";
        int i = Integer.parseInt (num);
        System.out.println (i);

        Integer num1=123;
        String s1 = num1.toString ();
        System.out.println (s1);

        System.out.println (employeeList);


       CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<> ();
        al.add("CTS");
        al.add("TCS");
        al.add("CAPGEMINI");
        al.add("Infosys");
        for(String hs:al){
            if(hs.equals ("Infosys")){
                al.remove (hs);
            }
        }
        System.out.println (al);


        String sai="sai Vamsi";
        System.out.println(sai.substring (0,4));

        String level="lev";
        String level1="";
        char[] try1 = level.toCharArray();
        for(int bc=try1.length-1;bc>=0;bc--){
        level1+=try1[bc];

        }
     if(level1.equals (level))
         System.out.println ("true");

      String st1="Gayatri Vadla";
        StringBuffer sb = new StringBuffer();

        for (char c1 : st1.toCharArray() )
        {
            sb.append(getBeforeChar(c1));
        }
        System.out.println(sb) ;


        System.out.println("Enter the String");
        String s123="abc";
        char[] ch=s123.toCharArray();
        int val=0;
        String s12="";
        for(int i1234=0;i1234<ch.length;i1234++)
        {
            val=ch[i1234]+1;
            char c123=(char)val;
            s12=s12+c123;
        }
        System.out.println(s12);

        List<Integer> integer1 = Arrays.asList(1,7,8,9,5,2,36,4,78);
        Integer addition = integer1.stream().mapToInt(Integer :: intValue).sum();
      System.out.println ("addition "+addition);
        BigDecimal value1 = new BigDecimal ("4.6886").setScale(5, RoundingMode.HALF_EVEN);
        System.out.println(Math.ceil(123.72));
        System.out.println ("value    "+value1);
    }


    public static char getBeforeChar(char character)
    {
        char nextChar;
        int ascii = (int) character;
        int lastValue=122;

        if (ascii ==32)
            nextChar = (char) ascii;
        else if (97==ascii || ascii<=102)
            nextChar = (char)(lastValue-3);
        else
            nextChar = (char) (ascii -3);
        return nextChar;




    }

}
