package demo.Tut3.Set.HashSet;

public class Student {
    private int studentId;
    private  String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Student) ){
            return false;
        }
        Student o = (Student) obj;
        return this.studentId == o.studentId;
    }

    @Override
   public int hashCode() {
        return this.studentName.charAt(0);
    }

}
