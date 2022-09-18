/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
у пользователя ввод данных.
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
            System.out.print("Введите дробное число: ");
            try {
                number = some_number.nextFloat();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("\nВы ввели не число!");
                some_number.nextLine();
            }
        }
    }

}
