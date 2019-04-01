package constructoroverloading;

class StudentData{
    private int StudentID;
    private String studentName;
    private int studentAge;
    StudentData(){
        StudentID = 01;
        studentName = "Bilal";
        studentAge = 23;
    }
    StudentData(int num1, String str, int num2){
        StudentID = num1;
        studentName = str;
        studentAge = 23;
    }
    public int getStudentID(int studentID){
        return studentID;
    }
    public void setStudentID(int StudentID){
        this.StudentID = StudentID;
    }
    public String getStudentName(String studentName){
        return studentName;
    }
    public void setStudentName(String StudentName){
        this.studentName = studentName;
    }
    public int getStudentAge(int studentAge){
        return studentAge;
    }
    public void setStudentAge(int StudentAge){
        this.studentAge = studentAge;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        StudentData obj1 = new StudentData();
        System.out.println("The Student ID Is " + obj1.getStudentID(1));
        System.out.println("The Student Name Is " + obj1.getStudentName("Bilal"));
        System.out.println("The Student Age Is " + obj1.getStudentAge(23));
    }
}
