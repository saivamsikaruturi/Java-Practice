import java.util.ArrayList;
import java.util.List;

public final class Immutable {
    private int id;
    private String name;
    private List<String> hobbies;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
       List<String> objects = new ArrayList<> ();
        for(String hobby:hobbies){
            objects.add(hobby);
        }
        return objects;
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    public Immutable(int id, String name, List<String> hobbyList) {
        this.id = id;
        this.name = name;
        this.hobbies = new ArrayList<> ();
        for(String hobby: hobbyList){
            hobbies.add(hobby);
        }

    }

    public static void main(String[] args) {
        List<String>h=new ArrayList<> ();
        h.add("cycling");
        h.add("music");
        Immutable immutable=new Immutable (1,"Sai",h);
        h.add ("test");
        System.out.println (immutable);
        boolean a=false;
        if(a=true)
            System.out.println ("hello");
        else
            System.out.println ("bye");


    }

}
