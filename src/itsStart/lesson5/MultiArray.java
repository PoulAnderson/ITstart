package itsStart.lesson5;

public class MultiArray {
    public static void main(String[] args) {
        int[] group1 = {172, 205, 178};
        int[] group2 = {168, 177, 181};
        int[][] g12oups = {group1, group2};
        nameFor:
        for (int[] array : g12oups) {
            for (int tell : array){
                if (tell == 178){
                    System.out.println(tell + " Вор найден");
                    break nameFor;
                }else System.out.println(tell + " Это не вор");

            }

        }


    }
}
