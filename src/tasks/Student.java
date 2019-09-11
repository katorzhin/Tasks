package tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    private int getCourse() {
        return course;
    }


    private Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    static void printStudents(List<Student> students, int course) {
        System.out.println("Student(s) " + course + " course:");

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() ==course){
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        list.add(new Student("Vasia", 2));
        list.add(new Student("Petia", 1));
        list.add(new Student("Sasha", 4));
        list.add(new Student("Masha", 3));
        list.add(new Student("Dasha", 5));
        list.add(new Student("Svetlana", 3));
        list.add(new Student("Genadiy", 2));
        list.add(new Student("Julia", 5));
        list.add(new Student("Marina", 3));
        list.add(new Student("Katia", 1));
        list.add(new Student("Sergey", 4));

        int course = 5;
        printStudents(list,course);
    }
}
