public class UserException extends Exception {
    enum UserExceptionType{
        Null;
    }

    UserExceptionType type;
    public UserException(UserExceptionType type,String message){
        super(message);
        this.type=type;
    }
}
