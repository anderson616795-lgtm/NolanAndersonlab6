import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numberOfFullBatteryCharges = 0;
        double minutesOfOperationPerFullCharge = 0;
        double priceToRechargeFully = 0;
        double totalRunTime;
        double costForAnHourOfRunTime;
        boolean validBatteriesCharge = false;
        boolean validMinutesPerCharge = false;
        boolean validPriceToRecharge = false;
        do {
            System.out.println("Enter your number of full battery charges available");
            if (scan.hasNextDouble()) {
                numberOfFullBatteryCharges = scan.nextDouble();
                if (numberOfFullBatteryCharges < 0) {
                    scan.nextLine();
                    System.out.println("Please enter a valid number");
                } else {
                    validBatteriesCharge = true;
                }
            }else{
                scan.nextLine();
                System.out.println("Enter a valid number");
            }
        } while (!validBatteriesCharge) ;
        do {
            System.out.println("Enter your minutes of robot operation per full charge");
            if (scan.hasNextDouble()) {
                minutesOfOperationPerFullCharge = scan.nextDouble();
                if (minutesOfOperationPerFullCharge > 0) {
                    validMinutesPerCharge = true;
                } else {
                    System.out.println("Please enter a valid number");
                }
            } else {
                System.out.println("Please enter a valid number");
                scan.next();
            }

        } while (!validMinutesPerCharge) ;
        do {
            System.out.println("Enter your cost in dollars to recharge one battery fully");
            if (scan.hasNextDouble()) {
                priceToRechargeFully = scan.nextDouble();
                if (priceToRechargeFully > 0) {
                    validPriceToRecharge = true;
                } else {
                    System.out.println("Please enter a valid number");
                }
            } else {
                System.out.println("Please enter a valid number");
                scan.next();
            }

        } while (!validPriceToRecharge);

        totalRunTime = numberOfFullBatteryCharges * minutesOfOperationPerFullCharge;
        costForAnHourOfRunTime = (60 / minutesOfOperationPerFullCharge) * priceToRechargeFully;
        System.out.printf("%-10s%10.2f","Your total avalible minutes is:",totalRunTime);
        System.out.printf("\n%-10s%10.2f","Your cost to run for 60 munutes is ",costForAnHourOfRunTime);

    }
}