import java.util.ArrayList;
feature/UC2-AddBogie


public class UseCase2PassengerBogies {
    public static void main(String[] args) {
        ArrayList<String> passengerBogies = new ArrayList<String>();

        System.out.println("==============================================");
        System.out.println("=== Train Consist Management App - UC2 =======");
        System.out.println("==============================================");

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies after insertion: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("Passenger bogies after removing AC Chair: " + passengerBogies);

        boolean isSleeperAvailable = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper bogie exist? " + isSleeperAvailable);

        System.out.println("Final passenger bogie list: " + passengerBogies);

import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        List<String> trainConsist = new ArrayList<>();

        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());
        main
        System.out.println("Program continues...");
    }
}