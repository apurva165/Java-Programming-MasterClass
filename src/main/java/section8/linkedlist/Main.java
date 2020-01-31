package section8.linkedlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("name1", "45632131");
        Customer anotherCus = customer;
        anotherCus.setNumber("sdf");
       // System.out.println(customer.getNumber());


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        arrayList.add(0,2);

        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

}
