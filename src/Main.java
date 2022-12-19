public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Author author1 = new Author("Фёдор", "Достоевский");

        Book book = new Book("Война и мир", author, 1970);
        Book book1 = new Book("Преступление и наказание", author1, 1974);

        book1.setYearPublication(1975);

        System.out.println(author);
        System.out.println(book);
        System.out.println();
        System.out.println(author1);
        System.out.println(book1);

    }
}