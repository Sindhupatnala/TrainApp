import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
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

// Main class
public class TrainApp {
    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        System.out.println("====================================");
        System.out.println("=== Train Consist Management App – UC12 ===");
        System.out.println("====================================");

        // Add goods bogies
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        System.out.println("\nGoods Bogies:");
        bogies.forEach(System.out::println);

        // 🔥 UC12: Safety check using allMatch
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                        b.cargo.equals("Petroleum")
                );

        // Result
        if (isSafe) {
            System.out.println("\nTrain is SAFE ✅");
        } else {
            System.out.println("\nTrain is UNSAFE ❌");
        }

        System.out.println("\nProgram continues...");
    }
}