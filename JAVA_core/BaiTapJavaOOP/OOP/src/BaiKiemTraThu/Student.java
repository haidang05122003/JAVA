package BaiKiemTraThu;

public class Student extends Person {
    private int numCourses;
    private String[] courses = new String[10];
    private int[] grades = new int[10];

    public Student(String name, String address){
        super(name, address);
    }

    @Override
    public String toString() {

        String s =  "Student : " + getName() + "( " + getAddress() + " )";
        return s;
    }

    public void addCourseGrade(String course, int grade ){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
        System.out.println(numCourses + ". " + "Mon: "+ course + ", Diem: "+ grade );
    }

    public double getAverageGrades(){
        int sum = 0;
        for(int i = 0; i < numCourses; i++){
            sum += grades[i];
        }
        double average = sum / numCourses;
        return average;
    }
}
