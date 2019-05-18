import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Manitest {
    public static void main(String args[]) {
        StudentSorter sort=new StudentSorter();
        ArrayList<Student> l = new ArrayList();


        Student s1 = new Student("5", "shailendra", 16);
        Student s2 = new Student("5n", "lohitha", 22);
        Student s3 = new Student("5a", "Leela", 47);
        Student s4 = new Student("1", "Paidi", 47);
        Student s5 = new Student("z", "Anji", 5);
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        l.add(s5);
        System.out.println("Sorting by Name");
        Collections.sort(l, sort);
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            Student s = (Student) itr.next();
            System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
        }
    }
}