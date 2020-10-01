package com.example.idea;

import java.util.HashMap;

public class Student {
    private int studentID, studentGrade, credit, age;
    private String name, className;
    private double balance;
    private boolean advanceToNextYear, currentlyEnrolled, paidTuition;
    private double gpa;
    HashMap<String,Integer> courses = new HashMap<>();

    public Student(int studentGrade, String name, int age, int studentID) {
        this.studentGrade = studentGrade;
        this.name = name;
        this.age = age;
        this.studentID = studentID;

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isPaid() {
        return paidTuition;
    }

    public void setPaid(boolean paid) {
        this.paidTuition = paid;
    }

    public int getAge() {
        return age;
    }
    public void setCurrentlyEnrolled(boolean currentlyEnrolled){
        this.currentlyEnrolled = currentlyEnrolled;
    }
    public boolean getCurrentlyEnrolled(){
        return this.currentlyEnrolled;
    }

    public boolean isAdvanceToNextYear() {
        return advanceToNextYear;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double result) {
        this.gpa = gpa;
    }

    public void setAdvanceToNextYear(boolean advanceToNextYear) {
        this.advanceToNextYear = advanceToNextYear;
    }
    public String getInfo(Student student){
        String s = "";
        if(student.getCurrentlyEnrolled() != false) {
            s = "Student name: " + name + " student number " + studentID + " is in grade " + student.getStudentGrade();
            return s;
        }
        s = "Student : " + student.getName() + " is no longer in our system";
        return s;
    }

}