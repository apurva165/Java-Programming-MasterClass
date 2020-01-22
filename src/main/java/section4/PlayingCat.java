package section4;

public class PlayingCat {
    public static void main(String[] args) {

    }
    public static boolean isCatPlaying(boolean isSummer, int temp){
        if(!isSummer && (temp > 24 && temp <36)){
            return true;
        } else if(isSummer && (temp > 24 && temp <46)) {
            return true;
        } else {
            return  false;
        }
    }
}
