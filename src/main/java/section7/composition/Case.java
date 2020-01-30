package section7.composition;

public class Case {
    private String modal;
    private String manufacture;
    private String powerSupply;
    private Dimesions dimesions;

    public Case(String modal, String manufacture, String powerSupply, Dimesions dimesions) {
        this.modal = modal;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimesions = dimesions;
    }

    public void pressPowerButton(){
        System.out.println("Power button press");
    }

    public String getModal() {
        return modal;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimesions getDimesions() {
        return dimesions;
    }
}
