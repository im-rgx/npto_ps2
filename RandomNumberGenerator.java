import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create a Random object
        Random rand = new Random();
        
        // Generate a random integer between 0 and 99
        int randomNumber = rand.nextInt(100); // 100 is exclusive
        
        // Print the random number
        System.out.println("Random Number: " + randomNumber);
    }
}