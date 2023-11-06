import java.util.ArrayList;
import java.util.List;

public class Manager {

    public Manager() {
    }


    public static <X, Y> double calculateDistance(Uber<X, Y> uber, Passenger<X, Y> p1) {

        int a = (int) uber.getX();
        int b = (int) p1.getX();
        double FstTerm = Math.pow(a - b, 2);

        int c = (int) uber.getY();
        int d = (int) p1.getY();
        double ScdTerm = Math.pow(c - d, 2);

        double result = FstTerm + ScdTerm;
        return Math.sqrt(result);

    }

    public static void calcFare(double distance, Uber uber){
        System.out.println("Fare: " + );
    }




    public <X, Y> void nearestUber(List<Uber> Ubers, Passenger<X, Y> p1) {

        Uber closestUber=null;
        double minimumDistance = 10000;

        for (Uber uber : Ubers) {

            double distance = Manager.calculateDistance(uber, p1);
            if (distance < minimumDistance) {
                minimumDistance = distance;
                closestUber = uber;

            }

        }

        System.out.println("Nearest Uber: " + closestUber);


    }

}