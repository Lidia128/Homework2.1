import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание № 1");
        System.out.println();
    Humen maxim = new Humen ("Максим");
        maxim.town = "Минск";
        maxim.yearOfBirth= LocalDate.now().getYear() - 35;
        maxim.job = "бренд-менеджера";
        maxim.man ();

        Humen any = new Humen ("Аня");
        any.town = "Москва";
        any.yearOfBirth = LocalDate.now().getYear() - 29;
        any.job = "методиста образовательных программ";
        any.lady ();

        Humen katy = new Humen ("Катя");
        katy.town = "Калининград";
        katy.yearOfBirth = LocalDate.now().getYear() - 28;
        katy.job = "продакт-менеджера";
        katy.lady ();

        Humen artem = new Humen ("Артем");
        artem.town = "Москва";
        artem.yearOfBirth = LocalDate.now().getYear() - 27;
        artem.job = "директором по развитию бизнеса";
        artem.man ();



    }
}