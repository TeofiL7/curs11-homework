package ex1;

public class Student {
    private String name;
    private Integer grade;

    public Student(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student name is %s and his/she grade is: %s \n".formatted(name,grade);
    }
}
