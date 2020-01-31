package section8;

import java.util.ArrayList;

class IntClass{
    private int val;

    public IntClass(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

public class AutoBoxing {
    public static void main(String[] args) {
        String [] strings = new String[10];


        ArrayList<IntClass> arrayList = new ArrayList<IntClass>();
        arrayList.add(new IntClass(5));

        ArrayList<Integer> integers = new ArrayList<Integer>();
        int a = 2;
        integers.add(a);
    }
}
