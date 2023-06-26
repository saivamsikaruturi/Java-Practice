package StreamApiTesting;



public class EmployeeDetails {
    private String name;
    private int empSalary;

    public EmployeeDetails(String name, int empSalary) {
        this.name = name;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee1234{" +
                "name='" + name + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
}

