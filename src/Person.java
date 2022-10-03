public class Person {

    String name;
    String town;
    Integer yearOfBirth;

    String job;

    Person(String name, String town, Integer yearOfBirth, String job) {

        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }

        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

    }

    void print() {

        System.out.println("Привет! Меня зовут " + name + "." + " Я из города " + town + "." + " Я родился в " + yearOfBirth + " году." +
                "Я работаю на должности " + job + "." + " Будем знакомы!");
    }


}
