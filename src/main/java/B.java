import java.util.Arrays;

public class B extends A{
    public void getDetailsInB(int id){
        System.out.println ("in b class method");
    }

    public static void main(String[] args) {
        B b=new B();
        b.getEmployeeDetails (1);
        int[]array={1,6,7,4,5};
        int temp = 0;
        for(int i=0;i<array.length;i++) {
            for (int j = i + 1; j<  array.length; j++) {

                if (array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }

        }
        System.out.println (Arrays.toString (array));
    }

}
