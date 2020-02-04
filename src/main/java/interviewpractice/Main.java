package interviewpractice;



public class Main {
    public static void main(String[] args) {
        BinaryTreeArray bTreeArray = new BinaryTreeArray(100);
        bTreeArray.insertIntoTree(5);
        bTreeArray.insertIntoTree(2);
        bTreeArray.insertIntoTree(3);
        bTreeArray.insertIntoTree(5);
        bTreeArray.insertIntoTree(7);
        bTreeArray.insertIntoTree(9);
        bTreeArray.insertIntoTree(52);
        bTreeArray.printTree();
    }
}
