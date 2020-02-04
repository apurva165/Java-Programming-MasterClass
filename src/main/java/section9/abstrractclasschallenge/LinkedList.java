package section9.abstrractclasschallenge;

import javax.management.StringValueExp;

public class LinkedList extends ListItem{
    private ListItem head;
    private ListItem tail;
    private ListItem listItem;

    public ListItem getHead() {
        return head;
    }

    public void setHead(ListItem head) {
        this.head = head;
    }

    public ListItem getTail() {
        return tail;
    }

    public void setTail(ListItem tail) {
        this.tail = tail;
    }

    public ListItem getListItem() {
        return listItem;
    }

    public void setListItem(ListItem listItem) {
        this.listItem = listItem;
    }

    public void insertIntoLinkedList(String value){
        ListItem tempListItem = head;
        ListItem currentListItem = new ListItem();
        while (tempListItem != null){
            currentListItem = currentListItem.getNext();
            tempListItem = tempListItem.getNext();
        }
        currentListItem.setItemValue(value);
    }

    public void printLinkedList(){
        ListItem currentListItem = head;
        while (this.head != null){
            System.out.println(currentListItem.getNext().getItemValue());

            currentListItem = currentListItem.getNext();
        }
    }


    public void createLinkedList(){
        ListItem node = new ListItem();
        this.head = node;
        this.tail = node;
    }

}
