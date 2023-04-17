package base.exceptions;

public class BirthdayFormatException extends RuntimeException{
    public BirthdayFormatException() {
        super("Не верный формат дня рождения!");
    }
}