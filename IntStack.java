public class IntStack {
	public static void main(String[] args) {
		IntStack is = new IntStack();
		System.out.println(is.isEmpty());
		is.push(3);
		is.push(4);
		is.push(5);
         System.out.println(is.size());
		System.out.println(is.isEmpty());
		System.out.println(is.pop());
		System.out.println(is.peek());

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
    String[] arr = new String[stack.size()];
    arr.sort();



    }

    /*
    print the Stack pretty-like
    */
    public void print() {

    }

    /*
    return the item depth distance from the top
    */
    public int peek(int depth) {
			return 0;
    }

    /*
    return multiple items from the top in a new array
    */
    public int[] pop(int multiple) {
			return null;
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
