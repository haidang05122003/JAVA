package BaiToanTinChi;

import java.util.ArrayList;

public class HRM {
    private ArrayList<Human>hrList ;

    public HRM() {
        this.hrList = new ArrayList<>();
    }

    public HRM(ArrayList<Human> hrList) {
        this.hrList = hrList;
    }

    public ArrayList<Human> getHrList() {
        return hrList;
    }

    public void setHrList(ArrayList<Human> hrList) {
        this.hrList = hrList;
    }

    public void addStudent(Student student) {
        this.hrList.add(student);
    }

    public void addLecturer(Lecturer lecturer) {
        this.hrList.add(lecturer);
    }

    public void printStudent(){
        for(Human human :this.hrList){
            if(human instanceof Student){
                Student student = (Student)human;
                System.out.println(student);
            }
        }
    }

    public void printLecturer(){
        for(Human human :this.hrList){
            if(human instanceof Lecturer){
                Lecturer lecturer = (Lecturer)human;
                System.out.println(lecturer);
            }
        }
    }
    public void seachStudentOfLecturer(String code){
        for(Human human :this.hrList){
            if(human instanceof Lecturer){
                Lecturer lecturer = (Lecturer)human;
                if(lecturer.getCode().contains(code)){
                    System.out.println(lecturer);
                }
            }
            if(human instanceof Student){
                Student student = (Student)human;
                if(student.getCode().contains(code)){
                    System.out.println(student);
                }
            }
        }
    }

}
