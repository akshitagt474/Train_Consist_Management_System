import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=======================================\n");

        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored automatically)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        for (String bogie : bogies) {
            System.out.println(bogie);
        }
    }
}