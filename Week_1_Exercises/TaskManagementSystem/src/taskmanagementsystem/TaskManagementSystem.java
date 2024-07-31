/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskmanagementsystem;


class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskManagementSystem {
    private Node head;

    public TaskManagementSystem() {
        this.head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        Task task1 = new Task("1", "Design Module", "In Progress");
        Task task2 = new Task("2", "Implement Module", "Pending");
        Task task3 = new Task("3", "Test Module", "Completed");

        tms.addTask(task1);
        tms.addTask(task2);
        tms.addTask(task3);

        System.out.println("All Tasks:");
        tms.traverseTasks();

        System.out.println("\nSearch for Task with ID 2:");
        Task searchResult = tms.searchTask("2");
        if (searchResult != null) {
            System.out.println(searchResult);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDelete Task with ID 2:");
        tms.deleteTask("2");

        System.out.println("\nAll Tasks after deletion:");
        tms.traverseTasks();
    }
}
