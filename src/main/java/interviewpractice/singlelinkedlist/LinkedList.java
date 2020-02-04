package interviewpractice.singlelinkedlist;

public class LinkedList {
    private listNode head;
    private listNode tail;
    private int size = 0;

    public void insertIntoList(int val) {
        listNode node = new listNode(val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
            this.size = size++;
            System.out.println("new tree created with node : " + node.getVal());
        } else {
            listNode currentHead = head;
            while (currentHead.getNext() != null) {
                currentHead = currentHead.getNext();
            }
            currentHead.setNext(node);
            this.tail = node.getNext();
            size = size++;
            System.out.println("new node added to the tree with value : " + val);
        }
    }

    public void printList() {
        listNode currentHead = head;
        while (currentHead != null) {
            System.out.println(currentHead.getVal());
            currentHead = currentHead.getNext();
        }

    }

    public int getSize() {
        return size;
    }
}
