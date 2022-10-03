public class Main {
    public static void main(String[] args) {

        Person Maksim = new Person("Максим", null, 1987, "бренд-менеджера");
        Maksim.print();
        Person Anya = new Person("Аня", "Москва", 1993, "методиста образовательных программ");
        Anya.print();
        Person Katya = new Person(null, "Калининград", -1, "продакт-менеджера");
        Katya.print();
        Person Artem = new Person("Артем", "Москва", 1995, null);
        Artem.print();

      Car car1 = new Car("Lada", "Grande", null, "России", 1.7, 2015);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", "черный", "Германии", 3.8, 2020);
        Car car3 = new Car("BMW", "Z8", "черный", null, 3.0, 2021);
        Car car4 = new Car("Kia", "Sportage 4 поколение", "красный", "Южной Корее", 2.4, 2018);
        Car car5 = new Car("Hyundai", "Avante", "оранжевый", "Южной Корее", 1.6, 2016);
        car1.print();
        car2.print();
        car3.print();
        car4.print();
        car5.print();


    }

}