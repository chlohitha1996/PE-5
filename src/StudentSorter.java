import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentSorter implements Comparator {
    public int compare(Object a, Object b) {

        Student s1 = (Student)a;
        Student s2 = (Student)b;

//Sort according to age

          if (s1.getAge() == s2.getAge()) { //If same age Check for names(alphabetical order)

            int result = s1.getName().compareTo(s2.getName()); //If Same name compare ID
            return result == 0 ? s1.getId().compareTo(s2.getId()) : result;
          }
         else
         {
            return s1.getAge() > s2.getAge()? 1 : -1;
         }

    }

}
