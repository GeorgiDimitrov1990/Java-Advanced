import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Book implements Comparable<Book> /*implements Iterable<String>*/{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors){
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    private void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setTitle (String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override

    public int compareTo(Book other){
        int compareResult = this.getTitle().compareTo(other.getTitle());
        if (compareResult ==0){
            compareResult = Integer.compare(this.year, other.year);
        }
        return compareResult;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", authors=" + authors.size() +
                '}';
    }

    /*@Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = this.authors.iterator();
        return iterator;
    }*/
}
