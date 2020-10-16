import java.util.concurrent.Semaphore;

public class FuelStation {
    private Semaphore semaphore;

    public FuelStation (Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public float refuel(float requiredFuel) {
        try {
            semaphore.acquire();
            Thread.sleep(5000);
            System.out.println("Vehicle is refueling");
            return requiredFuel;
        } catch (Exception e) {
            throw new RuntimeException("SWW", e);
        } finally {
            semaphore.release();
        }
    }
}
