package itsStart.OOP.Lesson8;

public class book {
    String bookName;
    String avtorName;
    int pages;
    boolean isDocumental;

    public book(String booKkName, String avtoRName, int pageS, boolean isDocumentaL) {
        this.bookName = booKkName;
        this.avtorName = avtoRName;
        this.pages = pageS;
        this.isDocumental = isDocumentaL;
    }

    public void stringInBook() {
        int stringInBookk = pages * 40;
        System.out.println(stringInBookk);
    }

    public void woldInBook(int stringInBookk){
        int wordInbook = stringInBookk * pages;
        System.out.println(wordInbook);
    }
}