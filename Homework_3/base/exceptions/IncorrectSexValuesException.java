package base.exceptions;

public class IncorrectSexValuesException extends RuntimeException{
    public IncorrectSexValuesException() {
        super("Неверное значение пола!");
    }
}
