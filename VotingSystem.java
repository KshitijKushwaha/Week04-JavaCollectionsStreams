import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {
    HashMap<String, Integer> voteMap = new HashMap<>();
    LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
    }

    public void Inserted() {
        System.out.println("Votes in Insertion Order:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void Sorted() {
        TreeMap<String, Integer> sorted = new TreeMap<>(voteMap);
        System.out.println("Votes in Sorted Order (Candidate Name):");
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void VoteCount() {
        System.out.println("All Vote Counts (HashMap):");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();

        vs.castVote("Alice");
        vs.castVote("Bob");
        vs.castVote("Alice");
        vs.castVote("Charlie");
        vs.castVote("Bob");

        vs.VoteCount();
        System.out.println();
        vs.Inserted();
        System.out.println();
        vs.Sorted();
    }
}