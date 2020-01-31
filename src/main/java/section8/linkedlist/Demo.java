package section8.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();

        addInOrder(placeToVisit,"Austin");
        addInOrder(placeToVisit,"Dallas");
        addInOrder(placeToVisit,"Houston");
        addInOrder(placeToVisit,"Albany");
        addInOrder(placeToVisit,"Vegas");
        addInOrder(placeToVisit,"tuscon");

//        placeToVisit.add("Austin");
//        placeToVisit.add("Dallas");
//        placeToVisit.add("Houston");
//        placeToVisit.add("Albany");
//        placeToVisit.add("vegas");
//        placeToVisit.add("tuscon");

      //  printList(placeToVisit);
     //   placeToVisit.add(1, "newCity");
     //   printList(placeToVisit);

    //    placeToVisit.remove(4);
        printList(placeToVisit);

    }

    public static void printList(LinkedList<String> linkedList){
        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("List ended");
    }

    private static boolean addInOrder(LinkedList<String> linkedList , String newCity){
        ListIterator<String> i = linkedList.listIterator();
        while (i.hasNext()) {
            int comparision = i.next().compareTo(newCity);
                if (comparision == 0){
                    System.out.println("city already Exist : " + newCity);
                    return false;
                } else if (comparision > 0){
                    i.previous();
                    i.add(newCity);
                    return true;
                } else if (comparision < 0) {
                    System.out.println("Moving to Next city");
                }
            }
        i.add(newCity);
        System.out.println("new City Added At and : " + newCity );
        return true;
    }
}
