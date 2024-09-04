package BaiToanTinChi;

import java.util.ArrayList;

public class Student extends Human{
    private String Lop;
    private ArrayList<Subject> subjectArrayList;

    public Student(String fullName, String address, String code, String lop) {
        super(fullName, address, code);
        Lop = lop;
        this.subjectArrayList = new ArrayList<>();
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public ArrayList<Subject> getSubjectArrayList() {
        return subjectArrayList;
    }

    public void setSubjectArrayList(ArrayList<Subject> subjectArrayList) {
        this.subjectArrayList = subjectArrayList;
    }

    public void addSubject(Subject subject){
        this.subjectArrayList.add(subject);
    }

    public float calcTermAverageMark(){
        float totalMark = 0;
        for(Subject subject : subjectArrayList) {
            totalMark += subject.calSubjectMark(); //tinh diem tich luy tung mon
        }
        return totalMark / subjectArrayList.size(); //tinh diem tich luy trung binh
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student { fulllname: ").append(getFullName()).append(", address: ")
                .append(getAddress()).append(", code: ").append(getCode()).append(", lop: ").append(getLop()).append(" }");
        sb.append("\n Subject list:  \n");
        sb.append("Total mark in semeter: " + calcTermAverageMark() + "\n");
        for(Subject subject : subjectArrayList) {
            sb.append(subject.toString()).append("\n");
        }
        return sb.toString();
    }
}
