import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumberOfCounts {


    public Map<String,Integer> countFrequencies(String str)
    {

        String strArray[] = str.split("[\\s+\\-\\_,@\\?\\*\\&]"); //Splitting the string, Converting into String Array

        // hashmap to store the frequency of element
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : strArray) {
            if (!i.equals("")){
                Integer j = hm.get(i);
                hm.put(i, (j == null) ? 1 : j + 1);
            }

        }

        // displaying the occurrence of elements in the arraylist


        for (Map.Entry<String, Integer> val : hm.entrySet()) {


            System.out.println(val.getKey() + " "
                    + ""
                    + ": " + val.getValue() + " times");

        }
        return hm;
    }
}
