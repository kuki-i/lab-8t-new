package ua.opnu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<BookData> books = new ArrayList<>();

        BookData book1 = new BookData("Гаррі Поттер");
        book1.setReviews(10);
        book1.setTotal(48.0);
        books.add(book1);

        BookData book2 = new BookData("Володар перснів");
        book2.setReviews(10);
        book2.setTotal(50.0);
        books.add(book2);

        BookData book3 = new BookData("Алхімік");
        book3.setReviews(5);
        book3.setTotal(25.0);
        books.add(book3);

        BookData book4 = new BookData("Невідома книга");
        book4.setReviews(0);
        book4.setTotal(0.0);
        books.add(book4);

        System.out.println("--- ДО СОРТУВАННЯ ---");
        for (BookData book : books) {
            System.out.println(book.getTitle() + " (Рейтинг: " + book.getRating() + ")");
        }

        Collections.sort(books);

        System.out.println("\n--- ПІСЛЯ СОРТУВАННЯ ---");
        for (BookData book : books) {
            System.out.println(book.getTitle() + " (Рейтинг: " + book.getRating() + ")");
        }
    }
}

