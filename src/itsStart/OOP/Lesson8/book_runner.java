package itsStart.OOP.Lesson8;

public class book_runner {
    public static void main(String[] args) {
        book master = new book("GodOfWar", "Kratos", 125, false);
        master.stringInBook();
        master.woldInBook(5000);
        System.out.println(master.bookName);
        System.out.println(master.avtorName);
        System.out.println(master.isDocumental);
    }
}
