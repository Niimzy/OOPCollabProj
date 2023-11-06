import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Passenger<Integer, Integer> p1 = new Passenger<>(4, 4);
        Uber <Integer, Integer> u1 = new Uber<>(5, 60, "uber1", "Avalaible");
        Uber <Integer, Integer> u2 = new Uber<>(70, 6, "uber2", "Avalaible");
        Uber <Integer, Integer> u3 = new Uber<>(8, 60, "uber3", "Avalaible");

        Manager m1 = new Manager();

        List<Uber> Ubers = new ArrayList<>();

        Ubers.add(u1);
        Ubers.add(u2);
        Ubers.add(u3);

        m1.nearestUber(Ubers, p1);



    }




}
