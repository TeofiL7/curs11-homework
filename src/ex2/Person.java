package ex2;


public class Person{
        private String name;
        private int age;
        private String hairColour;

    public Person(String name, int age, String hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }
    @Override
    public String toString() {
        return "My person has name %s age %s hair color %s \n".formatted(name,age,hairColour);
    }

}
