package cloning;

public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address adddress =new Address("Bangalore","501600");
        Employee employee=new Employee("1","vamsi",adddress);
        Employee employee1 = (Employee) employee.clone();
        employee1.setName("krishna");
        employee1.getAddress().setCity("Hyderabad");
        System.out.println("original object:: "+ employee);
        System.out.println("cloned object :: "+ employee1);
    }
}
