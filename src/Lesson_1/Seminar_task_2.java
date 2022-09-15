/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк =
кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */

package Lesson_1;

public class Seminar_task_2 {

    public static void main(String[] args) {

        int[][] array_1 = {{1, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 1, 1, 1}};

        int sumElementsOfArray = getSumElemArray(array_1);
        System.out.printf("Сумма элементов массива равна: %d", sumElementsOfArray);

    }

    public static int getSumElemArray(int[][] array){
        int result = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array.length != array[i].length) {
                    throw new RuntimeException("Массив не квадратный");
                }
                if (array[i][j] != 0 & array[i][j] != 1) {
                    throw new RuntimeException("В массиве присутствует элемент отличный от 0 и 1");
                }
                result += array[i][j];

            }
        }
        return result;
    }
}
