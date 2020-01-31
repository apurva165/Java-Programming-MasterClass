package section9;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    public void powerOn() {
        System.out.println("No action Taken , Desk phone does not have power Button");
    }

    public void dial(int phoneNumber) {
        System.out.println("Now ringing");
    }

    public void answer() {
        if (isRinging) {
            System.out.println("answering desk phone");
        }
    }

    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            System.out.println("Ringing");
           return isRinging;
        }
        return !isRinging;
    }

    public boolean isRinging() {
        return false;
    }
}
