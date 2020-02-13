package section12.sortedcollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int qty){
      int inBasket = list.getOrDefault(item, 0);
      list.put(item, inBasket + qty);
      return inBasket;
    }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
