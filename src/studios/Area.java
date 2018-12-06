package studios;

import java.util.Scanner;

public class Area {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        while (radius < 0){
            System.out.print("Enter radius: ");
            radius = scanner.nextDouble();
        }
        double pi = 3.14;
        System.out.println("The area of the circle is "+pi*radius*radius);
    }
}
