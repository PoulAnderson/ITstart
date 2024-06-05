package itsStart.lesson4.math;

public class Practice {
    public static void main(String[] args) {
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isWorkWheel1 = true;
        boolean isWorkWheel2 = false;
        boolean isWorkWheel3 = false;
        boolean isWorkWheel4 = true;
        int wheels = 0;
        wheels += isWorkWheel1 ? 1:0;
        wheels += isWorkWheel2 ? 1:0;
        wheels += isWorkWheel3 ? 1:0;
        wheels += isWorkWheel4 ? 1:0;

        if ((wheels>=3) && isWorkTransmission && isWorkEngine){
            System.out.println("Автомобиль готов к эксплуатации");
        }
        else {
            System.out.println("Автомобиль сломан");
        }

    }
}
