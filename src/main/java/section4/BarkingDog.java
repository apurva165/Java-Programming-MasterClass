package section4;

public class BarkingDog {
    public static void main(String[] args) {
        shoudlwakeUp(true , 8);

    }

    private static boolean shoudlwakeUp(boolean barking, int hourOfDay) {
      if (hourOfDay < 0 || hourOfDay >23) {
          System.out.println("Not Barking");
          return false;
      }
      if(!barking) {
          System.out.println("Not Barking");
          return false;
      }
      if(hourOfDay < 8 || hourOfDay > 22 && barking) {
          System.out.println("dog is barking");
          return true;
      }
      return false;
    }
}
