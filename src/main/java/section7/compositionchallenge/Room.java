package section7.compositionchallenge;

public class Room {
    private int door;
    private String bedType;
    private boolean isBiggestRoom;

    public Room(int door, String bedType, boolean isBiggestRoom) {
        this.door = door;
        this.bedType = bedType;
        this.isBiggestRoom = isBiggestRoom;
    }

    public void callBedType(){
        getBedType();
    }

    public int getDoor() {
        return door;
    }

    private String getBedType() {
        return bedType;
    }

    public boolean isBiggestRoom() {
        return isBiggestRoom;
    }
}
