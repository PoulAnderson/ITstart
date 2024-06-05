package itsStart.lesson6;

public class STRING_blok {
    public static void main(String[] args) {
        String text = "My name is ";
        String text2 = "What is your name?";
        String nem1 = "Sveta.";
        String nem2 = "Gogol.";
        System.out.println("""
               %s %s %s
               %s 
               """ .formatted(text, nem1,text2,nem2));

        String res = """
                Как вас зовут? 
                - %s
                Хорошо. А вас?
                - %s
                """.formatted(nem1,nem2);
        System.out.println(res);
    }
}
