import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringArrayElementsKeyValueTest {
    StringArrayElementsKeyValue re;
    @Before
    public void setup(){
        re=new StringArrayElementsKeyValue();
    }
    @After
    public void tearDown(){
        re=null;
    }


    @Test
    public void GivenStringArray_AllUniqueItemsSent_ShouldReturnFalseInAllCases() {
        re = new StringArrayElementsKeyValue();
        String[] str = {"one", "two", "three"};
        Map<String,Boolean> expected=new HashMap<String,Boolean>();
        expected.put("one",false);
        expected.put("two",false);
        expected.put("three",false);
       Map<String,Boolean> res= re.countFrequencies(str);
        assertEquals(expected,res);
    }

    @Test
    public void GivenStringArray_SameItemsAreAlsoSent_ShouldReturnTrueOrFalseCorresponding() {
        re = new StringArrayElementsKeyValue();
        String[] str = {"one", "two", "three", "one", "two"};
        Map<String,Boolean> expected=new HashMap<String,Boolean>();
        expected.put("one",true);
        expected.put("two",true);
        expected.put("three",false);
        Map<String,Boolean> res= re.countFrequencies(str);
        assertEquals(expected,res);
    }

    @Test
    public void GivenStringArray_SameItemsSent_ShouldReTureInAllCases() {
        re = new StringArrayElementsKeyValue();
        String[] str = {"one", "two", "three","one", "two", "three"};
        Map<String,Boolean> expected=new HashMap<String,Boolean>();
        expected.put("one",true);
        expected.put("two",true);
        expected.put("three",true);
        Map<String,Boolean> res= re.countFrequencies(str);
        assertEquals(expected,res);
    }


}