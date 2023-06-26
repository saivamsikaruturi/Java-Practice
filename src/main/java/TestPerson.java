public class TestPerson {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "TestPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TestPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
