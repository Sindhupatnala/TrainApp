import java.util.ArrayList;
import java.util.List;
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
        return name + " (" + capacity + " seats)";
    }
}

// Main class
public class TrainApp {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        System.out.println("====================================");
        System.out.println("=== Train Consist Management App – UC8 ===");
        System.out.println("====================================");

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 80));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // 🔥 Stream filtering (UC8)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (capacity > 60):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\nProgram continues...");
    }
}