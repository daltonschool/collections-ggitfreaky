import java.util.ArrayList;

public class IntStack {

	public static void main(String[] args) {
		IntStack is = new IntStack();
		System.out.println(is.isEmpty());
		is.push(3);
		is.push(4);
		is.push(5);
        System.out.println("size: " + is.size());
		System.out.println(is.isEmpty());
		System.out.println(is.pop());
		System.out.println(is.peek());



		//print testing
        System.out.println("Print");
        IntStack printStack = new IntStack();
        printStack.push(3);
        printStack.push(4);
        printStack.push(5);
        printStack.push(50);
        printStack.push(54);
        printStack.push(154);
        printStack.print();

        //Henry's Resize test code
        IntStack test = new IntStack();
        System.out.println(test.isEmpty());
        for (int i = 0; i < 204; i++) {
            test.push(1);
        }
        System.out.print("Resized");

		//Count testing
        //stack count works!
        is.push(4);
        System.out.println(is.count(4));

        //testing code for popping multiple items
        IntStack mine = new IntStack();
        mine.push(3);
        mine.push(4);
        mine.push(5);
		int[] tester = mine.pop(2);
        for (int i = 0; i < tester.length; i++) {
            System.out.println(tester[i]);
        }
        IntStack mine2 = new IntStack();
        mine2.push(3);
        mine2.push(4);
        mine2.push(5);
        int[] tester2 = mine2.pop(4);
        for (int i = 0; i < tester2.length; i++) {
            System.out.println(tester2[i]);
        }
    }


	int[] stack;
	int top;
	
	public IntStack() {
		stack = new int[100];
		top = 0;
	}
	
	boolean isEmpty() {
		return top==0;
	}

	void push(int i) {
		if(top==stack.length) resize();
		stack[top++]=i;
	}

	int pop() {
		if(!isEmpty()) return stack[--top];
		return -1;
  }	

	int peek() {//sometimes
		if(!isEmpty()) return stack[top-1];	
		return -1;
	}

    /*
    make a new larger implementing array
    */
    private void resize() {
        int[] biggerstack = new int[stack.length*2];
        for (int i = 0; i < stack.length; i++) {
            biggerstack[i] = stack[i];
        }
        stack = biggerstack;
    }

    /*
    how large is the stack?
    */
    public int size() {

        return top;
    }

    /*
    sort the contents of the stack
    */
    public void sort() {
//        String[] arr = new String[stack.size()];
//        arr.sort();
    }

    /*
    print the Stack pretty-like
    */
    public void print() {
        for (int i = top -1; i >= 0; i--) {
            if (stack[i]<10)System.out.println("| " + stack[i] + "   |");
            else if (stack[i]> 100)System.out.println("| " + stack[i] + " |");
            else    System.out.println("| " + stack[i] + "  |");
        }
        System.out.println("|_____|");

    }

    /*
    return the item depth distance from the top
    */
    public int peek(int depth) {
        return stack[top-depth];
    }

    /*
    return multiple items from the top in a new array
    */
    public int[] pop(int multiple) {
        int[] answer = new int[multiple];
        if(multiple>(top)) answer = new int[top];
        for (int i = 0; i < multiple; i++) {
            if(!isEmpty()) answer[i] = (stack[--top]);
            if(top<0) return answer;
        }
        return answer;
    }

    /*
    push multiple items onto the stack
    */
    public void push(int[] nums) {

    }

    /*
    how many [num]'s are n the stack?
    */
    public int count(int num) {
        int counter = 0;
        for(int i = 0; i < stack.length; i ++){
            if (stack[i] == num){

                counter++;
            }
        }
        return counter;
    }

    /*
    remove depth items
    */
    public void dump(int depth) {

    }

    /*
    return the contents of the stack as an array
    */
    public int[] toArray() {
			return null;
    }

    /*
    make the bottom of the stack the top
    */
    public void flip() {

    }

    /*
    return a new stack that includes the top size items.
    */
    public IntStack subStack(int size) {
			return null;
    }

    /*
    divide every item in the stack by mult
    */
    public void divStack(int mult) {

    }


}
