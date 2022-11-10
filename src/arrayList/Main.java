import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Book cocuk = new Book("Kum Kurdu", "Asa Lind", 48,2014);
        Book tarih= new Book("Inkılap", "Sinan Aydın", 128,2014);
        Book bilim=new Book("Bilim", "Caner",456,2016);
        Book araba=new Book("Binek", "Emre", 123,2011);
        Book okul=new Book("Yaşlı","Öğretmen",412,2010);
        SortBook sortBook=new SortBook();
        SortName sortName=new SortName();
        TreeSet<Book> bookArrayList=new TreeSet<>(sortBook);
        TreeSet<Book> bookTreeSet=new TreeSet<>(sortName);
        bookArrayList.add(cocuk);
        bookArrayList.add(tarih);
        bookArrayList.add(bilim);
        bookArrayList.add(araba);
        bookArrayList.add(okul);
        bookTreeSet.add(cocuk);
        bookTreeSet.add(tarih);
        bookTreeSet.add(bilim);
        bookTreeSet.add(araba);
        bookTreeSet.add(okul);

        for (Book book:bookArrayList
             ) {
            System.out.println(book.getPageCount());
        }

        for (Book book:bookTreeSet
             ) {
            System.out.println(book.getName());
        }



    }
}