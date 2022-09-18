/*
��� ��������� ���, ��������� ��� ���, ��� ���������
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("���-�� ����� �� ���...");
   } catch (NullPointerException ex) {
       System.out.println("��������� �� ����� ��������� �� null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("������ ������� �� ������� ������ �������!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

 */

package Lesson_2;

public class HomeWork_task_3 {

    public static void main(String[] args) {

        try {
            int a = 90;
            int b = 3;
            if (b == 0){
                System.out.println("������� �� ����!!!");
            }else {
                System.out.println(a / b);
            }

            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("������ ������� �� ������� ������ �������!");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
