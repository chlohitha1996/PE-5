import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SetInterfaceSortArrayListTest {

    SetInterfaceSortArrayList re;

    @Before
    public void setup(){
        re=new SetInterfaceSortArrayList();
    }
    @After
    public void tearDown(){
        re=null;
    }


    @Test
    public void GivenString_ShouldReturnCountOfWords() {
        re = new SetInterfaceSortArrayList();
        HashSet<String> animals = new HashSet<String>();
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Cow");
        animals.add("Horse");

        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Cow");
        alist.add("Horse");
        alist.add("Lion");
        alist.add("Tiger");

        ArrayList<String> res= re.sortSetToList(animals);
        assertEquals(alist,res);


    }



}