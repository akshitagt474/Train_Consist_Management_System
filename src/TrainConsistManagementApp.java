import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // Bogie class (same as UC7)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // Method to filter bogies
    public static List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("=======================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Filtered Bogies (capacity > 60):");

        List<Bogie> filtered = filterBogies(bogies, 60);

        for (Bogie b : filtered) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}