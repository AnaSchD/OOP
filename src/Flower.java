public class Flower {

    private String flowerColor;

    private String flowerName;
    private String country;
    private Double cost;
    private Integer lifeSpan;


    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public Double getCost() {
        return cost;
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }


    public Flower(String flowerColor, String flowerName, String country, Double cost, Integer lifeSpan) {

        if (flowerColor == null || !flowerColor.isEmpty()) {
            this.flowerColor = " цвет белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if (country == null || !country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0 || cost == null) {
            this.cost = 1.0;
        } else {
            this.cost = cost;
        }

        if (lifeSpan <= 0 || lifeSpan == null) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

        this.flowerName = flowerName;

    }

    public void printFlower() {
        System.out.println(flowerName + " " + flowerColor + ". " + " Страна происхождения - " + country + ". " + " Стоимость "
                + cost + " руб. " + " Срок стояния - " + lifeSpan + " дней.");
    }

}
