/*
�������� ����������, ������� ����� ����������� � ������������ ��������� ������ � ������������ �������, �����������
��������:������� ��� �������� ����_�������� �����_�������� ���
������� ������:�������, ���, �������� - ������
����_�������� - ������ ������� dd.mm.yyyy
�����_�������� - ����� ����������� ����� ��� ��������������
��� - ������ ��������� f ��� m.
���������� ������ ��������� ��������� ������ �� ����������. ���� ���������� �� ��������� � ���������, ������� ���
������, ���������� ��� � �������� ������������ ���������, ��� �� ���� ������ � ������ ������, ��� ���������.
���������� ������ ���������� ���������� ���������� �������� � �������� �� ��� ��������� ���������. ���� ������� ������
�� ���������, ����� ������� ����������, ��������������� ���� ��������. ����� ������������ ���������� ���� java � �������
����. ���������� ������ ���� ��������� ����������, ������������ �������� ��������� � �����������, ��� ������ �������.
���� �� ������� � ���������� �����, ������ ��������� ���� � ���������, ������ �������, � ���� � ���� ������ ������
���������� ���������� ������, ����
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

            //��������� ��� �� ������ ���� ������������
            int flag = checkTheAmountOfData(elementsData);
            if (flag == -1) {
                System.out.println("�� ����� �� ��� ������!");
                continue;
            }
            if (flag == -2) {
                System.out.println("�� ����� ������ ������!");
                continue;
            }

            //��������� ������� ������
            if (validationData(elementsData)){
                nameFile = elementsData[0] + ".txt";
                bodyFile = userData;
                break;
            }
        }

        //������ � ����
        saveFile(nameFile, bodyFile);

        System.out.println("��������� ��������� ������!");
    }

    //����� �������� ������ �� ������������
    public static String getUserData(){
        Scanner data = new Scanner(System.in);
        String dataString = "";
        System.out.print("������� ������� ��� �������� ����_�������� �����_�������� ���\n����� ������:");
        dataString = data.nextLine();
        return dataString;
    }

    //����� ��������� ���������� ��������� ������
    public static int checkTheAmountOfData(String[] elementsData){
        if (elementsData.length < 6){
            return -1;
        } else if (elementsData.length > 6) {
            return -2;
        }
        return 0;
    }

    //����� ��������� ������� ������
    public static Boolean validationData(String[] elementsData){
        //�������, ���, �������� ������ ���� �������
        try{
            String userSurname = elementsData[0];
            String userName = elementsData[1];
            String userPatronymic = elementsData[2];
        }catch (ClassCastException e){
            System.out.println("�������, ���, �������� ������ ���� �������");
            return false;
        }

        //��������� ������ ���� ��������
        String birthday = elementsData[3];
        String[] elementsOfBirthday = birthday.split("\\.");
        if (elementsOfBirthday.length != 3){
            System.out.println("He ������ ������ ����");
            return false;
        }

        for (int i = 0; i < elementsOfBirthday.length; i++){
            try{
                int number = Integer.parseInt(elementsOfBirthday[i]);
            }catch(NumberFormatException e){
                System.out.println("���� �������� ������ ���� �������� �������!");
                return false;
            }
        }

        //��������� ����� ��������
        try {
            int phone = Integer.parseInt(elementsData[4]);
        }catch (NumberFormatException nfe){
            System.out.println("������� ������ ��������� ������ �����!");
            return false;
        }

        //��������� ���
        if (!elementsData[5].equals("f") & !elementsData[5].equals("m")) {
            System.out.println("��� ����� ���������� 'f' ��� 'm'!");
            return false;
        }

        return true;
    }

    //����� ���������� ������ � ����
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
