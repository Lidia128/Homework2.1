import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

       Humen maxim = new Humen ();

       maxim.town = "Минск";
       maxim.yearOfBirth = 1987;
       maxim.job = "бренд-менеджера";
        maxim.man ();

        Humen any = new Humen ();
        any.name = "Аня";

        any.yearOfBirth = 1993;
        any.job = "методиста образовательных программ";
        any.lady ();

        Humen katy = new Humen ();
        katy.name = "Катя";
        katy.town = "Калининград";

        katy.job = "продакт-менеджера";
        katy.lady ();

        Humen artem = new Humen ();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 1995;
        artem.man ();



    }
}