/*
������������ ���������, ������� �������� Exception, ����� ������������ ������ ������ ������. ������������ ������
���������� ���������, ��� ������ ������ ������� ������.

 */

package Lesson_2;

import java.util.Scanner;

public class HomeWork_task_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("������� ���� ���:");
        String name = scan.nextLine();
        if (name == "") {
//            System.out.println("�� ����� ������ ������!");
            throw new RuntimeException("�� ����� ������ ������!");
        }else {
            System.out.printf("������ ���� %s!", name);
        }
    }
}
