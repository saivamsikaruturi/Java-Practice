package ExceptionHandling;



public class JobException {

    static  String getJobVacancies(int age, String qualification)  {
        String result="";
        if(age<19){
            result="you are under age for any job ";
        }
          else if(age >=21 && qualification=="B.E"){
               result="We have openings for Junior Developer";
           }
           else if(age>=26 && ( qualification=="M.S" || qualification == "PhD")){
               result="We have openings for Senior Developer";
           }
           else if(age>=19 && ( qualification!="B.E" || qualification!="M.S" || qualification!="PhD")){
               throw new NotEligibleException("We do not have any job that matches your qualification");
           }
           else{
               result="Sorry, we have no openings for now";
           }
        return result;
    }

    static String jobSearch(int age, String qualification) {
            if (age >= 200 || age <= 0) {
                throw new NotEligibleException ("The age entered is not typical for a human being");
            }
        else
            return getJobVacancies (age,qualification) ;


    }

    public static void main(String[] args) {
        System.out.println (jobSearch (18,"Btech"));
    }
}
