public class Multi {
    public synchronized void m1(){
        System.out.println (Thread.currentThread ().getName ());
        System.out.println ("in m1");
    }
    public synchronized void m2(){
        System.out.println (Thread.currentThread ().getName ());
        System.out.println ("in m2");
    }
}
