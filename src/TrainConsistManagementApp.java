import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    // Goods Bogie class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("==============================================");

        // Step 1: Create list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // unsafe

        // Step 2: Print bogies
        System.out.println("\nGoods Bogies in Train:");
        for (GoodsBogie g : goodsBogies) {
            System.out.println(g);
        }

        // Step 3: Safety check using allMatch
        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie -> {
                    if (bogie.type.equals("Cylindrical")) {
                        return bogie.cargo.equals("Petroleum");
                    }
                    return true;
                });

        // Step 4: Output
        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}