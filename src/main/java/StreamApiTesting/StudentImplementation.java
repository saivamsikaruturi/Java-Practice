package StreamApiTesting;



import java.util.List;
import java.util.stream.Collectors;

public class StudentImplementation {
   public long countStudents(List<StudentDemo> list ){
       long count = list.stream ().filter (score -> score.getScore () > 70).count ();
       return count;
    }

    public List<String> getName(List<StudentDemo> list){
        List<String> collect = list.stream ().map (person -> String.join (" ", person.getFirstName (), person.getLastName ()))
                .collect (Collectors.toList ());
      return collect;
    }


}
