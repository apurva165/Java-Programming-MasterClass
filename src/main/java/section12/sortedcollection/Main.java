package section12.sortedcollection;

public class Main {
    private static StockList  stockList= new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("one", 0.5, 10);
        stockList.addStock(temp);

    }
}
