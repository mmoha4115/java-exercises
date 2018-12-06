package exercise;

import java.util.Scanner;

public class Rectangle {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the width: ");
        int width = scanner.nextInt();
        System.out.print("please enter height: ");
        int heigth = scanner.nextInt();
        System.out.print("The area of the rectangle is "+ width*heigth);
    }
}
