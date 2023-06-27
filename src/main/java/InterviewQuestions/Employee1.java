package InterviewQuestions;


public class Employee1 {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String newJoiner;
    private String learningPending;
    private int salary;
    private int rating;

    public Employee1(String employeeId, String firstName, String lastName, String email, String gender, String newJoiner, String learningPending, int salary, int rating) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.newJoiner = newJoiner;
        this.learningPending = learningPending;
        this.salary = salary;
        this.rating = rating;
    }

    public String getEmployeeId() {
        return employeeId;
    }



    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNewJoiner(String newJoiner) {
        this.newJoiner = newJoiner;
    }

    public void setLearningPending(String learningPending) {
        this.learningPending = learningPending;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee1() {
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getNewJoiner() {
        return newJoiner;
    }

    public String getLearningPending() {
        return learningPending;
    }

    public int getSalary() {
        return salary;
    }

    public int getRating() {
        return rating;
    }
}