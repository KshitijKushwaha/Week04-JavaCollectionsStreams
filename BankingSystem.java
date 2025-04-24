import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BankingSystem {
    private HashMap<Integer, Double> accBal = new HashMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    public void createAccount(int accNo, double initialBal) {
        accBal.put(accNo, initialBal);
    }

    public void requestWithdrawal(int accNo) {
        if (accBal.containsKey(accNo)) {
            withdrawalQueue.offer(accNo);
        } else {
            System.out.println("Account not found: " + accNo);
        }
    }

    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            int acc = withdrawalQueue.poll();
            double currentBalance = accBal.get(acc);
            if (currentBalance >= amount) {
                accBal.put(acc, currentBalance - amount);
                System.out.println("Withdrawal of " + amount + " processed for Account " + acc);
            } else {
                System.out.println("Insufficient balance for Account " + acc);
            }
        }
    }

    public void display() {
        TreeMap<Double, List<Integer>> map = new TreeMap<>();

        for (Map.Entry<Integer, Double> entry : accBal.entrySet()) {
            int account = entry.getKey();
            double balance = entry.getValue();
            map.putIfAbsent(balance, new ArrayList<>());
            map.get(balance).add(account);
        }

        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, List<Integer>> entry : map.entrySet()) {
            double balance = entry.getKey();
            for (int account : entry.getValue()) {
                System.out.println("Account " + account + ": " + balance);
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount(1001, 5000);
        bank.createAccount(1002, 3000);
        bank.createAccount(1003, 7000);
        bank.createAccount(1004, 3000);

        bank.requestWithdrawal(1001);
        bank.requestWithdrawal(1002);
        bank.requestWithdrawal(1003);

        bank.processWithdrawals(1000);
        System.out.println();
        bank.display();
    }
}