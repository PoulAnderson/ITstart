package itsStart.lesson5;

public class Practice_for {
    public static void main(String[] args) {
        int [] num2 = {3, 2, 10, 5, 8};  //вывести на экран четные числа
        for (int num : num2) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("___________________________________________");

                int [] nums3 = {4, 3, 10, 5, 11}; // вывести на экран числа под четным индексом
                for (int i = 0; i <= nums3.length ; i++) {
                    if (i % 2 == 0){
                        System.out.println(nums3[i]);
                    }

                }

            }

        }
