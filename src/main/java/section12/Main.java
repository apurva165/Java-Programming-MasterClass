package section12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("ghandiHall", 8, 12);
//        List<Theater.Seat> seatCopy = new ArrayList<Theater.Seat>(theater.seats);
//
//        Collections.reverse(seatCopy);
//        Collections.shuffle(seatCopy);
        if (theater.reserveSeat("H11")) {
            System.out.println("please pay for Seat");
        } else {
            System.out.println("seat already Reserved");
        }
        List<Theater.Seat> list = new ArrayList<Theater.Seat>(theater.getSeats());
        printList(list);
    }

    public static void printList(List<Theater.Seat> list) {
        for (Theater.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber() +  " " + seat.getPrice());
        }
        System.out.println("========================");
    }

//    public static void sortList(List<? extends Theater.Seat> list) {
//        for (int i = 0; i <= list.size() - 1; i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}


//        theater.getSeats();

//        if(theater.reserveSeat("H11")){
//            System.out.println("please pay for Seat");
//        } else {
//            System.out.println("seat already Reserved");
//        }
//
//        if(theater.reserveSeat("H11")){
//            System.out.println("please pay for Seat");
//        } else {
//            System.out.println("seat already Reserved");
//        }
