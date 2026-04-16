import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("==============================================");

        // Step 1: Create bogie array (EMPTY CASE)
        String[] bogieIds = {};

        // Step 2: Search key
        String searchId = "BG101";

        try {
            // ===== FAIL-FAST VALIDATION =====
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available in the train to search.");
            }

            // ===== SEARCH LOGIC =====
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // Step 3: Result
            if (found) {
                System.out.println("Bogie ID FOUND.");
            } else {
                System.out.println("Bogie ID NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}