package base.exceptions;

public class MyFileCreateException extends FileCreateException{
    public MyFileCreateException(String message) {
        super("Не удается создать файл в CFileCreator: " + message);
    }
}
