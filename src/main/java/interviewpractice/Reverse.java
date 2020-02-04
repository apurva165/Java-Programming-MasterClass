package interviewpractice;

public class Reverse {
    public static void main(String[] args) {
        reverseAString("avrupa");
    }

    public static void reverseAString(String string) {
        System.out.println("original String : " + string);
        char[] stringToArray = string.toCharArray();
        char[] resultArray = string.toCharArray();
        for (int i = 0; i <= stringToArray.length - 1; i++) {
            resultArray[i] = stringToArray[stringToArray.length - 1 - i];
        }
        System.out.println(new String(resultArray));
    }

    public static void reverseAList(){

    }
}
