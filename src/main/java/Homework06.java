import java.util.ArrayList;
import java.util.List;

public class Homework06 {
    /**
     * Создать класс Person.
     * У класса должны быть поля:
     * 1. Имя (String)
     * 2. Фамилия (String)
     * 3. Возраст (продумать тип)
     * 4. Пол
     * 5*. Придумать свои собственные поля
     *
     * Для этого класса
     * 1. Реализовать методы toString, equals и hashCode.
     * 2*. Придумать собственные методы и реализовать их
     *
     * В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
     */
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Михаил", "Бурый", 40, 'M', "CEO"));
        people.add(new Person("Евгения", "Дугина", 18, 'F', "Student"));
        people.add(new Person("Джон", "Траволта", 25, 'M', "Developer"));
        people.add(new Person("Алиса", "Йохансон", 22, 'F', "Designer"));
        people.add(new Person("Борис", "Сметов", 30, 'M', "Manager"));
        for (Person person : people) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }
        }
    }
}
