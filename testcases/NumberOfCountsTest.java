import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountsTest {
    NumberOfCounts re;

    @Before
    public void setup(){
        re=new NumberOfCounts();
    }
    @After
    public void tearDown(){
        re=null;
    }


    @Test
    public void GivenString_ShouldReturnCountOfWords() {
        re = new NumberOfCounts();

        String str = "one one - one ___ two , , three , one @ three * one ? two";
        Map<String,Integer> expected=new HashMap<String, Integer>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);

    Map<String,Integer> res= re.countFrequencies(str);
      assertEquals(expected,res);


    }
    @Test
    public void GivenString__ShouldReturnCountOfWords() {
        re = new NumberOfCounts();

        String str = "Lohitha is a is a very ***** girl";
        Map<String,Integer> expected=new HashMap<String, Integer>();
        expected.put("a",2);
        expected.put("very",1);
        expected.put("Lohitha",1);
        expected.put("is",2);
        expected.put("girl",1);

        Map<String,Integer> res= re.countFrequencies(str);
        assertEquals(expected,res);


    }






}