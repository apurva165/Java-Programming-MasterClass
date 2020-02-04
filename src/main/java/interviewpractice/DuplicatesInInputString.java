package interviewpractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInInputString {
    public static void main(String[] args) {
        String string = "asdfasdfasdf";
    }

    public static void findDuplicates(String str) {
        Map<Integer, MapOBject> stringMap = new HashMap<Integer, MapOBject>();
    }

    class MapOBject {
        private int count;
        private String latter;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getLatter() {
            return latter;
        }

        public void setLatter(String latter) {
            this.latter = latter;
        }
    }

}
