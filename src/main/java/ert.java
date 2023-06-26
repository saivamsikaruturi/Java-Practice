public class ert {
    static Multi m=new Multi ();
    public static void main(String[] args) {

m();

    }
   static void m(){
       ert e=new ert();
     MyThread m1=new MyThread (e);
     m1.start ();
    }


}
