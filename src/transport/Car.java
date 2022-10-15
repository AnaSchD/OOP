package transport;

import java.time.LocalDate;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private String typeBody;
    private String registrationNumber;
    private Integer numberOfSeats;
    private boolean summerRubber;

    private Key key;

    private Insurance insurance;

    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

    }

    public static class Insurance {

        private final LocalDate validity;
        private final Double price;
        private String number;

        public Insurance(LocalDate validity, Double price, String number) {
            this.validity = validity;
            if (validity.isBefore(LocalDate.now())) {
                System.out.println("Срочно ехать оформлять новую страховку");
            }

            if (number.length() < 9) {
                System.out.println("Номер страховки некорректный");
            } else {
                this.number = number;
            }
            this.price = price;
        }
    }

    @Override
    public void refill() {
        System.out.println("Если машина электрокар, то заряди на специальной элетропарковке");
        System.out.println("Заправить бензином на заправке");
        System.out.println("Заправить дизелем на заправке");
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean getSummerRubber() {
        return summerRubber;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummerRubber(boolean summerRubber) {
        this.summerRubber = !this.summerRubber;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Car(String model, String brand, String productionYear, String productionCountry, String color, Integer maxSpeed,
               Double engineVolume, String transmission, String typeBody, String registrationNumber, boolean rubber, Integer numberOfSeats) {

       super(model, brand, productionYear, productionCountry, color, maxSpeed);

        if (engineVolume == null) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "defauilt";
        } else {
            this.transmission = transmission;
        }

        if (typeBody == null || typeBody.isEmpty()) {
            this.typeBody = "defauilt";
        } else {
            this.typeBody = typeBody;
        }

        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "defauilt";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (numberOfSeats == null) {
            this.numberOfSeats = 0;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

    }


    public boolean changeTires() {
        summerRubber = !summerRubber;
        return true;
    }

    public boolean correctNumber(String registrationNumber) {
        char[] regNum = registrationNumber.toCharArray();
        if (regNum.length != 8) {
            return false;
        }
        if (!Character.isAlphabetic(regNum[0])) {
            return false;
        }
        if (!Character.isDigit(regNum[1])) {
            return false;
        }
        if (!Character.isDigit(regNum[2])) {
            return false;
        }
        if (!Character.isDigit(regNum[3])) {
            return false;
        }
        if (!Character.isAlphabetic(regNum[4])) {
            return false;
        }
        if (!Character.isAlphabetic(regNum[5])) {
            return false;
        }
        if (!Character.isDigit(regNum[6])) {
            return false;
        }
        if (!Character.isDigit(regNum[7])) {
            return false;
        }
        return true;
    }

    public void print() {
        System.out.println("объем двигателя " + engineVolume + " литра." + "Коробка передач " + transmission + ". " + "Тип кузова " +
                typeBody + ". " + "Регистрационный номер " + registrationNumber + ". " + "Количество мест " + numberOfSeats + ". " +
                "Резина " + summerRubber + ".");
    }

}
