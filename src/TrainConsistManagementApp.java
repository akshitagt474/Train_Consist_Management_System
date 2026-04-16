import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("==============================================");

        // Step 1: Create array (can be unsorted)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort array (IMPORTANT)
        Arrays.sort(bogieIds);

        // Step 3: Search key
        String key = "BG309";

        // Step 4: Display sorted array
        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // ===== BINARY SEARCH =====
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;   // search right half
            } else {
                high = mid - 1;  // search left half
            }
        }

        // Step 5: Result
        System.out.println("\nSearching for: " + key);

        if (found) {
            System.out.println("Bogie ID FOUND (Binary Search).");
        } else {
            System.out.println("Bogie ID NOT FOUND.");
        }

        System.out.println("\nUC19 search completed...");
    }
}