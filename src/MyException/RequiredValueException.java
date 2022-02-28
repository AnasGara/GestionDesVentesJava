package MyException;

public class RequiredValueException extends Exception{
    public RequiredValueException(String msg){
        super(msg);
    }
}
