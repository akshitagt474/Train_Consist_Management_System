import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Group Bogies by Type ===");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        // Step 2: Print all bogies
        System.out.println("\nAll Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 3: Grouping
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Step 4: Print grouped result
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nBogie Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("Capacity -> " + b.capacity);
            }
        }
    }
}