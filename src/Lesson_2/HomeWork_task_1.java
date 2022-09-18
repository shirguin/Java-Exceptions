/*
���������� �����, ������� ����������� � ������������ ���� �������� ����� (���� float), � ���������� ��������� ��������.
���� ������ ������ ����� �� ������ ��������� � ������� ����������, ������ �����, ���������� �������� ���������
� ������������ ���� ������.
*/

package Lesson_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork_task_1 {

    public static void main(String[] args) {

        float number = getFloatNumber();
        System.out.println(number);
    }

    public static float getFloatNumber() {
        Scanner some_number = new Scanner(System.in);
        float number = 0;

        while (true){
            System.out.print("������� ������� �����: ");
            try {
                number = some_number.nextFloat();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("\n�� ����� �� �����!");
                some_number.nextLine();
            }
        }
    }

}
