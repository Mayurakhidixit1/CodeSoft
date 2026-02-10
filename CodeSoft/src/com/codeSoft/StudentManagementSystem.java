package com.codeSoft;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String grade;

    Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Grade: " + grade;
    }
}

public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    static void addStudent() {
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        students.add(new Student(name, rollNo, grade));
        System.out.println("Student Added Successfully!");
    }

    static void removeStudent() {
        System.out.print("Enter Roll No to remove: ");
        int rollNo = sc.nextInt();
        students.removeIf(student -> student.rollNo == rollNo);
        System.out.println("Student Removed (if existed).");
    }

    static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int rollNo = sc.nextInt();
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}