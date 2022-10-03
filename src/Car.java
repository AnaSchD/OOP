public class Car {

    String brand;
    String model;
    String color;
    String productionCountry;
    double engineVolume;
    Integer productionYear;

    Car(String brand, String model, String color, String productionCountry, Double engineVolume, Integer productionYear) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (engineVolume == null) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear == null) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
    }

    void print() {
        System.out.println(brand + " " + model + " " + productionYear + " год выпуска, " + " сборка в " + productionCountry + ", " +
                color + " цвет кузова, " + "объем двигателя " + engineVolume + " литра.");
    }

}
