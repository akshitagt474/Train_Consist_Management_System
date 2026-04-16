import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("=======================================\n");

        // HashMap: key = bogie name, value = capacity
        Map<String, Integer> capacityMap = new HashMap<>();

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter bogie name and capacity:");

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int capacity = sc.nextInt();
            sc.nextLine();

            capacityMap.put(name, capacity);
        }

        System.out.println("\nBogie Capacity Details:");

        // Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");

        sc.close();
    }
}