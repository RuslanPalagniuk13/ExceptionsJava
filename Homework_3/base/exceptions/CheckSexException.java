package base.exceptions;

public class CheckSexException extends RuntimeException{
    public CheckSexException() {
        super("Значение пол пусто!");
    }
}
