package ExceptionHandling;

public class StudentDetails {
    private String name;
    private int rollNo;
    private int roomNo=-1;

    public StudentDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;

    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    @Override
    public String toString() {
        return "Student11{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", roomNo=" + roomNo +
                '}';
    }
}
