package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private String level;
    private double qualityScore;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        this.qualityScore = gpa * numberOfCredits;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    public String getGradeLevel() {
        if (this.numberOfCredits >= 0 && this.numberOfCredits <= 29){
            return "Freshman";
        }
        if (this.numberOfCredits >=30 && this.numberOfCredits <=59){
            return "Sophomore";
        }
        if (this.numberOfCredits >=60 && this.numberOfCredits <=89){
            return "Junior";
        }
        if (this.numberOfCredits >=90){
            return "Senior";
        }
        return "N/A";
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        this.numberOfCredits += courseCredits;
        this.qualityScore += courseCredits * grade;
        this.gpa = this.qualityScore / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public double getQualityScore() {
        return qualityScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setQualityScore(double qualityScore){
        this.qualityScore = qualityScore;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,3,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println("Sally is a " + sally.getGradeLevel() + " with a " + sally.getGpa() + " gpa");
        sally.addGrade(12, 3.5);
        System.out.println("Sally is a " + sally.getGradeLevel() + " with a " + sally.getGpa() + " gpa");
        sally.addGrade(35, 3.8);
        System.out.println("Sally is a " + sally.getGradeLevel() + " with a " + sally.getGpa() + " gpa");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numberOfCredits == student.numberOfCredits &&
                Double.compare(student.gpa, gpa) == 0 &&
                Double.compare(student.qualityScore, qualityScore) == 0 &&
                Objects.equals(level, student.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfCredits, gpa, level, qualityScore);
    }
}
