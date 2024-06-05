package itsStart.lesson5;

public class WhileExample {
    public static void main(String[] args) {
        int count = 1;
        while (count < 100){
            count ++;
            System.out.println(count);
        }
        System.out.println("while 1 finished");

        while (true){
            count ++;
            System.out.println(count);
            if (count == 1000) {
                break;
            }

        }
        System.out.println("while 2 finished");
    }
}
