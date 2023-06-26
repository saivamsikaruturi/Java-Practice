package ExceptionHandling;

import com.vamsi.javaPractice.ExceptionHandling.BookedHostelException;
import com.vamsi.javaPractice.ExceptionHandling.StudentDetails;
import com.vamsi.javaPractice.ExceptionHandling.UnavailableRoomException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hostel {
    boolean roomBooked[] = new boolean[200];

     List<StudentDetails>StudentDetailsList=new ArrayList<> ();

      public String bookHostel(StudentDetails s, int roomNo){
        String result="";

        List<Integer> collect = StudentDetailsList.stream ().map (StudentDetails::getRollNo).collect (Collectors.toList ());

        if(roomBooked[roomNo]==true){
            throw  new UnavailableRoomException("Room is already taken");
        }
        else if( collect.contains (s.getRollNo())){

            throw  new BookedHostelException("You cannot book your hostel again");
        }
       else{
           StudentDetailsList.add (s);
           result="Hostel Booked Successfully";
           roomBooked[roomNo]=true;

       }
        return result;
    }

    public long totalAvailableRoom(){
        long count = StudentDetailsList.stream ().mapToInt (StudentDetails::getRoomNo).count ();
        long total = 200 - count;
        return total;
    }

    public static void main(String[] args) {
        Hostel hostel=new Hostel ();

        StudentDetails data1=new StudentDetails ("Steve",10);
        System.out.println (hostel.bookHostel (data1,23));


        StudentDetails data2=new StudentDetails ("Amit",1);
        System.out.println (hostel.bookHostel (data2,145));


        StudentDetails student13=new StudentDetails ("vamsi",21);
        System.out.println (hostel.bookHostel (student13,145));


        System.out.println (hostel.totalAvailableRoom ());
    }
}
