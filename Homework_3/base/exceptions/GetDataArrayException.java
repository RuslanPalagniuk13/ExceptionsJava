package base.exceptions;

public class GetDataArrayException extends RuntimeException{
    public GetDataArrayException() {
        super("Массив данных равен нулю. Перед получением данных вам необходимо запустить метод parseData!");
    }
}