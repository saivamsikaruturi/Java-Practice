package ExceptionHandling;

public class UnavailableRoomException extends  RuntimeException{
    public UnavailableRoomException(String s){
        super(s);
    }
}
