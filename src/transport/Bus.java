package transport;

public class Bus extends Transport {

    public Bus(String model, String brand, String productionYear, String productionCountry, String color, Integer maxSpeed) {
        super(model, brand, productionYear, productionCountry, color, maxSpeed);
    }
    @Override
    public void refill() {
        System.out.println("Заправить бензином на заправке");
        System.out.println("Заправить дизелем на заправке");
    }
}
