import java.util.Scanner;
import java.util.Random;
/**
 * This programs allows the user to guess the value of a random integer and will count
 * the number of attempts made until the correct guess is made.
 *
 * @author Peter Kutchen
 * @version 10/27/20
 */
public class TooLargeTooSmall {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    int upperbound = 10;
    int randomNumber = rand.nextInt(upperbound);
    
    public String guess() {
        String results = "";
        System.out.println("Please take your first guess!");
        int count = 0;
        while(results != "correct!") {
            int chosenNum = scanner.nextInt();
        if(chosenNum < randomNumber) {
            results = "Your guess is less than the random number";
            System.out.println(results);
            count++;
    } else if(chosenNum > randomNumber) {
        results = "Your guess is more than the random number";
        System.out.println(results);
        count++;
    } else {
        results = "correct!";
    }
}
    return "Your guess is " + results + " and it took you " + count + " guesses.";
}
}