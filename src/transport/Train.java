package transport;

public class Train extends Transport {

    private double priceTrip;
    private String travelTime;
    private String startingStation;
    private String finishStation;
    private int numberOfWagons;

    public Train(String model, String productionYear, String productionCountry, Integer maxSpeed, double priceTrip,
                 String travelTime, String startingStation, String finishStation, int numberOfWagons) {
        super(model, productionYear, productionCountry, maxSpeed);
        this.priceTrip = priceTrip;
        this.travelTime = travelTime;
        this.startingStation = startingStation;
        this.finishStation = finishStation;
        this.numberOfWagons = numberOfWagons;
    }

    public void printTrain() {
        printTransport();
        System.out.print("Станция отбытия " + startingStation + ". " + "Конечная остановка " + finishStation + ". "
                + "Цена поездки " + priceTrip + " рублей"+ ". " + "Количество вагонов " + numberOfWagons);
        System.out.println();
    }

    public double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(double priceTrip) {
        this.priceTrip = priceTrip;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getStartingStation() {
        return startingStation;
    }

    public void setStartingStation(String startingStation) {
        this.startingStation = startingStation;
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        this.finishStation = finishStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
}
