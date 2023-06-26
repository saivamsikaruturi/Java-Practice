//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class SingleThread{
//    public static void main(String[] args) {
//       Test2 t1=new Test2 ();
//       t1.calculateAddition ();
//        ExecutorService executorService = Executors.newFixedThreadPool (2);
//        Runnable r=new Runnable () {
//            @Override
//            public void run() {
//                System.out.println (Thread.currentThread ().getName ());
//            }
//        };
//        Runnable r1=new Runnable () {
//            @Override
//            public void run() {
//                System.out.println (Thread.currentThread ().getName ());
//            }
//        };
//        executorService.submit (r);
//        executorService.submit (r1);
//
//    }
//
//
//}
