package section12;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> languages  = new HashMap<String, String>();
        languages.put("Eng", "en");
        languages.put("Hindi", "hi");
        languages.put("Franch", "fr");
        languages.put("Spanish", "sp");

        System.out.println(languages.get("Eng"));

        languages.put("Eng", "some more bout english");
        System.out.println(languages.get("Eng"));
        if(languages.containsKey("Eng")){
            System.out.println("already present");
        }

        System.out.println("=====================");

        for (String key : languages.keySet()){
            System.out.println("KEY : " + languages.get(key));
        }

        System.out.println("=====================");

        languages.remove("Eng");
        if (languages.remove("Hindi", "hi")){
            System.out.println("Hindi Removed");
        }

        languages.replace("Franch", "fr is changed to FR");

        System.out.println(languages.get("Franch"));
    }
}
