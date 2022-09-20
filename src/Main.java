import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Katya", "Mamina-Naumova", 41));
        people.add(new Person("Katya", "Mamina", 40));
        people.add(new Person("Katya", "Mamina-Naumova", 50));
        people.add(new Person("Katya", "Mamina-Naumova-Ivanova-iiii", 45));
        people.add(new Person("Katya", "Mamina-Naumova-Ivanova-iii-ooo", 30));
        people.add(new Person("Katya", "Mamina-Naumova-Ivanova", 27));
        System.out.println(people);

        PersonNameAmountWordsComparator personNameAmountWordsComparator = new PersonNameAmountWordsComparator();
        personNameAmountWordsComparator.setAmountWordSurname(3);

        Collections.sort(people, personNameAmountWordsComparator);
        System.out.println(people);

    }
}
