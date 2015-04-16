import java.util.Scanner;

public class MyStackAPP {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    MyStack stack = new MyStack();
    
    for (int i = 0; i < 5; i++)
      stack.push(input.nextLine());
    
    System.out.println(stack.getSize() + " strings are: ");
    while (!stack.isEmpty())
      System.out.println(stack.pop());
  }
}

// MyStack.java: Implementing a stack using inheritance
class MyStack extends java.util.ArrayList<Object> {
  public boolean isEmpty() {
    return super.isEmpty();
  }

  public int getSize() {
    return size();
  }

  public Object peek() {
    return get(getSize() - 1);
  }

  public Object pop() {
    Object o = get(getSize() - 1);
    remove(getSize() - 1);
    return o;
  }

  public Object push(Object o) {
    add(o);
    return o;
  }

  public int search(Object o) {
    return indexOf(o);
  }

  public String toString() {
    return "stack: " + toString();
  }
}
