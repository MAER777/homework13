import Homework13.Author;
import Homework13.Book;
import Homework13.Person;
import Homework13.PersonService;

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
        Author lefTolstoy = new Author("Лев","Толстой");
        Author lefTolstoyCopy = new Author("Лев","Толстой");
        Author finLand = new Author("Фин", "Ленд");
        Author finLandCopy = new Author("Фин", "Ленд");
        Book trashDone = new Book("Тихий Дон", lefTolstoy, 1670);
        Book trashDoneCopy = new Book("Тихий Дон", lefTolstoy, 1670);
        Book tinyWane = new Book("Тини Вейн", finLand, 2000);
        Book tinyWaneCopy = new Book("Тини Вейн", finLand, 2000);
        System.out.println(trash);
        System.out.println(lefTolstoy);
        System.out.println(lefTolstoyCopy);
        System.out.println(finLand);
        System.out.println(trash);
        System.out.println(trashDone);
        System.out.println(tinyWane);
        String s = trashDone.toString();
        System.out.println(s);
        System.out.println(trash);
        System.out.println(finLand.equals(finLandCopy));
        System.out.println(lefTolstoyCopy.equals(finLandCopy));
        System.out.println(lefTolstoy.equals(lefTolstoyCopy));
        System.out.println(trash);
        System.out.println(trashDone.equals(trashDoneCopy));
        System.out.println(trashDone.equals(tinyWaneCopy));
        System.out.println(tinyWane.equals(tinyWaneCopy));
        System.out.println(trash);
        System.out.println(finLand.hashCode());
        System.out.println(lefTolstoy.hashCode());
    }
}