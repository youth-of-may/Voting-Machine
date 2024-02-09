import java.util.ArrayList;
import static java.lang.System.out;

public class VotingMachine {
    /*
     * Voting machine should be able to identify the person the voters voted, count the votes, and determine the winner.
     *
     * Inspired from a school activity, but I made everything from scratch.
     * 
     */
    private static ArrayList<Candidates> candidates;
    private int totalVotes;
    public VotingMachine() {
        totalVotes = 0;
        candidates = new ArrayList<>();
    }
    public static void addVote(String name) {
        boolean found = false;
        for (Candidates c : candidates) {
            if (c.returnName().equalsIgnoreCase(name)){
            c.addVoteToCandidate();
            found = true;
            
            }
        }
        if (found == false){
        candidates.add(new Candidates(name));
       
        }
        
    }
    
    private void returnWinnerMessage(Candidates winner) {
        out.println(winner.returnName() + " won with " + winner.returnVotes() + " votes.");
    }
    public void printCandidates() {
        for (Candidates c: candidates) {
            out.println(c.returnName());
        }
    }
    public void determineWinner() {
        int mostVotes = 0;
        Candidates winner = null;
        for (Candidates c : candidates) {
            if (c.returnVotes() > mostVotes) {
                winner = c;
                mostVotes = c.returnVotes();
            }
        }
        returnWinnerMessage(winner);
    }
    
    public static void main(String[] args) {
        /**
         * For checking
         */
        VotingMachine v = new VotingMachine();
        VotingMachine.addVote("Princess");
        VotingMachine.addVote("Princess");
        VotingMachine.addVote("Arwind");
        VotingMachine.addVote("Chika");
        VotingMachine.addVote("Chika");
        VotingMachine.addVote("Nhie");
        VotingMachine.addVote("Sam");
        VotingMachine.addVote("Sam");
        VotingMachine.addVote("Sam");
        v.determineWinner();
    }

}