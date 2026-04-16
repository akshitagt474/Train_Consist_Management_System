import java.util.*;

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

        System.out.println("=== UC10 - Count Total Seats in Train ===");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Step 2: Print bogies
        System.out.println("\nBogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 3: MAP + REDUCE
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)   // extract capacity
                .reduce(0, Integer::sum); // sum all

        // Step 4: Print result
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        System.out.println("\nUC10 aggregation completed...");
    }
}