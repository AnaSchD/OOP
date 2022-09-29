public class Person {

    String name;
    String town;
    int yearOfBirth;

    Person (String name, String town, int yearOfBirth) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
    }

    void print() {
        System.out.println("Привет! Меня зовут " + name + "." + " Я из города " + town + "." + " Я родился в " + yearOfBirth + " году." + " Будем знакомы!");
    }


}
