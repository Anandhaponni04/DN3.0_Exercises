/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcpatternexample;

/**
 *
 * @author ADMIN
 */
// MVCPatternExample.java
public class MVCPatternExample {
    public static void main(String[] args) {
        // Create a student record
        Student model = new Student("John Doe", "123", "A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(model, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentId("456");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}

