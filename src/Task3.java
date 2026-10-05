import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gardenLength = 0;
        double gardenWidth = 0;
        double totalarea = 0;
        double squareArea;
        boolean validGardenLength = false;
        boolean validGardenWidth = false;
        do {
            System.out.println("Enter the length of your triangle shaped garden");
            if (scan.hasNextDouble()) {
                gardenLength = scan.nextDouble();
                if (gardenLength > 0) {
                    validGardenLength = true;
                } else {
                    System.out.println("Please enter a valid number");
                }
            } else {
                System.out.println("Please enter a valid number");
                scan.next();
            }

        } while (!validGardenLength) ;
        do {
            System.out.println("Enter the width of your triangle shaped garden");
            if (scan.hasNextDouble()) {
                gardenWidth = scan.nextDouble();
                if (gardenWidth > 0) {
                    validGardenWidth = true;
                } else {
                    System.out.println("Please enter a valid number");
                }
            } else {
                System.out.println("Please enter a valid number");
                scan.next();
            }

        } while (!validGardenWidth) ;


        squareArea = gardenLength * gardenWidth;
        totalarea = squareArea / 2;
        double hypotenuse = Math.sqrt((gardenLength * gardenLength) + (gardenWidth * gardenWidth));
        double perimeter = hypotenuse + gardenLength + gardenWidth;
        System.out.printf("%-10s%10.2f","Your garden length is :",gardenLength);
        System.out.printf("\n%-10s%10.2f","Your garden width is :",gardenWidth);
        System.out.printf("\n%-10s%10.2f","Your triangle shaped gardens hypotenuse is : ",hypotenuse);
        System.out.printf("\n%-10s%10.2f","Your triangle shaped gardens perimeter is : ",perimeter);
        System.out.printf("\n%-10s%10.2f","Your triangle shaped gardens area is : ",totalarea);

    }
}