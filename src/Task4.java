import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ticketAmount = (int)(Math.random() * 16) + 20;
        int userGuess = 0;
        boolean guessValid = false;
        do {
            System.out.print("Estimate the ticket count (20-35): \n ");
            if (scan.hasNextInt()) {
                userGuess = scan.nextInt();
                if (userGuess >= 20 && userGuess <= 35) {
                    guessValid = true;
                } else {
                    System.out.println("Error: Number must be from 20 through 35. Try again buddy.");
                }
            } else {
                System.out.println("Error: Please enter a valid int.");
                scan.next();
            }
        } while (guessValid == false);
        System.out.println("The actual ticket count was: " + ticketAmount);
        if (userGuess < ticketAmount) {
            System.out.println("Try again buddy");
        } else if (userGuess > ticketAmount) {
            System.out.println("Try again buddy");
        } else {
            System.out.println("Your estimate was on the dot");
        }
    }
}