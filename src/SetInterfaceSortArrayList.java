import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SetInterfaceSortArrayList {
    public ArrayList<String> sortSetToList(HashSet<String> animals) {


      //Hash set elements before sorting
        System.out.println("Hashset Elements: " + animals + "\n");

      //Sorting ArrayList elements
        ArrayList<String> animalList = new ArrayList<String>(animals);
        Collections.sort(animalList);
        System.out.println("Sorted set");
        for (String animal : animalList) {
            System.out.println(animal);
        }

        System.out.println("Arraylist from set: " + animalList);

    return  animalList;
    }

}




