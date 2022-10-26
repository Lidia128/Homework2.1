import java.time.LocalDate;

public class Humen {
    public String name;
    public String town;
    public int yearOfBirth;
    public String job;

    public Humen () {
        this.name = "информация не указана";
        this.town = "информация не указана";
        if (yearOfBirth>=0){
            this.yearOfBirth = yearOfBirth;
        }else {
            this.yearOfBirth = 0;
        }
        this.job = "информация не указана";

    }
    void man () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в "
                + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
    void lady () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родилась в "
                + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }


}
