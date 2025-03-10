import java.util.*;


public class Main {
   public static void main(String[] args) {
       // Create a list with duplicate values
       List<String> fruits = new ArrayList<>();
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Cherry");
       fruits.add("Date");
       fruits.add("Banana");
       fruits.add("Apple");


       System.out.println("Original List: " + fruits);


       // Remove duplicates manually
       List<String> listWithoutDuplicates = new ArrayList<>();
       for (String fruit : fruits) {
           if (!listWithoutDuplicates.contains(fruit)) {
               listWithoutDuplicates.add(fruit);
           }
       }


       System.out.println("List after removing duplicates: " + listWithoutDuplicates);


       // Use a stack to reverse the list
       Stack<String> stack = new Stack<>();
       for (String fruit : listWithoutDuplicates) {
           stack.push(fruit); // Push elements onto the stack
       }


       List<String> reversedList = new ArrayList<>();
       while (!stack.isEmpty()) {
           reversedList.add(stack.pop()); // Pop elements from the stack
       }


       System.out.println("Reversed List: " + reversedList);
   }
}
