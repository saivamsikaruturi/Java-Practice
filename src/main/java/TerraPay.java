import java.util.Arrays;

public class TerraPay {
  //  Write a program to swap two numbers without using a third variable?
  public static void main(String[] args) {
      int a=10;
      int b=20;
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println (a);
      System.out.println (b);

      //Write a Java Program to find the 3rd-highest number in an array?
      int[] array={1,2,3,4,9,6,8,5,7};
      int temp=0;
      for(int i=0;i<array.length;i++) {
          for (int j = i + 1; j < array.length; j++) {
              if (array[i] < array[j]) {
                  temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
              }
          }
      }
      System.out.println (Arrays.toString (array));
      System.out.println (array[2]);
  }

}
