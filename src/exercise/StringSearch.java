package exercise;

import java.util.Scanner;

public class StringSearch {
    public static void main(String [] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        alice = alice.toLowerCase();
        System.out.print("Please Enter a text or char to search for in the first sentence of Alice in the wonderland: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.toLowerCase();
        boolean found = alice.contains(text);
        if (found) {
            System.out.println(text + " does exist in the first sentence of Alice in the wonderland.");
        } else {
            System.out.println(text + " does not exist in the first sentence of Alice in the wonderland.");
        }
    }
}
