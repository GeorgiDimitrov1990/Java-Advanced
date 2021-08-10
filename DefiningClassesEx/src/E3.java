import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelCostFor1Km = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuelAmount, fuelCostFor1Km);
            cars.putIfAbsent(model, car);

        }

        String input = scanner.nextLine();

        while (!input.equals("End")){

            String[] tokens = input.split("\\s+");

            String carModel = tokens[1];
            int amountOfKm = Integer.parseInt(tokens[2]);
            if (cars.get(carModel).canCarMove(amountOfKm)){
                double fuelUsed = cars.get(carModel).fuelCostFor1Km * amountOfKm;
                cars.get(carModel).setFuelAmount(cars.get(carModel).getFuelAmount() - fuelUsed);
                cars.get(carModel).setKilometersTraveled(cars.get(carModel).getKilometersTraveled() + amountOfKm);
            } else {
                System.out.println("Insufficient fuel for the drive");
            }


            input = scanner.nextLine();
        }
        cars.values().forEach(car -> System.out.println(String.format("%s %.2f %d", car.getModel(), car.getFuelAmount(), car.getKilometersTraveled())));
    }
}
