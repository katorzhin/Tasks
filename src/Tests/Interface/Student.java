package Tests.Interface;

public class Student {
    private String name;
    private int age;
    private String surname;

    private Student(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public static final class StudentBuilder {
        private String name;
        private int age;
        private String surname;

        private StudentBuilder() {
        }

        public static StudentBuilder aStudent() {
            return new StudentBuilder();
        }

        public StudentBuilder withName(String name) {
            // validation
            this.name = name;
            return this;
        }

        public StudentBuilder withAge(int age) {
            if(age<0){
                throw new IllegalArgumentException("age cannot be <0");
            }
            this.age = age;
            return this;
        }

        public StudentBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public StudentBuilder but() {
            return aStudent().withName(name).withAge(age).withSurname(surname);
        }

        public Student build() {
            return new Student(name, age, surname);
        }
    }
}