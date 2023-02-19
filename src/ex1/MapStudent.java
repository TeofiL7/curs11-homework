package ex1;

import java.util.*;

public class MapStudent {
    private List<Student> students;

    public MapStudent(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public static Integer highestGrade(List<Student> students){
        Integer maxGrade = 0;
        for (Student student : students){
            if (student.getGrade() > maxGrade){
                maxGrade = student.getGrade();
            }
        }
        return maxGrade;
    }
}