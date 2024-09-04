package BaiTapOOP_20;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> students;
    private int numberOfStudents;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public Course(String name, ArrayList<Student> students, int numberOfStudents) {
        this.name = name;
        this.students = students;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void addStudent(Student student) {
       this.students.add(student);
    }

    public void showStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
