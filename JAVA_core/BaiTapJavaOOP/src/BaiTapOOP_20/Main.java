package BaiTapOOP_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Course name: ");
        String course = sc.nextLine();

        System.out.println("Enter num of student: ");
        int num = sc.nextInt();
        sc.nextLine();

        Course c = new Course(course);
        for (int i = 0; i< num; i++) {

            System.out.println("Enter name student " + (i+1) + ": ");
            String name = sc.nextLine();

            System.out.println("Enter id student " + (i+1) + ": ");
            String id = sc.nextLine();

            System.out.println("Enter class student " + (i+1) + ": ");
            String lop = sc.nextLine();

            Student s = new Student(name, id, lop);
            c.addStudent(s);
        }
        c.showStudents();
    }
}
