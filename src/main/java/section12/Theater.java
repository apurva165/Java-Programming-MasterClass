package section12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Theater {
    private final String theaterName;
    private List<Seat> seats = new ArrayList<Seat>();

    public Theater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;

        int lastRow = 'A' + (numRows - 1);

        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12;
                if (row < 'D' && (seatNum >= 4 && seatNum <= 9)) {
                    price = 14;
                } else if (row > 'D' && (seatNum < 4 || seatNum > 9)) {
                    price = 7;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }


    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no Seat : " + seatNumber);
            return false;
        }
//        for (Seat seat : seats) {
//            System.out.println(".");
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.println("there is no Seat");
//            return false;
//        } else {
//            return requestedSeat.reserve();
//        }
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        char whatever;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat : " + seatNumber + " reserve");
                return true;
            } else {
                System.out.println("Seat Already Reserved : " + seatNumber);
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }
}
