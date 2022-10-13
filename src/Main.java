import transport.Bus;
import transport.Car;
import transport.Train;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Train Lastochka = new Train("Ласточка B-901", "2011", "Россия", 301,
                3500.00, "", "Белорусский вокзал", "Минск-Пассажирский", 11);

        Train Leningrad = new Train("Ленинград D-125", "2019", "Россия", 270,
                1700.00, "", "Леннинградский вокзал", "Ленинград-Пассажирский", 8);

        Lastochka.printTrain();
        Leningrad.printTrain();

        Bus bus1 = new Bus("3205", "ПАЗ", "2000", "Россия", "белый", 80);
        Bus bus2 = new Bus("677", "Ли-АЗ", "1999", "Россия", "оранжевый", 90);
        Bus bus3 = new Bus("5299", "НефАЗ", "2005", "Россия", "синий", 100);

        bus1.printTransportTwo();
        bus2.printTransportTwo();
        bus3.printTransport();


       /* Person Maksim = new Person("Максим", null, 1987, "бренд-менеджера");
        Maksim.print();
        Person Anya = new Person("Аня", "Москва", 1993, "методиста образовательных программ");
        Anya.print();
        Person Katya = new Person(null, "Калининград", -1, "продакт-менеджера");
        Katya.print();
        Person Artem = new Person("Артем", "Москва", 1995, null);
        Artem.print();
        Person Vladimir = new Person("Владимир", "Казань", 2001, null);
        Vladimir.print();*/

       /* Car car1 = new Car("Lada", "Grande", null, "России", 1.7, 2015,
                "механическая", "седан", "х000хх000", false, 4);

        Car car2 = new Car("Audi", "A8 50 L TDI quattro", "черный", "Германии", 3.8,
                2020,"автомат", "седан", "чч45ч444", true, 0);

        Car car3 = new Car("BMW", "Z8", "черный", null, 3.0, 2021, "механика",
                "седан", "автомат", true, 0);

        Car car4 = new Car("Kia", "Sportage 4 поколение", "красный", "Южной Корее", 2.4,
                2018, "автомат", "хэтчбек", null, true, 0);

        Car car5 = new Car("Hyundai", "Avante", "оранжевый", "Южной Корее", 1.6,
                2016, "автомат","седан", null, true, 0);

        car1.print();

       // System.out.println(car1.changeTires (Calendar.DECEMBER));
        System.out.println(car1.getRegistrationNumber());
        System.out.println(!car1.correctNumber("3ччч000ч"));


        //car3.print();
        //car4.print();
       // car5.print();


       /* Flower[] flowers = new Flower[10];
        Flower one = new Flower(null, "Роза", "Голландия", 35.59, 3);
        Flower two = new Flower(null, "Хризантема", null, 15.0, 5);
        Flower three = new Flower(null, "Пион", "Англия", 69.9, 1);
        Flower four = new Flower(null, "Гипсофила", "Турция", 19.5, 10);
        flowers[0] = one;
        flowers[1] = two;

        calculate(flowers);
    }

    private static void calculate (Flower[] flowers) {
        double sum = 0;
        int lifeSpan = 1000;
        String nameFlowers = " В букете есть: \n";

        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                nameFlowers += " " + flowers[i].getFlowerName() + " " + "из " + flowers[i].getCountry() +"\n";
                if (flowers[i].getLifeSpan() < lifeSpan) {
                    lifeSpan = flowers[i].getLifeSpan();
                }
                sum += flowers[i].getCost();
            }
        }
        sum = sum * 1.10;
        nameFlowers += "\n";
        nameFlowers += "Сумма букета = "  + sum;
        nameFlowers += "\n";
        nameFlowers += " Срок годности " + lifeSpan;
        System.out.println(nameFlowers);*/


    }

}