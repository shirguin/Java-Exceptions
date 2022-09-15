/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику (через коды ошибок или исключения):
Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

 */

package Lesson_1;

public class Seminar_task_5 {

    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        array[0] = 1;
        array[2] = 0;
        array[4] = 1;

        checkArray(array);

    }

    public static void checkArray(Integer[] array){
        for (int i = 0; i < array.length; i++){
            try {
                if (array[i] == null) throw new RuntimeException("null");
            }
            catch (RuntimeException ex){
                System.out.printf("Элемент с индексом %d содержит null\n", i);
            }
        }
    }
}
