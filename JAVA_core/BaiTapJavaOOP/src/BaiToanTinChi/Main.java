package BaiToanTinChi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HRM Hrm = new HRM();
        int luaChon = 0;

        do{
            System.out.println("--------------------");
            System.out.println("--------MENU--------");
            System.out.println("1. Thêm nhân sự");
            System.out.println("2. In ra danh sách nhân sự");
            System.out.println("3. Tìm kiếm theo mã nhân sự");
            System.out.print("CHỌN CHỨC NĂNG: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1){
                int tuyChon = 0;
                do{
                    System.out.println("---------------");
                    System.out.println("CHỌN LOẠI NHÂN SỰ");
                    System.out.println("1. Sinh viên");
                    System.out.println("2. Giảng Viên");
                    System.out.print("CHỌN CHỨC NĂNG: ");
                    tuyChon = sc.nextInt();
                    sc.nextLine();
                    if(tuyChon == 1){
                        System.out.print("Nhập họ tên: "); String fullName = sc.nextLine();
                        System.out.print("Nhập địa chỉ: "); String address = sc.nextLine();
                        System.out.print("Nhập mã sinh viên: "); String code = sc.nextLine();
                        System.out.print("Nhập Lớp: "); String lop = sc.nextLine();
                        System.out.print("Nhập số môn học: "); int soMonHoc = sc.nextInt();

                        Student student  = new Student(fullName, address, code, lop);
                        sc.nextLine();
                        for(int i = 0; i< soMonHoc; i++){
                            System.out.println("Nhập môn học " + (i+1) + " :");
                            System.out.print("Nhập mã môn học: "); String subjectCode = sc.nextLine();
                            System.out.print("Nhập tên môn học: "); String subjectName = sc.nextLine();
                            System.out.print("Nhập số tín: ");  int credits = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Nhập điểm chuyên cần: "); float  attendanceMark = sc.nextFloat();
                            sc.nextLine();
                            System.out.print("Nhập điểm giữa kì: "); float midExamMark = sc.nextFloat();
                            sc.nextLine();
                            System.out.print("Nhập điểm cuối kì: "); float finalExamMark = sc.nextFloat();
                            sc.nextLine();

                            Subject subject = new Subject(subjectCode, subjectName, credits, attendanceMark,midExamMark,finalExamMark);
                            student.addSubject(subject);
                        }
                        Hrm.addStudent(student);
                        System.out.println("Thêm sinh viên thành công !!!");
                    }else if(tuyChon == 2){
                        System.out.print("Nhập họ tên: "); String fullName = sc.nextLine();
                        System.out.print("Nhập địa chỉ: "); String address = sc.nextLine();
                        System.out.print("Nhập mã giảng viên: "); String code = sc.nextLine();
                        System.out.print("Thêm mật khẩu: "); String password = sc.nextLine();

                        Lecturer lecturer = new Lecturer(fullName, address, code, password);
                        Hrm.addLecturer(lecturer);
                        System.out.println("Thêm giảng viên thành công !!!");
                    }
                }while(tuyChon != 0);
            }else if(luaChon == 2){
                Hrm.printStudent();
                Hrm.printLecturer();
            } else if (luaChon == 3) {
               System.out.println("Nhập vào mã sinh viên hoặc giảng viên");
               String code = sc.nextLine();
               Hrm.seachStudentOfLecturer(code);
            }
        }while(luaChon != 0);
    }
}
