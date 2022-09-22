/*
Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные
пробелом:Фамилия Имя Отчество дата_рождения номер_телефона пол
Форматы данных:фамилия, имя, отчество - строки
дата_рождения - строка формата dd.mm.yyyy
номер_телефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.
Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код
ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных
не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать
свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны
записаться полученные данные, вида
 */

package Lisson_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        String nameFile = "";
        String bodyFile = "";

        while (true){
            String userData = getUserData();
            String[] elementsData = userData.split(" ");

            //Проверяем все ли данные ввел пользователь
            int flag = checkTheAmountOfData(elementsData);
            if (flag == -1) {
                System.out.println("Вы ввели не все данные!");
                continue;
            }
            if (flag == -2) {
                System.out.println("Вы ввели лишние данные!");
                continue;
            }

            //Проверяем форматы данных
            if (validationData(elementsData)){
                nameFile = elementsData[0] + ".txt";
                bodyFile = userData;
                break;
            }
        }

        //Запись в файл
        saveFile(nameFile, bodyFile);

        System.out.println("Программа завершила работу!");
    }

    //Метод получает данные от пользователя
    public static String getUserData(){
        Scanner data = new Scanner(System.in);
        String dataString = "";
        System.out.print("Введите Фамилия Имя Отчество дата_рождения номер_телефона пол\nчерез пробел:");
        dataString = data.nextLine();
        return dataString;
    }

    //Медод проверяет количество введенных данных
    public static int checkTheAmountOfData(String[] elementsData){
        if (elementsData.length < 6){
            return -1;
        } else if (elementsData.length > 6) {
            return -2;
        }
        return 0;
    }

    //Метод проверяет форматы данных
    public static Boolean validationData(String[] elementsData){
        //Фамилия, имя, отчество должны быть строкой
        try{
            String userSurname = elementsData[0];
            String userName = elementsData[1];
            String userPatronymic = elementsData[2];
        }catch (ClassCastException e){
            System.out.println("Фамилия, Имя, Отчество должны быть строкой");
            return false;
        }

        //Проверяем формат даты рождения
        String birthday = elementsData[3];
        String[] elementsOfBirthday = birthday.split("\\.");
        if (elementsOfBirthday.length != 3){
            System.out.println("He верный формат даты");
            return false;
        }

        for (int i = 0; i < elementsOfBirthday.length; i++){
            try{
                int number = Integer.parseInt(elementsOfBirthday[i]);
            }catch(NumberFormatException e){
                System.out.println("Дата рождения должна быть записана цифрами!");
                return false;
            }
        }

        //Проверяем номер телефона
        try {
            int phone = Integer.parseInt(elementsData[4]);
        }catch (NumberFormatException nfe){
            System.out.println("Телефон должен содержать только цифры!");
            return false;
        }

        //Проверяем пол
        if (!elementsData[5].equals("f") & !elementsData[5].equals("m")) {
            System.out.println("Пол может обозначать 'f' или 'm'!");
            return false;
        }

        return true;
    }

    //Метод записывает данные в файл
    public static void saveFile(String nameFile, String bodyFile){
        try(FileWriter writer = new FileWriter(nameFile, false))
        {
            writer.write(bodyFile);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
