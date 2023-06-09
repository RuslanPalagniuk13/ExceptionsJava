package Homwork_1;
/* Задача 1.
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */

 public class Task_1 {
    public static void main(String[] args) {
        String[] sArray = {"first str", null, "third str"};
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        division(10, 0);
        printValueByIndex(array,12);
        printStringArray(sArray);

    }
    
    //1 метод исключения - деление на ноль
    public static void division(double firstNum, double secondNum){
        if(secondNum ==  0) throw new ArithmeticException("Делить на ноль нельзя!");
        double result = firstNum/secondNum;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
    }

    //2 метод исключения - выход за пределы заданного массива
    public static void printValueByIndex(int[] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Не существует элемента под таким индексом!");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

    //3 метод исключения - исключение нулевого показателя
    public static void printStringArray(String[] sArray){
        for (String item: sArray){
            if(item == null) throw new NullPointerException("Элемент отсутствует!!!");
            System.out.println(item);
        }
    }
}