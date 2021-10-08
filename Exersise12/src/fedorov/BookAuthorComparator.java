package fedorov;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book>  {

    public  int compare(Book a, Book b){
        int res = a.getAuthor().compareTo(b.getAuthor());
        if (res == 0)
            res = a.getTitle().compareTo(b.getTitle());
        return  res;
    }

}
