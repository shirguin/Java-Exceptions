//���������� 3 ������, ����� � ������ �� ��� �������� ������ ����������

package Lesson_1;

public class HomeWork_task_1_2 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 0;
        String str = null;

        int result = divisionNumbers(number1, number2);//ArithmeticException

//        printNumber(number2);//RuntimeException

//        int lengthStr = getLengthOffString(str);//NullPointerException

    }

    public static int divisionNumbers(int num1, int num2){
        return num1 / num2;
    }

    public static void printNumber(int num){
        if (num <= 0) throw new RuntimeException("�� ������ ��������� ������ ������������� �����");
        System.out.println(num);
    }

    public static int getLengthOffString(String str){
        return str.length();
    }
}

// ������ �������� ��� ���� ����������(Exception, RuntimeException)
