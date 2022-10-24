import java.time.LocalDate;

public class Humen {
    String name;
    String town;
    int yearOfBirth;

    String job;



    Humen (String name) {
        this.name = name;

    }
    void man() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в "
                + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
    void lady () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родилась в "
                + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }


}
