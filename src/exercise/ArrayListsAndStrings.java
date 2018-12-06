package exercise;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsAndStrings {
    public static void main(String [] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("Warda");
        for (int j = 0 ; j<letters.size();j++) {
            for (int i = 0;i < letters.get(j).length();i++) {
                String word = letters.get(j);
//                System.out.print(word[i]);
        }
    }
        System.out.println(letters.get(0));


    }

}
