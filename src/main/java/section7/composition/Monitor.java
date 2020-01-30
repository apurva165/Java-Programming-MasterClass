package section7.composition;

public class Monitor {
    private String modal;
    private String  manufacture;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String modal, String manufacture, int size, Resolution nativeResolution) {
        this.modal = modal;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drayPixelAt(int x, int y, String color){
        System.out.println("drawing pixel at " + x + " " + y);
    }

    public String getModal() {
        return modal;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
