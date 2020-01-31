package section9;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    public void powerOn() {
        isOn = true;
        System.out.println("No action Taken , Desk phone does not have power Button");
    }

    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing");
        } else {
            System.out.println("phone os off");
        }
    }


    public void answer() {
        if (isRinging) {
            System.out.println("answering desk phone");
            isRinging = false;
        }
    }

    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            System.out.println("Ringing");
            return isRinging;
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on");
        }
        return isRinging;
    }

    public boolean isRinging() {
        return false;
    }
}
