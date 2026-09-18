class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name + ". I am " + age + " years old.");
    }
}

public class ClassesAndObjectsExample {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20);
        student.introduce();
    }
}