import java.util.*;

public class Main{
  public static void main(String[] args) {
    Collection<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");
    fruits.add("Date");
    fruits.add("Banana");
    fruits.add("Apple");
    Iterator<String> iterator = fruits.iterator();

    while(iterator.hasNext())
    {
      System.out.println(iterator.next());
    }
    
  }
}
