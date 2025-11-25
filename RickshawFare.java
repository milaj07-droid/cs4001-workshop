import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {

        double BASE_FARE = 25;
        double PER_KM = 15;
        double PER_MIN = 2;
        double LOCAL_DISCOUNT = 0.10; 
        double NIGHT_EXTRA = 0.20;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (minutes): ");
        double time = sc.nextDouble();

        System.out.print("Is customer local? (yes/no): ");
        String local = sc.next();

        System.out.print("Is it night time? (yes/no): ");
        String night = sc.next();

        // ternary for yes/no
        boolean isLocal = local.equals("yes") ? true : false;
        boolean isNight = night.equals("yes") ? true : false;

        // base fare
        double fare = BASE_FARE + (distance * PER_KM) + (time * PER_MIN);

        // apply local discount using ternary 
        fare = (isLocal && distance > 10) ? (fare - fare * LOCAL_DISCOUNT) : fare;

        // apply night extra using ternary 
        fare = isNight ? (fare + fare * NIGHT_EXTRA) : fare;

        System.out.println("Total Fare: Rs. " + fare);
    }
}