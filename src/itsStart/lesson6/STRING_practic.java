package itsStart.lesson6;

public class STRING_practic {
    public static void main(String[] args) {
        String text = "my name is Giovanny Giorgio";
        String[] array = text.substring(11).toLowerCase().split(" ");
        for (String word : array){
            System.out.println(word);
            int length = word.length();
            System.out.println(length);
        }
    }
    }


