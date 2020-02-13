package section12.adventure;

import java.util.HashMap;
import java.util.Map;

 class Location {
    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationId = locationID;
        this.description = description;
        this.exits = new HashMap<>();
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
