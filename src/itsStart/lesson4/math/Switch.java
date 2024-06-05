package itsStart.lesson4.math;

public class Switch {
    public static void main(String[] args) {
        int dayNum = 8;
        switch (dayNum){
            case 1 -> System.out.println("понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Нет такого дня недели");

        }
    }
}
