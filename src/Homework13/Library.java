package Homework13;

public class Library {
    private final Book[] books;
    private int size;

    public Library() {
        this.books = new Book[20];
    }
    public void addBook (Book book) {
        if (size >= books.length) {
            System.out.println("Упс, закончилось место для книг.");
        }
        Book newBook = new Book (book.getNameBook(), book.getAuthor(), book.getAgePublisher());
        books[size++] = newBook;
    }

    public void removeBook (Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getNameBook().equals(book.getNameBook())) {
                System.out.println("Книга ~~" + book.getNameBook() + "~~ удалена!");
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                books[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void findBook(Book book) {
        for (int i = 0; i < size; i++) {
            Book book1 = books[i];
            if (book1.getNameBook().equals(book.getNameBook())) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Книга не найдена!");
    }

    public void printAllBooks() {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            System.out.println(book.toString());
        }
    }

    public int getSize() {
        return size;
    }
}

