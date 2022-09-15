/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый
элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
 */

package Lesson_1;

public class HomeWork_task_3 {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {40, 30, 20, 10};

        int [] array3 = getDifferenceOfElements(array1, array2);
        for (int i = 0;i < array3.length;i++ ){
            System.out.print(array3[i] + " ");
        }
    }

    public static int[] getDifferenceOfElements(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) throw new RuntimeException("Массивы разной длины");
        int[] resultArr = new int[arr1.length];
        for (int i = 0; i < arr1.length;i++){
            resultArr[i] = arr1[i] - arr2[i];
        }
        return resultArr;
    }
}
