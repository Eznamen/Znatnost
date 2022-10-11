import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Katya", "Mamina-Naumova", 41));
        people.add(new Person("Katya", "Mamina", 40));
        people.add(new Person("Katya", "Mamina Naumova", 50));
        people.add(new Person("Katya", "Mamina-Naumova-Ivanova-iiii", 45));
        people.add(new Person("Katya", "Mamina Naumova Ivanova iii ooo", 30));
        people.add(new Person("Katya", "Mamina-Naumova-Ivanova", 27));

        System.out.println(people);

        Comparator<Person> comparator = (p1, p2) -> {
            int maxWord = 3;
            if (p1.getSurname().length > maxWord && p2.getSurname().length > maxWord) {
                return p2.getAge() - p1.getAge();
            } else {
                return p2.getSurname().length - p1.getSurname().length;
            }
        };

        people.sort(comparator);
        System.out.println(people);
    }
}