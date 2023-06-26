
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int F, int M) {
        int m=A.length;
        int sum=Arrays.stream(A).sum();
        int total=M*(m+F);
        int left=total-sum;
        if(left<=0 || left<F)
            return new int[1];
        int initial=left/F;
        int rem=left%F;
        if(initial>6) return new int[1];
        int[] result=new int[F];
        Arrays.fill(result,initial);
        int i=0;
        while(i<F && rem>0){
            result[i]+=1;
            i++;
            rem--;
        }
        return result;

    }
}
