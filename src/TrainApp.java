import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

// Main class
public class TrainApp {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        System.out.println("====================================");
        System.out.println("=== Train Consist Management App – UC9 ===");
        System.out.println("====================================");

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("AC Chair", 60));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // 🔥 Grouping using Streams
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                      .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nGrouped Bogies:");

        for (String key : groupedBogies.keySet()) {
            System.out.println(key + " -> " + groupedBogies.get(key));
        }

        System.out.println("\nProgram continues...");
    }
}