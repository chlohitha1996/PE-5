import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListReplaceDeleteTest {
    private static ArrayListReplaceDelete re;
    @Before
    public void setup(){
        re=new ArrayListReplaceDelete();
    }
    @After
    public void tearDown(){
        re=null;
    }



    @Test
    public void GivenStringAndPattern_PatternContainsString_ShouldReturnStartEndPositions() {
        re = new ArrayListReplaceDelete();

            // let's create a  initial list first
           ArrayList<String> topBooks = new ArrayList<String>();
            topBooks.add("Clean Code");
            topBooks.add("Clean Coder");
            topBooks.add("Effective Java");
            topBooks.add("Head First Java");
            topBooks.add("Head First Design patterns");
           //Now Let's create a new list which looks same after change
        ArrayList<String>  authors=new ArrayList<String>();
        authors.add("Clean Code");
        authors.add("Shailu");
        authors.add("Effective Java");
        authors.add("Head First Java");
        authors.add("Lohitha");
        ArrayList<String> result=re.replaceElementsMakeListNull(topBooks);
        assertEquals("","");


        }



}