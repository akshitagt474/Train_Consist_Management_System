import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("==============================================");

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Search key
        String searchId = "BG309"; // change this to test

        // Step 3: Display all bogies
        System.out.println("\nAvailable Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // ===== LINEAR SEARCH =====
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // stop when found
            }
        }

        // Step 4: Result
        System.out.println("\n\nSearching for: " + searchId);

        if (found) {
            System.out.println("Bogie ID FOUND in the train.");
        } else {
            System.out.println("Bogie ID NOT FOUND.");
        }

        System.out.println("\nUC18 search completed...");
    }
}