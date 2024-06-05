package itsStart.lesson4.math;

public class ternary {
    public static void main(String[] args) {
        int breadPrice = 20;
        int cash = 100;
        int moneyAfterShopping = cash - breadPrice;
        int chaildMoney = moneyAfterShopping > 50 ? 10 : 5;
        moneyAfterShopping -= moneyAfterShopping > 50 ? 10 : 5;
        System.out.println(chaildMoney);
        System.out.println(moneyAfterShopping);
    }
}
