package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {

    public static void main(String[] args) {
        HashMap<Character, Integer> countPerLetter = new HashMap<>();
        String asciiLettersOnly = "abcdefghijklmnopqrstuvwxyz";
        asciiLettersOnly += asciiLettersOnly.toUpperCase();
        char[] alphabet = asciiLettersOnly.toCharArray();
        System.out.println("Enter a paragrah to examine:  ");
        Scanner scanner = new Scanner(System.in);
        String paragraph = scanner.nextLine();
        char[] arrayOfLetters = paragraph.toCharArray();
        for (char characterInArray : arrayOfLetters) {
            for (char letter : alphabet) {
                if (characterInArray == letter) {
                    if (countPerLetter.containsKey(characterInArray)) {
                        int value = countPerLetter.get(characterInArray);
                        countPerLetter.put(characterInArray, value + 1);
                    } else {
                        countPerLetter.put(characterInArray, 1);
                    }
                }
            }
        }
        System.out.println("\tLetter count in paragraph\n");
        for (Map.Entry<Character, Integer> characterInHashMap : countPerLetter.entrySet()) {
            System.out.println(characterInHashMap.getKey() + " : " + characterInHashMap.getValue());

        }

    }
}

