import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ModifyKeyValues {


    public  HashMap<String,String> keyValue() {

            // Create a Map of words and their key-values
            HashMap<String,String> mapOfWords = new HashMap<String,String>() {
                {

                    put("at", "2");
                    put("John", "25");

                }
            };
            // Print the map
            System.out.println(mapOfWords);

            /*
             * Updating value of a given in HashMap using put()
             */


            // Update the value of key "John" to 2
         mapOfWords.put("John", "2");
         mapOfWords.replace("at"," "); // replacing  value of "at" with " "
        System.out.println(mapOfWords);

        return mapOfWords;
    }
}