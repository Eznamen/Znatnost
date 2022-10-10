import java.util.Comparator;

public class PersonNameAmountWordsComparator implements Comparator<Person> {
    private int amuntWordSurnameuntWordSurname;

    public void setAmountWordSurname(int amountWordSurname) {
        this.amuntWordSurnameuntWordSurname = amountWordSurname;
    }

    public int getAmuntWordSurnameuntWordSurname() {

        return amuntWordSurnameuntWordSurname;
    }

    @Override
    public int compare(Person p1, Person p2) {
        int comparater = Integer.compare(p2.getSurname().length, p1.getSurname().length);
        if (comparater != 0) {
            if (p1.getSurname().length > getAmuntWordSurnameuntWordSurname() && p2.getSurname().length > getAmuntWordSurnameuntWordSurname()) {
                return Integer.compare(p2.getAge(), p1.getAge());
            } else {
                return comparater;
            }
        } else {
            return Integer.compare(p2.getAge(), p1.getAge());
        }


    }


}
