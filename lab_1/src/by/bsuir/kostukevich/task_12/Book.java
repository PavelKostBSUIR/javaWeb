package by.bsuir.kostukevich.task_12;

public class Book implements Cloneable, Comparable<Book> {


    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book() {

    }

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        int hashTitle = (title != null) ? title.hashCode() : 0;
        int hashAuthor = (author != null) ? author.hashCode() : 0;
        return hashTitle + hashAuthor + 10 * price;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object.getClass() != this.getClass()) {
            return false;
        }
        Book book = (Book) object;
        if (book == this) {
            return true;
        }
        return title.equals(book.getTitle()) && author.equals(book.getAuthor()) && price == book.getPrice();
    }

    @Override
    public String toString() {
        return "Book {title = " + title + ", author = " + author + ", price = " + price + "}";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Book o) {
        return this.isbn - o.isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
