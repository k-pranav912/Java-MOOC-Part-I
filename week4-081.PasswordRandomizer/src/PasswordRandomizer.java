import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int passwordLength = 0;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String help = "";
        int i = 0;
        while (i < this.passwordLength) {
        int randomChar = this.random.nextInt(26);
        help += "abcdefghijklmnopqrstuvwxyz".charAt(randomChar);
        i++;
    }
        return help;
    }
}
