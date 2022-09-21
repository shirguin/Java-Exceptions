/*
Если необходимо, исправьте данный код
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

 */

package Lesson_2;

public class HomeWork_task_2 {

    public static void main(String[] args) {

        int[] intArray = {10, 20, 30, 40, 50, 60, 70, 80, 7};
        int d = 3;
//        int d = 0;

        if (d == 0){
            System.out.println("На ноль делить нельзя");
        }else {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }
}
