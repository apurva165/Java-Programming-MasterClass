package interviewpractice;

public class BinaryTreeArray {
    private int[] intArray ;
    private int lastIndexUsed ;

    public BinaryTreeArray(int size) {
        intArray = new int[size];
        this.lastIndexUsed = 0;
    }

    public void insertIntoTreeArray(int val) {
        intArray[lastIndexUsed] = val;
        System.out.println(" -> " + val + " -> ");
        this.lastIndexUsed++;
    }

    public void printTree(){
        for(int i = 0; i < lastIndexUsed;  i++){
            System.out.println(intArray[i]);
        }
    }

    public void insertIntoTree(int val) {
        intArray[lastIndexUsed] = val;
        System.out.println(" -> " + val + " -> ");
        this.lastIndexUsed++;
    }
}
