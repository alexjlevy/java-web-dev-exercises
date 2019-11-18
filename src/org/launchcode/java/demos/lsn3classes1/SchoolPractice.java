package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {

        class Student {

            private String name = "Alex";
            private int studentId = 69;
            private int numberOfCredits = 1;
            private double gpa = 4.0;


            public String getName () {
                return name;
            }

            public void setName (String aName) {
                name = aName;
            }

            public int getStudentId () {
                return studentId;
            }

            public void setStudentId (int aStudentId) {
                studentId = aStudentId;
            }

            public int getNumberOfCredits () {
                return numberOfCredits;
            }

            public void setNumberOfCredits (int aNumberOfCredits) {
                numberOfCredits = aNumberOfCredits;
            }

            public double getGpa () {
                return gpa;
            }

            private void setGpa (double aGpa) {
                gpa = aGpa;
            }
        }    }
}
