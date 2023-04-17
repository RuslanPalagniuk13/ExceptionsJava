package base.exceptions;

public class CheckQuantityException extends RuntimeException{
    public CheckQuantityException() {
        super("Неверное количество элиментов в введенных данных!");
    }
}