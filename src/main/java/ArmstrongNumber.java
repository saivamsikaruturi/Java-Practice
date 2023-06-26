public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int rem=0;
        int result=0;
        while(temp!=0){
            rem=temp%10;
            result=result+rem*rem*rem;
            temp=temp/10;
        }
        if(result==n)
            System.out.println ("armstrong number");
    }
}
