import java.util.*;

public class BookMain3 {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        // нов по - кратък начин за сравнение
        /*books.stream().sorted(Comparator.comparing(Book::getTitle).thenComparing(Book::getYear).reversed());*/

        books.stream().sorted(new BookComparator()).forEach(System.out::println);

        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.println(String.format("%s is before %s", bookOne.getTitle(), bookTwo.getTitle()));
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.println(String.format("%s is before %s", bookTwo.getTitle(), bookOne.getTitle()));
        } else {
            System.out.println("Book are equal");
        }

    }
}
