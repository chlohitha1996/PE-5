import java.util.*;

public class StringArrayElementsKeyValue {


        public Map<String,Boolean> countFrequencies (String[] str)
        {
            Map<String, Boolean> stringHashMap = new HashMap<>();

            for (String word : str) {
                if (stringHashMap.containsKey(word)) {
                    stringHashMap.replace(word, true);
                } else {
                    stringHashMap.put(word, false);
                }

            }

            System.out.println(stringHashMap);

            return stringHashMap;

        }
    }
