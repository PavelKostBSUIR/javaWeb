package by.bsuir.kostukevich.task_12;

import java.util.Comparator;

public class ComparatorAuthorNamePrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getAuthor().compareTo(o2.getAuthor());
        if (result == 0) {
            result = o1.getTitle().compareTo(o2.getTitle());
            if (result == 0) {
                return o1.getPrice() - o2.getPrice();
            }
        }
        return result;
    }
}
