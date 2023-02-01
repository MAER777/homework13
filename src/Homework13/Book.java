package Homework13;

public class Book {
    private String nameBook;
    private Author author;
    private int agePublisher;

    public Book (String nameBook, Author author, int agePublisher) {
        this.nameBook = nameBook;
        this.author = author;
        this.agePublisher = agePublisher;
    }

    public String getNameBook() {
        return this.nameBook;
    }
    public Author getAuthor() {
        return this.author;
    }

    public int getAgePublisher() {
        return this.agePublisher;
    }

    public void setAgePublisher(int agePublisher) {
        this.agePublisher = agePublisher;
    }

    public String toString() {
        return "Книга - " + this.nameBook + ", под Авторством: " + this.author + ", выпущенная в " + this.agePublisher + " году.";
    }

    @Override
    public boolean equals(Object other) {
        if (getClass() != getClass()) {
            return false;
        }
        Book book = (Book) other;
        return toString().equals(book.toString());
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(toString());
    }
}