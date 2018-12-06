package exercise;

import java.util.Scanner;

public class MPG {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter miles Driven: ");
        int miles = scanner.nextInt();
        System.out.print("Please enter gallons used: ");
        int gallons = scanner.nextInt();
        System.out.println("Your fuel efficency is  "+miles/gallons+ " mpg.");
    }
}
