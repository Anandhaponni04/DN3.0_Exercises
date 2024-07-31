/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcpatternexample;

/**
 *
 * @author ADMIN
 */
public class StudentView {
    public void displayStudentDetails(String studentName, String studentId, String studentGrade)
    {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentId);
        System.out.println("Grade: " + studentGrade);
    }
}
