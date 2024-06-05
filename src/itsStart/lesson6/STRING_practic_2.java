package itsStart.lesson6;

public class STRING_practic_2 {
    public static void main(String[] args) {
       /* String text1 = "my name is ";
        String text2 = "Slim Shady";
        int text3 = 31;*/
        /*String textF = text1 + text2 + ". Im " + text3;
        System.out.println(textF);*/

        /*String textF = String.format("%s  %s. Im  %d", text1, text2, text3 );
        System.out.println(textF);*/

        //System.out.printf("%s  %s. Im  %d", text1, text2, text3);
        String mark = "Audi";
        String model = "Q3";
        double price = 15_000_000;
        boolean transmissionAvtom = true;
        System.out.printf("-Привет я менеджер салона %s. У нас есть модель %s специально для вас. Ее цена %f. \n-Коробка передач автомат? \n- %s", mark, model, price, transmissionAvtom  ? "да" : "нет");


    }
}
