import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=======================================\n");

        // LinkedHashSet: maintains order + removes duplicates
        Set<String> formation = new LinkedHashSet<>();

        System.out.print("Enter number of bogies to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter bogie names:");

        for (int i = 0; i < n; i++) {
            String bogie = sc.nextLine();
            formation.add(bogie); // duplicates automatically ignored
        }

        System.out.println("\nFinal Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");

        sc.close();
    }
}