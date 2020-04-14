package OPG21_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("res/testText.txt");
        if (!file.exists()) {
            System.out.println("file doesnt exist");
            System.exit(1);
        }

        Set<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
        int vowels = 0;
        int consonants = 0;

        Scanner inputfile = new Scanner(file);
        while (inputfile.hasNext()) {
            String line = inputfile.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (set.contains(Character.toUpperCase(line.charAt(i)))) {
                    vowels++;
                } else if (Character.isLetter(line.charAt(i))) {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels + "\n" + "Consonants = " + consonants );


    }
}
