package data;

public class WrongPasswordException extends Throwable{
    public WrongPasswordException(String message) {
        super("Неверное подтверждение пароля");
    }
}
