package OPG21_2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();

        set1.add("Peter");
        set1.add("Jens");
        set1.add("Niels");
        set1.add("Jørgen");
        set1.add("Signe");
        set1.add("Anders");
        set1.add("Karsten");



        TreeSet<String> treeSet = new TreeSet<>(set1);
        System.out.println(treeSet);
    }
}
