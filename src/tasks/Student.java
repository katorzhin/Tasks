package tasks;

import java.util.*;

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
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    static Set<Student> union(Set<Student> set1, Set<Student> set2) {
        Set<Student> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    static Set<Student> intersect(Set<Student> set1, Set<Student> set2) {
        Set<Student> result = new HashSet<>();
        for (Student a : set1) {
            for (Student b : set2) {
                if (set1.equals(set2)) {
                    result.add(a);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void main(String[] args) {
//        List<Student> list = new ArrayList<Student>();
//        list.add(new Student("Julia", 5));
//        list.add(new Student("Marina", 3));
//        list.add(new Student("Katia", 1));
//        list.add(new Student("Sergey", 4));
//        int course = 5;
//         printStudents(list,course);
        Set<Student> firstSet = new HashSet<>();
        firstSet.add(new Student("Marina", 7));
        firstSet.add(new Student("Julias", 6));
        Set<Student> secondSet = new HashSet<>();
        secondSet.add(new Student("Marina", 7));
        secondSet.add(new Student("Misha", 8));
        //System.out.println(union(firstSet,secondSet));
        System.out.println(intersect(firstSet, secondSet));

    }
}

































