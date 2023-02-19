package ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Gheorghina", 27, "saten"));
        person.add(new Person("Catalin", 26, "blond"));
        person.add(new Person("Ionatan", 35, "brunet"));
        person.add(new Person("Lois", 19, "saten"));

        System.out.println(person);

        System.out.println("Older Person");
        System.out.println(PersonList.olderPerson(person, 26));

        System.out.println("Name to age: ");
        System.out.println(PersonList.nameToAge(person));

        System.out.println("Color to Name ");
        System.out.println(PersonList.colorToName(person));
    }
}
