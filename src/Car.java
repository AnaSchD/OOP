public class Car {

    String brand;
    String model;
    String color;
    String productionCountry;
    double engineVolume;
    int productionYear;

    Car(String brand, String model, String color, String productionCountry, double engineVolume, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionCountry = productionCountry;
        this.engineVolume = engineVolume;
        this.productionYear = productionYear;
    }

    void print() {
        System.out.println(brand + " " + model + " " + productionYear + " год выпуска, " + " сборка в " + productionCountry + ", " +
                color + " цвет кузова, " + "объем двигателя " + engineVolume + " литра.");
    }

}
