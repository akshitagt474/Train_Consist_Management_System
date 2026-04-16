import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    // Bogie model
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("==================================================");

        // Step 1: Create large dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 24));
        }

        // ================= LOOP =================
        long startLoop = System.nanoTime();

        int totalLoop = 0;
        for (Bogie b : bogies) {
            if (b.capacity > 50) { // sample condition
                totalLoop += b.capacity;
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ================= STREAM =================
        long startStream = System.nanoTime();

        int totalStream = bogies.stream()
                .filter(b -> b.capacity > 50)
                .mapToInt(b -> b.capacity)
                .sum();

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ================= OUTPUT =================
        System.out.println("\nLoop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}