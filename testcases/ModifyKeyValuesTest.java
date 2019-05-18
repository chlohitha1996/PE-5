import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ModifyKeyValuesTest {
    ModifyKeyValues re;


    @Before
    public void setup() {
        re = new ModifyKeyValues();
    }

    @After
    public void tearDown() {
        re = null;
    }


    @Test
    public void GivenExpectedHashmap_ShouldReturnModifiedHashMap() {
        re = new ModifyKeyValues();
        HashMap<String,String> mapOfWord = new HashMap<String,String>() { //Expected Hash Map
            {

                put("at", " ");
                put("John", "2");

            }
        };

            HashMap<String, String> result = re.keyValue();

            assertEquals(mapOfWord, result);


    }
}