import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userDistanceInKM;
        double mileConversion = 0.621371;
        double userDistanceInMiles = 0;
        boolean valid = false;
        do {
            System.out.println("Please enter the distance you ran in KM:");
            if (scan.hasNextDouble()){
                userDistanceInKM = scan.nextDouble();
                userDistanceInMiles = userDistanceInKM * mileConversion;
                System.out.printf("Distance in KM: %10.2f", userDistanceInKM);
                System.out.printf("\nDistance in miles: %10.2f", userDistanceInMiles);
                System.out.printf("\nThank you");
                valid = true;
            }else{
                System.out.println("You must enter a valid distance.");
                scan.nextLine();
            }
        } while (!valid);

    }
}