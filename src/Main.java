import Homework13.*;

public class Main {
    public static void main(String[] args) {
        test();
        task();
    }

    public static void test() {
        PersonService personService = new PersonService();
        Person mark = new Person("Марк", 25);
        if (personService.isAdult(mark)) {
            System.out.println("За пивком");
        } else {
            System.out.println("Пока рано...)");
        }
        System.out.println(mark);
        mark.increaseAge(0);
        System.out.println(mark);
    }

    public static void task() {
        System.out.println("Задача");
        String trash = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        Author lefTolstoy = new Author("Лев Николаевич","Толстой");
        Author alexPushkin = new Author("Александр Сергеевич", "Пушкин");
        Book decembrists = new Book("Декабристы", lefTolstoy, 1884);
        Book warAndPeace = new Book("Война и Мир", lefTolstoy, 1873);
        Book borisGodunov = new Book("Борис Годунов", alexPushkin, 1825);
        Book mermaid = new Book("Русалка", alexPushkin, 1829);
//        Занесем в библиотеку 4 книги.
        Library library = new Library();
        library.addBook(decembrists);
        library.addBook(warAndPeace);
        library.addBook(borisGodunov);
        library.addBook(mermaid);
        library.printAllBooks();
//
        System.out.println("Размер библиотеки: " + library.getSize());
//
        library.removeBook(mermaid);
        library.findBook(warAndPeace);
        library.removeBook(warAndPeace);
        library.findBook(warAndPeace);

        library.printAllBooks();

    }
}