import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Order {
    Integer waiting = 0;
    Map<Integer, ArrayList<Item>> orderMap = new TreeMap<>();
    public Order(ArrayList<Item> cart){
        waiting += 1;
        orderMap.put(waiting, cart);
    }
}
