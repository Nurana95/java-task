import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Book> books= new ArrayList<>();
        books.add(new Book(1, "The Alchemist", "Paulo Coelho", 1988, true));
        books.add(new Book(2, "The Great Gatsby", "F. Scott Fitzgerald", 1925,
                false));
        books.add(new Book(4, "1984", "George Orwell", 1949, false));
        books.add(new Book(5, "Dune", "Frank Herbert", 1965, true));
        books.add(new Book(6, "The Count of Monte Cristo", "Alexandre Dumas",
                1844, true));
        books.add(new Book(7, "Crime and Punishment", "Fyodor Dostoevsky",
                1866, false));
        books.add(new Book(8, "Angels and Demons", "Dan Brown", 2000, true));
        books.add(new Book(9, "The Picture of Dorian Gray", "Oscar Wilde",
                1890, true));
        books.add(new Book(10, "War and Peace", "Leo Tolstoy", 1869, true));
        books.add(new Book(11, "The Master and Margarita", "Mikhail Bulgakov",
                1967, true));
        books.add(new Book(12, "After You", "Jojo Moyes",
                2015, false));
        books.add(new Book(13, "Harry Potter and the Philosopher's Stone",
                "J.K. Rowling", 2001, true));

        List<Book> copyBooks= new ArrayList<>();

        for (Book b:books){
if (b.getYear()>=2000){
copyBooks.add(b);
}}
books.removeIf(n->n.getYear()>=2000);
        System.out.println(books);

    }
}