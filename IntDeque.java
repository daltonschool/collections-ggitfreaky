public class IntDeque {
  int[] q;
  int head, tail;


    public static void main(String[] args) {
        IntDeque id = new IntDeque(100);
        id.putFirst(3);
        id.putFirst(4);
        id.putFirst(5);
        id.putLast(7);

    }
  public IntDeque(int defaultsize) {
    q = new int[defaultsize];
    head=0;
    tail=1;
  }

  /*
  put the first item
  */
  public void putFirst(int item) {
    q[head--] = item;
  }

  /*
  put the last item
  */
  public void putLast(int item) {
    q[tail++] = item;
  }

  /*
  return the first item
  */
  public int peekFirst() {
    return 0;
  }

  /*
  return the last item
  */
  public int peekLast() {
    return 0;
  }

  /*
  get the first item
  */
  public int getFirst() {
    return q[++head];
  }

  /*
  get the last item
  */
  public int getLast() {
    return 0;
  }

  /*
  move num items from first to last
  */
  public void circ(int num) {

  }

  /*
  return a Stack from this deque
  */
  public IntStack toStack() {
    return null;
  }

  /*
  multiply every two items in the queue together,
  such that the array is half the size
  */
  public void multQueue() {

  }

  /*
  return a Deque which includes only every odd item in this queue
  */
  public IntDeque oddQueue() {
    return null;
  }

  /*
  print the Deque to the screen
  */
  public void print() {

  }

    /*
    add an item to the middle
    */
    public void middle(int i) {

    }

    /* 
    put an item on both sides
    */
    public void putBoth(int i) {
        
    }

    /*
    get an item from both sides
    */
    public int[] getBoth() {
        return null;
    }




}
