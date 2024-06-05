package itsStart.OOP.Lesson8.Recursion;

public class Recursion {
    public static void main(String[] args) {

    }
    public int sum (int number) {
        if (number < 1){
            return 0;
        }else {
            int resoult = number + sum(number-1);
            return resoult;
        }

    }
}
