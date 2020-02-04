package interviewpractice.singlelinkedlist;

public class listNode {
    private int val;
    private listNode next;

    public listNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public listNode getNext() {
        return next;
    }

    public void setNext(listNode next) {
        this.next = next;
    }
}
