/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
показаться сообщение, что пустые строки вводить нельзя.

 */

package Lesson_2;

import java.util.Scanner;

public class HomeWork_task_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите Ваше имя:");
        String name = scan.nextLine();
        if (name == "") {
//            System.out.println("Вы ввели пустую строку!");
            throw new RuntimeException("Вы ввели пустую строку!");
        }else {
            System.out.printf("Добрый день %s!", name);
        }
    }
}
