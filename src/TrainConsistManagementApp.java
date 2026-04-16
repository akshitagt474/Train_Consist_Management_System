import java.util.*;

public class TrainConsistManagementApp {

    // Inner Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("=======================================\n");

        List<Bogie> bogies = new ArrayList<>();

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter bogie name and capacity:");

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int capacity = sc.nextInt();
            sc.nextLine();

            bogies.add(new Bogie(name, capacity));
        }

        // Before Sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // Sorting using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // After Sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC7 sorting completed...");

        sc.close();
    }
}