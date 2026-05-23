import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rng = random.nextInt(100);
        System.out.print("Enter your number: ");
        int usernumber = scanner.nextInt();
        while(usernumber != rng){
            System.out.println("Please enter a number between 0 and 100.");
            System.out.print("Enter your number: ");
            usernumber = scanner.nextInt();
            if(usernumber == rng){
                System.out.println("You guessed it!");
                scanner.close();
            } else {
                if(usernumber < rng){
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
        }

    }
}
