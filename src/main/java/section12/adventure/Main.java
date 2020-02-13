package section12.adventure;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer ,  Location> locationMap = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        int count = 0;

        locationMap.put(count , new Location(count , "location1"));
        locationMap.put(count++ , new Location(count++ , "location1"));
        locationMap.put(count++ , new Location(count++ , "location1"));
        locationMap.put(count++ , new Location(count++ , "location1"));
        locationMap.put(count++ , new Location(count++ , "location1"));

        locationMap.get(1).addExit("W", 2);
        locationMap.get(1).addExit("E", 3);
        locationMap.get(1).addExit("S", 4);
        locationMap.get(1).addExit("N", 5);
        locationMap.get(1).addExit("Q", 0);


        locationMap.get(2).addExit("N", 5);
        locationMap.get(2).addExit("Q", 0);

        locationMap.get(3).addExit("W", 1);
        locationMap.get(3).addExit("Q", 0);

        locationMap.get(4).addExit("N", 1);
        locationMap.get(4).addExit("W", 2);
        locationMap.get(4).addExit("Q", 0);





    }
}
