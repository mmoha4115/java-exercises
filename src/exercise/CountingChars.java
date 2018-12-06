package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {

    public static void main(String[] args) {
        HashMap<Character, Integer> countPerLetter = new HashMap<>();
        String asciiLettersOnly = "abcdefghijklmnopqrstuvwxyz";
        asciiLettersOnly += asciiLettersOnly.toUpperCase();
        char[] alphabet = asciiLettersOnly.toCharArray();
        File file = new File("paragraph.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound - Please check location of the file ie. pathname.....");
        }
        StringBuilder paragraph= new StringBuilder();
        String sentence;
        do {
            sentence = scanner.nextLine();
            if(!(sentence.equals(""))){
            paragraph.append(sentence);
        }
        }while(scanner.hasNextLine());
        System.out.println(paragraph);
        char[] arrayOfLetters = paragraph.toString().toCharArray();
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

