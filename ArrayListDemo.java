import java.util.*;
  
public class ArrayListDemo {
    public static void main(String args[])
    {
        ArrayList<String> alist=new ArrayList<String>();
  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");  
  
        System.out.println(alist);
  
        Iterator value = alist.iterator();
  
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}