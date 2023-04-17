package base.exceptions;

public class FullNameEmptyValueException extends RuntimeException{
    public FullNameEmptyValueException() {
        super("Одно или несколько значении в полном имени пусты!");
    }
}