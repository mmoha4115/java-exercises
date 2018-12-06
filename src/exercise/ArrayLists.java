package exercise;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String [] args){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        for (int i=0;i<range;i++){
            if (i%2 == 0){
                evenNumbers.add(i);
            }
        }
        System.out.println(evenNumbers);

    }
}
