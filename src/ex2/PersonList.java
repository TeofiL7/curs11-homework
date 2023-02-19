package ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonList {
    public List<Person> persons;

    public PersonList(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }


    public static Map<String, Integer> nameToAge(List<Person> persons){
        Map<String,Integer> result = new HashMap<>();
        for (Person person : persons){
            result.put(person.getName(),person.getAge());
        }
        return result;
    }

    public static List<Person> olderPerson(List<Person> persons, Integer oldAge){
        List<Person> result = new ArrayList<>();
        for (Person person : persons){
            if (person.getAge() > oldAge){
                result.add(person);
            }
        }
        return result;
    }

    public static Map<String,String> colorToName(List<Person> persons){
        Map<String,String> result = new HashMap<>();
        for (Person person : persons){
            result.put(person.getHairColour(),person.getName());
        }
        return result;
    }
}
