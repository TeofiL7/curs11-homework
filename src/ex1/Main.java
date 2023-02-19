package ex1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alin",10));
        students.add(new Student("Marian",7));
        students.add(new Student("Adela",5));

        System.out.println(students);

        System.out.println("Max grade");
        System.out.println(MapStudent.highestGrade(students));


       /* Map<Integer,MapStudent> stringMap = new HashMap<>();
        stringMap.put(1,new MapStudent("andrei",));
        stringMap.put(2,new MapStudent(1,"Maria",));
        stringMap.
        ---STIU CA NU E CORECT CUM LA FACUT, DAR ATAT AM REUSIT---
        */
    }
}
