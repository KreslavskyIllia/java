public abstract class Vehicle implements Runnable{
    protected String name;
    protected float volume;
    protected float consumption;
    protected float fuelLeft;
    protected FuelStation fuelStation;

    public Vehicle(String name, float volume, float consumption, FuelStation fuelStation) {
        this.name = name;
        this.volume = volume;
        this.consumption = consumption;
        this.fuelLeft = volume;
        this.fuelStation = fuelStation;
    }

    public void go() {
        try {
            while (true) {
                System.out.println(String.format("%s is driving. Remaining fuel: %s", name, fuelLeft));
                Thread.sleep(3000);
                fuelLeft -= consumption;
                refuel(fuelStation);
            }
        } catch (Exception e) {
            throw new RuntimeException("SWW", e);
        }
    }

    public void refuel(FuelStation fs) {
        if (fuelLeft <= 2.5f) {
            System.out.println(String.format("%s needs to refuel. Remaining fuel: %s", name, fuelLeft));
            fuelLeft = fs.refuel(volume);
            System.out.println(String.format("%s is back. Fuel tank is full: %s", name, fuelLeft));
        }
    }

    @Override
    public void run() {
        go();
    }
}
