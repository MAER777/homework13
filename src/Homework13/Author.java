package Homework13;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author (String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }
    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public String toString () {
        return this.authorName + " Проверка делегирования версии из класса Author " + this.authorSurname;
    }

//    @Override
//    public boolean equals(Object other) {
//        if (this.getClass() != other.getClass()) {
//            return false;
//        }
//        Author author = (Author) other;
//        return authorName.equals(author.authorName);
//    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return toString().equals(author.toString());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(toString());
    }
}

