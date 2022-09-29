public class Person {

    String name;
    String town;
    int yearOfBirth;

    String job;

    Person (String name, String town, int yearOfBirth, String job) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.job = job;
    }

    void print() {
        System.out.println("Привет! Меня зовут " + name + "." + " Я из города " + town + "." +
                " Я родился в " + yearOfBirth + " году." + " Я работаю на должности " + job + "." + " Будем знакомы!");
    }


}
