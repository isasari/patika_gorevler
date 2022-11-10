import java.util.Comparator;

public class SortBook implements
        Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o2.getPageCount()- o1.getPageCount();
    }
}
