package OPG21_1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Creating Hash sets with the given strings
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        set1.add("Chemistry");
        set1.add("Mathematics");
        set1.add("Biology");
        set1.add("English");

        set2.add("Biology");
        set2.add("English");
        set2.add("Geography");
        set2.add("Physics");

        //Removing the same instances of strings from both sets
        Set<String> differenceSet1 = new LinkedHashSet<>(set1);
        differenceSet1.removeAll(set2);
        System.out.println("Set 1 without the same as set2: " + differenceSet1);

        Set<String> differenceSet2 = new LinkedHashSet<>(set2);
        differenceSet2.removeAll(set1);
        System.out.println("Set 2 without the same as set1: " + differenceSet2);

        //Adding set1 to set2 and showing the final set
        Set<String> union = new LinkedHashSet<>();

        set1.addAll(set2);
        System.out.println(set1);
    }
}
