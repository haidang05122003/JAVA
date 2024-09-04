package BaiToanTinChi;


public class Subject {
    private String subjectCode;
    private String subjectName;
    private int credits;
    private float attendanceMark;
    private float midExamMark;
    private float finalExamMark;

    public Subject() {}

    public Subject(String subjectCode, String subjectName, int credits, float attendanceMark, float midExamMark, float finalExamMark) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.credits = credits;
        this.attendanceMark = attendanceMark;
        this.midExamMark = midExamMark;
        this.finalExamMark = finalExamMark;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubject(String subject) {
        this.subjectCode = subject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public float getAttendanceMark() {
        return attendanceMark;
    }

    public void setAttendanceMark(float attendanceMark) {
        this.attendanceMark = attendanceMark;
    }

    public float getMidExamMark() {
        return midExamMark;
    }

    public void setMidExamMark(float midExamMark) {
        this.midExamMark = midExamMark;
    }

    public float getFinalExamMark() {
        return finalExamMark;
    }

    public void setFinalExamMark(float finalExamMark) {
        this.finalExamMark = finalExamMark;
    }

    public float calSubjectMark(){
        return (attendanceMark + midExamMark * 3 + finalExamMark * 6)/10;
    }

    public String calGrade(){
        float totalMark = calSubjectMark();
        if(totalMark >= 8.5) return "A";
        else if(totalMark >= 7.5) return "B";
        else if(totalMark >= 5.5) return "C";
        else if(totalMark >= 4.0) return "D";
        else return "F";
    }

    public float calConversionMark(){
        String grade = calGrade();
        switch(grade){
            case "A": return 4.0f;
            case "B": return 3.0f;
            case "C": return 2.0f;
            case "D": return 1.0f;
            default: return 0.0f;
        }
    }

    @Override
    public String toString() {
        return "Subject {" +
                " SubjectCode: " + subjectCode +
                ", SubjectName: " + subjectName +
                ", Grade: " + calGrade() +
                ", CoversionMark: "+ calConversionMark()+
                " }";
    }
}
