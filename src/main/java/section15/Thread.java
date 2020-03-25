package section15;

import java.util.HashSet;
import java.util.Set;

public class Thread {
    public static void main(String[] args) {
        System.out.println("Main Thread");

        Thread another = new AnotherThread();
       // another.start();

        System.out.println();
    }

    public int uniqueMorseRepresentations(String[] words) {
        String [] letters =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        //  int num = 97;
        Set<String> finalResult = new HashSet<>();

        for(String word : words){


            StringBuilder sb = new StringBuilder();
            char [] letter = word.toCharArray();

            for (char c : letter){

                sb.append( letter[(int) c - 97]);

            }

            finalResult.add(sb.toString());
        }
        return finalResult.size();

    }
}
