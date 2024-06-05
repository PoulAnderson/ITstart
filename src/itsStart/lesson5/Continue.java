package itsStart.lesson5;

public class Continue {
    public static void main(String[] args) {
        int[] gameRes = {3, 5 , 8, 6, 9, 7};
        for (int result : gameRes){
            System.out.println(result);
            if (result == 6){
                continue;
            }else {
                System.out.println("отжимаемся");
            }
        }
    }
}
