package InterviewQuestions;

public class SecondHighestFromArray {
    public static void main(String[] args) {
        Integer sort[] = {5,2,3,9,5,6,7};
        for(int c=0;c<sort.length;c++){
            for(int x=c+1;x<sort.length;x++) {
                if (sort[c] > sort[x]) {
                    int temp = sort[c];
                    sort[c] = sort[x];
                    sort[x] = temp;
                }
            }

        }
        System.out.println (sort[sort.length-2]);
    }
}
