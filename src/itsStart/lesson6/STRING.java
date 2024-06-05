package itsStart.lesson6;

import java.util.Arrays;

public class STRING {
    public static void main(String[] args) {
        String text3 = new String ("\n\t num1");
        String text4 = new String("\t num1");
        System.out.println(text4.equals(text3));
        System.out.println(text4 + text3);

        String text = "Hello, BEACH";
        String upperCase = text.toUpperCase(); //перевод в верхний регистр
        System.out.println(upperCase);

        String lowerCase = text.toLowerCase(); //перевод в нижний регистр
        System.out.println(lowerCase);

        int length = text.length(); //длина строки
        System.out.println(length);

        boolean contains = text.contains("Chort");// проверка текста на наличие другого текста
        System.out.println(contains);

        String replaceAll = text.replaceAll("l","o"); //замена опередленных символов в тексте
        System.out.println(replaceAll);

        String repeat = text.repeat(5); // повтортение сторки n количество раз
        System.out.println(repeat);

        String namesBro = "Olya;Kesha;Loxl;LoxFriend"; // объеденение строки в массив и разделение их
        String[] array_bro = namesBro.split(";");
        System.out.println(Arrays.toString(array_bro));

        String word1 = "you"; // Объеденение строк
        String word2 = "\tpidor";
        String res = word1 + word2;
        System.out.println(res);

        boolean startsWith = text.startsWith("Helll"); // начинается на подстроку (проверка)
        System.out.println(startsWith);

        boolean endsWith = text.endsWith("en"); // оканчиваетсвя на подстроку (проверка)
        System.out.println(endsWith);

        String substring = text.substring(0,5); // обрезка строки на определенное количество символов (в примере от 0 до 5)
        System.out.println(substring);

        String repeat1 = "hello".toUpperCase().repeat(5); // работать можно также с самой строкой. потому что string это класс, а строка это объект
        System.out.println(repeat1);


    }

}
