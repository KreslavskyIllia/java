import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        FuelStation fuelStation = new FuelStation(new Semaphore(3));
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 1; i < 5; i++) {
            executorService.execute(new Car("Car_" + i, fuelStation));
        }
        for (int i = 1; i < 4; i++) {
            executorService.execute(new Truck("Truck_" + i, fuelStation));
        }
        for (int i = 1; i < 4; i++) {
            executorService.execute(new Bus("Bus_" + i, fuelStation));
        }
        executorService.shutdown();
    }
}
