import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Matrix {
    public static void main(String[] args) {
//        int clms = 3;
//        int rows = 3;
//        int[][] my = new int[3][3];
//        my = new int[][]{{1, 2, 1}, {1, 0, 1}, {1, 2, 3}};
//        int requiredElemnt = my[1][1];
//        if (requiredElemnt == 0) {
//            for (int i = 0; i < clms; i++) {
//                for (int j = 0; j < rows; j++) {
//                    if (i == 1 || j == 1) {
//                        my[i][j] = 0;
//                    }
//                    System.out.println (my[i][j]);
//                }
//            }
//        }
//    }
        int[] array= new int[]{1, 2, 3, 2, 4};
        Set<Integer> set=new HashSet<> ();
        Arrays.stream (array).filter (e->e<5000 && e>10000).forEach (System.out::println);
     String str="welocome";
     str="helo";
        System.out.println (str);

        

    }


}
