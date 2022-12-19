import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int yearPublication;

    Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;

    }String getNameBook() {
        return nameBook;
    }

    Author getAuthor() {
        return author;
    }
    Author setAuthor() {
        return author;
    }


    int getYearPublication() {
        return yearPublication;
    }

    int setYearPublication(int a) {

        return yearPublication = a;
    }

    @Override
    public String toString() {
        return "Произведение - " + nameBook + ", " + ", " +
                "год публикации - " + yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearPublication);
    }
}
