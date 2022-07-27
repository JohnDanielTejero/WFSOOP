package com.oop.concepts.oopparadigm.encapsulationSample;

public class Student {

    //class fields
    private long studentNo;
    private String studentFirstName;
    private String studentLastName;
    private String studentSection;
    private char studentGender;
    private static int counter = 1;

    //constructors
    public Student(){}

    public Student(String studentFirstName, String studentLastName,
                   String studentSection, char studentGender){
        studentNo =  counter;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentSection = studentSection;
        this.studentGender = studentGender;
        counter++;
    }

    //getters and setters
    public long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(long studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentSection() {
        return studentSection;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    public char getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(char studentGender) {
        this.studentGender = studentGender;
    }

    @Override
    public String toString() {
        return  "studentNo = " + studentNo + "\n" +
                "studentFirstName = '" + studentFirstName + "\'" + "\n" +
                "studentLastName = '" + studentLastName + "\'" + "\n" +
                "studentSection = '" + studentSection + "\'" + "\n" +
                "studentGender = " + studentGender + "\n";
    }
}
