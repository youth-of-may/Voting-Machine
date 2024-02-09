import java.util.*;
import static java.lang.System.out;
public class ElectionDay {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        VotingMachine v = new VotingMachine();

        //ask for prompt
        boolean running = true;
        while (running) {
            out.println("Who do you want to vote?");
            VotingMachine.addVote(keyboard.nextLine());

            out.println("Do you want to vote again? Y/N");
            if (keyboard.nextLine().equalsIgnoreCase("Y")) {
                running = true;
            }
            else 
            running = false;
        }
        v.determineWinner();
        keyboard.close();
    }
}