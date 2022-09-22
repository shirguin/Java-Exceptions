/*
Создайте метод doSomething(), который может быть источником одного из типов checked exceptions (тело самого метода
прописывать не обязательно). Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().
 */

package Lisson_3;

public class Seminar_task_1 {

    public static void main(String[] args) {
        doSomething();

        try {
            doSomething_2();
        }catch (RuntimeException ex){
            System.out.println("Деление на ноль вариант 2!!!");
        }
    }
    public static void doSomething() {
        try{
            int a = 10/0;
        }catch (RuntimeException ex){
            System.out.println("Деление на ноль!!!");
        }
    }

    public static void doSomething_2() throws RuntimeException{
         int a = 10/0;
    }
}
