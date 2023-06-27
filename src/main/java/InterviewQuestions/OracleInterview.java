package InterviewQuestions;

public class OracleInterview {

  public  static void  checkPalindrome(int number){
       int temp=number;int sum=0;int r;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;

        }
         System.out.println (sum);
        if(sum==number)
            System.out.println ("true");
        else
            System.out.println ("false");
       }

       static void fibinocciSeries(int number){
         int i=0; int first=0;int second=1;int result=0;
         while(i<number){
             System.out.print(first+" ,");
             result=first+second;
             first=second;
             second=result;
             i++;
           }
       }
    public static void main(String[] args) {

     checkPalindrome (1221);
     fibinocciSeries (10);

        }

}
