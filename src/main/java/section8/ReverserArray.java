package section8;

public class ReverserArray {
    public static void main(String[] args) {
        int[] myArray = {20,56,98,858};
        traverseArray(myArray);
        reverseArray(myArray);
    }

    public static void traverseArray(int[] myArray) {
        System.out.println("Traversing Array");
        for (int i = 0; i <= myArray.length - 1; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void reverseArray(int [] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
