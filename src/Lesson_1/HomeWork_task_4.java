/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый
элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь
может увидеть - RuntimeException, т.е. ваше
 */

package Lesson_1;

public class HomeWork_task_4 {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {1, 2, 3, 4};

        int [] array3 = getDivisionOfElements(array1, array2);
        for (int i = 0;i < array3.length;i++ ){
            System.out.print(array3[i] + " ");
        }
    }

    public static int[] getDivisionOfElements(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) throw new RuntimeException("Массивы разной длины");
        int[] resultArr = new int[arr1.length];
        for (int i = 0; i < arr1.length;i++){
            if (arr2[i] == 0) throw new RuntimeException("Деление на ноль");
            resultArr[i] = arr1[i] / arr2[i];
        }
        return resultArr;
    }
}
