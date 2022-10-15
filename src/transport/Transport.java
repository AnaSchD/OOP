package transport;

public abstract class Transport {

    private String model;
    private String brand;
    private final String productionYear;
    private final String productionCountry;
    private String color;
    private Integer maxSpeed;

    public Transport(String model, String productionYear, String productionCountry, Integer maxSpeed) {
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.maxSpeed = maxSpeed;
    }

    public Transport(String model, String brand, String productionYear, String productionCountry, String color, Integer maxSpeed) {
        this.model = model;
        this.brand = brand;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public void printTransport( ) {
        System.out.print("Модель " + model + ". " + "Год выпуска " + productionYear + ". " + "Страна " + productionCountry + ". "
                + "Максимальная скорость " + maxSpeed + " км/ч"+ ". ");
    }

    public void printTransportTwo( ) {
        System.out.println("Модель " + model + ". " + "Год выпуска " + productionYear + ". " + "Страна " + productionCountry + ". "
                + "Цвет " + color + ". " + "Максимальная скорость " + maxSpeed + " км/ч"+ ". ");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null)
            this.color = color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        if (maxSpeed != null)
            this.maxSpeed = maxSpeed;
    }

    public abstract void refill();
}
