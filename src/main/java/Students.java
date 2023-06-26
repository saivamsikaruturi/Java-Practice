import java.util.HashMap;
import java.util.Map;

public class Students {
    private int id;
    private String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

        @Override
    public int hashCode(){
        return id;
    }

    @Override
    public boolean equals(Object obj){
        System.out.println (((Students) obj).getId ());
        if(this.getId ()==(((Students) obj).getId ()))
            return true;

        else
            return  false;
    }
    public static void main(String[] args) {
        Students s=new Students(1,"vamsi");
        Students s1=new Students(1,"vamsi");
        Students s2=new Students (2,"sai");
        Students s3=s1;
        System.out.println (s1.equals (s2));
        System.out.println (s1.equals (s));
        System.out.println (s1.hashCode ());
        System.out.println (s.hashCode ());
        Map<Students,Integer> map=new HashMap<> ();
        map.put(s,1);
        map.put(s1,1);
        System.out.println (map);
    }
}
