import java.util.*;
public class Candidates {
    private String candidateName;
    private int votes;
    public Candidates(String name) {
        candidateName = name;
        votes = 1;
    }
    public void addVoteToCandidate() {
        votes++;
    }
    public String returnName() {
        return candidateName;
    }
    public int returnVotes() {
        return votes;
    }
}