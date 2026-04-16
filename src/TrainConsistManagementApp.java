import java.util.*;

public class TrainConsistManagementApp {

    // ===== CUSTOM RUNTIME EXCEPTION =====
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ===== GOODS BOGIE CLASS =====
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo with safety validation
        void assignCargo(String cargo) {
            try {
                // Rule: Rectangular bogie cannot carry Petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Petroleum cannot be assigned to Rectangular bogie");
                }

                // Safe assignment
                this.cargo = cargo;
                System.out.println(shape + " -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Cargo assignment attempt completed.");
            }
        }
    }

    // ===== MAIN METHOD =====
    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC15 - Safe Cargo Assignment Using try-catch-finally");
        System.out.println("==============================================");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (will trigger exception)
        b2.assignCargo("Petroleum");

        // Program continues
        b2.assignCargo("Coal");

        System.out.println("\nUC15 cargo handling completed...");
    }
}