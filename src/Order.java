import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Order {
    static Integer ordernum = 0;
    static Map<Integer, ArrayList<Item>> orderMap = new TreeMap<>();

    public static ArrayList<Order> waiting = new ArrayList<>();
    public static void setWaiting(ArrayList<Item> cart){
        ordernum += 1;
        orderMap.put(ordernum, cart);
    }

}
