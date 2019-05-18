import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ArrayListReplaceDelete {



     public ArrayList<String> replaceElementsMakeListNull(ArrayList<String> list){
          System.out.println(list);
          list.set(1,"Shailu");
          list.set(4,"Lohitha");
          System.out.println(list);
          list.removeAll(list);
          System.out.println(list);
          return list;
     }

}
