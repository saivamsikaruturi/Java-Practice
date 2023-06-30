package DesignPatterns.Creational.Builder;

public class Driver {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Vamsi","Krishna").build();
        System.out.println(user);


        user = new User.UserBuilder("Vamsi","Krishna").setAge(24).setPhone("7780570356").build();
        System.out.println(user);
    }
}
