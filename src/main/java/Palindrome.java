public class Palindrome {
    public static void main(String[] args) {
        int number=123;
        int temp=number;
        int remainder=0;
        int result=0;
        while(temp!=0){
            remainder=temp%10;
            result=result*10+remainder;
            temp=temp/10;
        }
        if(result==number){
            System.out.println (number+"is a palindrome");
        }
        else{
            System.out.println ("not a palindrome");
        }
        //Emplyoee id ,name, dept name, salary
        //5 people , max salary 2 dept
//        select * from Employee e where e.salary
//                =(select max(salary) from
//        Employee ee group by ee.dept_name)




    }
}
