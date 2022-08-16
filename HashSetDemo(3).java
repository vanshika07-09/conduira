import java.util.*;
import java.util.HashSet;
  
public class HashSetDemo {
    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<String>();
  
        set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");  
  
        System.out.println(set);
  
        Iterator value = set.iterator();
  
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
