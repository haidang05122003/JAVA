package BaiKiemTraThu;

public class main {
    public static void main(String[] args) {
        Student st = new Student("Hoang Hai Dang", "Dai Tu, Thai Nguyen");
        st.addCourseGrade("Java", 9);
        st.addCourseGrade("Python", 8);
        st.addCourseGrade("PHP", 7);
        st.addCourseGrade("JavaScript", 6);

        System.out.println(st.toString());
        System.out.println("Diem trung binh cua tat ca cac mon la: " + st.getAverageGrades());
    }
}
