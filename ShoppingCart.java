import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    HashMap<String, Double> priceMap = new HashMap<>();
    LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();

    public void add(String product, double price, int quantity) {
        priceMap.put(product, price);
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    public void Insertion() {
        System.out.println("Cart Items (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = priceMap.get(product);
            System.out.println(product + " x" + quantity + " - $" + price);
        }
    }

    public void Sorted() {
        TreeMap<Double, List<String>> sorted = new TreeMap<>();

        for (String product : cart.keySet()) {
            double price = priceMap.get(product);
            sorted.putIfAbsent(price, new ArrayList<>());
            sorted.get(price).add(product);
        }

        System.out.println("Cart Items (Sorted by Price):");
        for (Map.Entry<Double, List<String>> entry : sorted.entrySet()) {
            double price = entry.getKey();
            for (String product : entry.getValue()) {
                int quantity = cart.get(product);
                System.out.println(product + " x" + quantity + " - $" + price);
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.add("Apple", 1.2, 3);
        cart.add("Banana", 0.8, 2);
        cart.add("Orange", 1.5, 4);
        cart.add("Banana", 0.8, 1); 

        cart.Insertion();
        System.out.println();
        cart.Sorted();
    }
}