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

//        PersonNameAmountWordsComparator personNameAmountWordsComparator = new PersonNameAmountWordsComparator();
//        personNameAmountWordsComparator.setAmountWordSurname(3);

        Comparator<Person> comparator = (p1, p2) -> {
            int comp = Integer.compare(p2.getSurname().length, p1.getSurname().length);
            int result;
            int maxWord = 3;
            if (comp != 0) {
                if (p1.getSurname().length > maxWord && p2.getSurname().length > maxWord) {
                    result = Integer.compare(p2.getAge(), p1.getAge());
                } else {
                    result = comp;
                }
            } else {
                result = Integer.compare(p2.getAge(), p1.getAge());
            }
            return result;
        };


        Collections.sort(people, comparator);
        System.out.println(people);

    }
    
}


//public class PersonNameAmountWordsComparator implements Comparator<Person> {
//    private int amuntWordSurnameuntWordSurname;
//
//    public void setAmountWordSurname(int amountWordSurname) {
//        this.amuntWordSurnameuntWordSurname = amountWordSurname;
//    }
//
//    public int getAmuntWordSurnameuntWordSurname() {
//
//        return amuntWordSurnameuntWordSurname;
//    }
//
//    @Override
//    public int compare(Person p1, Person p2) {
//        int comparater = Integer.compare(p2.getSurname().length, p1.getSurname().length);
//        if (comparater != 0) {
//            if (p1.getSurname().length > getAmuntWordSurnameuntWordSurname() && p2.getSurname().length > getAmuntWordSurnameuntWordSurname()) {
//                return Integer.compare(p2.getAge(), p1.getAge());
//            } else {
//                return comparater;
//            }
//        } else {
//            return Integer.compare(p2.getAge(), p1.getAge());
//        }
//
//
//    }