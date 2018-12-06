package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String [] args){
        HashMap <Integer ,String> students = new HashMap<>();
        String student;
        Integer id;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("enter Student name:  ");
            student = scanner.nextLine();

            if (!(student.equals(""))){
                System.out.print("enter student id:  ");
                id = scanner.nextInt();
                students.put(id,student);
                System.out.println(students.values()+" : "+students.keySet());
                scanner.nextLine();
            }
        }while (!(student.equals("")));
        System.out.println("\tthis is the grade book!!!!");
        for (Map.Entry<Integer,String> name:students.entrySet()){
            System.out.println(name.getKey()+" : "+name.getValue());

        }


        }

    }


