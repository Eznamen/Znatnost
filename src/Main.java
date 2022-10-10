import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Katya", "Mamina-Naumova", 41));
        people.add(new Person("Katya", "Mamina", 40));
        people.add(new Person("Katya", "Mamina Naumova", 50));
        people.add(new Person("Katya", "Mamina-Naumova-Ivanova-iiii", 45));
        people.add(new Person("Katya", "Mamina Naumova Ivanova iii ooo", 30));
        people.add(new Person("Katya", "Mamina-Naumova-Ivanova", 27));
        people.add(new Person("Nik", "Naumov iii ooo", 10));
        people.add(new Person("Mike", "Naumova-iiii-ooo", 17));
        System.out.println(people);

        PersonNameAmountWordsComparator personNameAmountWordsComparator = new PersonNameAmountWordsComparator();
        personNameAmountWordsComparator.setAmountWordSurname(3);

        Collections.sort(people, personNameAmountWordsComparator);
        System.out.println(people);
        Predicate<Person> isToYoung = (person) -> person.getAge() < 18;
        people.removeIf(isToYoung);
        System.out.println(people);


    }
}
