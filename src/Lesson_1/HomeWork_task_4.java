/*
���������� �����, ����������� � �������� ���������� ��� ������������� �������, � ������������ ����� ������, ������
������� �������� ����� �������� ��������� ���� �������� �������� � ��� �� ������. ���� ����� �������� �� �����,
���������� ���-�� ���������� ������������. �����: ��� ���������� ������ ������������ ����������, ������� ������������
����� ������� - RuntimeException, �.�. ����
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
        if (arr1.length != arr2.length) throw new RuntimeException("������� ������ �����");
        int[] resultArr = new int[arr1.length];
        for (int i = 0; i < arr1.length;i++){
            if (arr2[i] == 0) throw new RuntimeException("������� �� ����");
            resultArr[i] = arr1[i] / arr2[i];
        }
        return resultArr;
    }
}
