class Stack {
  
  private int arr[];

  private int high;

  private int total_size;

 

  Stack(int size) {

    arr = new int[size];

    total_size = size;

    high = -1;

  }
  
  public void push(int x) {

    if (isFull()) {

      System.out.println("Stack is full");

      System.exit(1);

    }

 

    System.out.println("push the elements " + x);

    arr[++high] = x;

  }

 

  public int pop() {

    if (isEmpty()) {

      System.out.println("stack is empty");

      System.exit(1);

    }

    return arr[high--];

  }

 

  public int getSize() {

    return high+ 1;

  }

 

  public Boolean isEmpty() {

    return high == -1;

  }

  public Boolean isFull() {

    return high == total_size - 1;

  }

 

  public void printStack() {

    for (int i = 0; i <= high; i++) {

      System.out.println(arr[i]);

    }

  }

 

}


class Stackmain{

 

public static void main(String[] args) {

    Stack stack = new Stack(5);

 

    stack.push(1);

    stack.push(2);

    stack.push(3);

 

    System.out.print("Stack: ");

    stack.printStack();

 

    stack.pop();

    System.out.println("pop");

    stack.printStack();

 

  }

}