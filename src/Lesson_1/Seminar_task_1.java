/*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве
заданное значение и возвращает его индекс. При этом, например:
        если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
        если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
        если вместо массива пришел null, метод вернет -3
        придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число
у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю.
Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.*/

package Lesson_1;

import java.util.Scanner;

public class Seminar_task_1 {

    public static final int MIN_ARRAY_LENGTH = 3;

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
//        int [] array = null; для проверки на null

        getUserNumber(array);

    }

    public static void getUserNumber(int[] array){
        Scanner some_number = new Scanner(System.in);
        System.out.print("Введите значение элемента для поиса в массиве: ");
        int userNumber = some_number.nextInt();

        int result = getIndexElement(array, userNumber);

        switch (result) {
            case -1 -> System.out.println("Длина массива меньше заданного минимума");
            case -2 -> System.out.println("Такого элемента нет в заданном массиве");
            case -3 -> System.out.println("Вместо массива пришел Null");
            case -4 -> System.out.println("Значение элемента должно быть только положительным числом");
            default ->
                    System.out.printf("Элемент со значением: %d Находится в массиве под индексом: %d", userNumber, result);
        }
    }

    public static int getIndexElement(int[] array, int userNumber){
        if (array == null) return -3;
        if (array.length < MIN_ARRAY_LENGTH) return -1;
        if (userNumber < 0) return -4;
        for (int i=0; i<array.length; i++){
            if (array[i] == userNumber) return i;
        }
        return -2;
    }
}
