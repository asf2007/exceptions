package view;

import java.util.Scanner;

public class ViewNameCard {
    public String inputData(){
        System.out.println("для выхода введите stop");
        System.out.println("фамилия, имя, отчество - строки");
        System.out.println("датарождения - строка формата dd.mm.yyyy");
        System.out.println("номертелефона - целое беззнаковое число без форматирования");
        System.out.println("пол - символ латиницей f или m");
        System.out.println("Введите данные Фамилия Имя Отчество датарождения номертелефона пол через пробел:");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        return data;
    }
}