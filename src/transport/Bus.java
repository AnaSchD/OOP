package transport;

public class Bus extends Transport {

    public Bus(String model, String brand, String productionYear, String productionCountry, String color, Integer maxSpeed, String fuel) {
        super(model, brand, productionYear, productionCountry, color, maxSpeed, fuel);
    }
    @Override
    public void refill() {
        System.out.println("Вид топлива для заправки машины " + getBrand() + ":" + getFuel());
    }
}
