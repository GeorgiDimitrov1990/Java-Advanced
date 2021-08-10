import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books){
        this.books = books;
    }

    private  class LibIterator implements  Iterator<Book>{
        private int index;
        public LibIterator(){
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < books.length;
        }

        @Override
        public Book next() {
            return books[this.index++];
        }
    }

    @Override
    public Iterator<Book> iterator() {
        // начин без да създаваме вътрешен клас(по - удобен за мен).ИЗТРИВАМЕ КЛАС LibIterator.
        /*return new Iterator<Book>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return this.index < books.length;
            }

            @Override
            public Book next() {
                return books[this.index++];
            }
        };*/
        return new LibIterator();
    }
}
