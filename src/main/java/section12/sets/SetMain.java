package section12.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<Integer>();

        Set<Integer> cubes = new HashSet<Integer>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("there are " + squares.size() + " Squares");
        System.out.println("there are " + cubes.size() + " cubes");

        Set<Integer> union = new HashSet<Integer>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("intersection contains  " + intersection.size() + " ");

        Set<String> words = new HashSet<>();
        String sentence = "One two three four One";

        String [] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words){
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String [] arrayWordsNature = {"sdf", " "};
        nature.addAll(Arrays.asList(arrayWordsNature));
        String [] arrayWordsDivine = {"sdf", " "};
        divine.addAll(Arrays.asList(arrayWordsDivine));


        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);


        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);

        Set<String> intesectionTest = new HashSet<>(nature);
        intesectionTest.retainAll(divine);

        System.out.println("Symm diff");
        unionTest.removeAll(intesectionTest);

        System.out.println("Asymm diff");


//        nature.retainAll(divine);
//
//        divine.retainAll(nature);



//        Iterator<Integer> i = intersection.iterator();
//
//        while (words != null){
//            System.out.println(i);
//        }

    }
}
