package itsStart.lesson4.math;

public class boolean_logic {
    public static void main(String[] args) {
        boolean isBoughtBread = true;
        boolean isBoughtMilk = true;
        boolean isBoughtBreadAndMilk = isBoughtBread && isBoughtMilk;

        if (isBoughtBreadAndMilk) {
            System.out.println("Молодец сынок, ты все купил");
        } else if (isBoughtBread) {
            System.out.println("Молодец сын, купил хлеб");
        } else if (isBoughtMilk) {
            System.out.println("Молодец сын, купил молоко");
        } else {
            System.out.println("Bad boy, потратил все на candy");
        }
        boolean isBoughtBreadOrMilk = true || true; //Оператор "Или"
        if (isBoughtBreadOrMilk){
            System.out.println("yes");
        }else {
            System.out.println("No");}


        boolean isBoughtCandy = false;   //Оператор "Не"
        if (!isBoughtCandy){
            System.out.println("мама хвалит сына");
        }





    }
}
