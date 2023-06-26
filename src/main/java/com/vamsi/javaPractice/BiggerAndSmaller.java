package com.vamsi.javaPractice;

public class BiggerAndSmaller {
    int bigger=Integer.MIN_VALUE;
    int smaller=Integer.MAX_VALUE;
 public void findBiggerAndSmaller(int[] array) {
        for (int n : array) {
            if (n > bigger)
                bigger = n;
            if (n < smaller)
                smaller = n;
        }
    }

        public  int getBigger(){
            return bigger;
        }
     public  int getSmaller(){
        return smaller;
     }

    public static void main(String[] args) {
        BiggerAndSmaller biggerAndSmaller=new BiggerAndSmaller();
        biggerAndSmaller.findBiggerAndSmaller(new int[]{1,2,3,4});
        System.out.println(biggerAndSmaller.getBigger());
        System.out.println(biggerAndSmaller.getSmaller());
    }

    public int test() {
     return 100;
    }
}
