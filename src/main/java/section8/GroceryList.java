package section8;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
    }

    public void addGroceryItem(String item) {
        list.add(item);
    }

    public void printGroceryList() {
        for (int i = 0; i <= list.size(); i++) {
            System.out.println(list.get(i));
        }
        ArrayList<String> arrayList = new ArrayList<String>(list);
    }

    public void modifyGroceryListItem(int index, String item) {
        list.set(index, item);
    }

    private void removeGroceryListItem(int index) {
        list.remove(index);
    }

    private String removeGroceryListItemByName(String item) {
        if(list.indexOf(item) >= 0){
            list.remove(list.indexOf(item));
        }
        else {
           return  "Item not Found";
        }
        return "Not Found";
    }

    public String findItem(String searchItem) {
        // boolean exist =  list.contains(searchItem);
        int positon = list.indexOf(searchItem);
        if (positon >= 0) {
            return list.get(positon);
        }
        return null;
    }

}
