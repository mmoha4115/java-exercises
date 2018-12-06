package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {
     public static void main(String [] args){
         ArrayList<String> students = new ArrayList<>();
         ArrayList <Double> grades = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
         String newStudents;

         System.out.println("Enter your students ( or press Enter when finished): ");

//         get students names
         do {
             newStudents = scanner.nextLine();
             if (!newStudents.equals("")) {
                 students.add(newStudents);
             }
         }while (!newStudents.equals(""));

//         get students grades

         for (String student:students){
             System.out.println("Grade for "+student+": ");
             Double grade = scanner.nextDouble();
             grades.add(grade);
         }
//         print class rooster
         System.out.println("\nClass rooster");
         double sum = 0.0;

         for (int i = 0; i < students.size();i++){
             System.out.println(students.get(i)+" ("+ grades.get(i)+")");
             sum += grades.get(i);
         }

         double avg = sum/students.size();
         System.out.println("Average grade: "+avg);

         }

     }

