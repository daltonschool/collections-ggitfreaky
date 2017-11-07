public class IntDeque {
  int[] q;
  int head, tail;


    public static void main(String[] args) {
        IntDeque id = new IntDeque(100);
        id.putFirst(3);
        id.putFirst(4);
        id.putFirst(5);
        id.putLast(7);
      System.out.println(id.getLast());
      System.out.println(id.getLast());
      System.out.println(id.getFirst());

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
    if(head == 0){
      q[q.length-1]= item;
      head = q.length-2;
    }else{
      q[head--] = item;
    }
  }

  /*
  put the last item
  */
  public void putLast(int item) {
    if (head==tail) resize();
    if (tail == q.length - 1) {
      q[tail] = item;
      tail = 0;

    } else {
      q[tail++] = item;
    }
  }

  /*
  return the first item
  */
  public void resize() {
    int[] big = new int[q.length*2];
    for (int i = 0; i < q.length; i++) {
      big[i] = q[i];
    }
    if (head==tail) {
      int j = big.length - 1;
      for (int i = q.length - 1; i > head; i--) {
        q[i] = big[j];
        j--;
      }
      head = j;
      q = big;
    }
    else System.out.println("You cannot resize a deque unless HEAD and TAIL are at the same spot!");
  }

  /*
  return the first item
  */
  public int peekFirst() {
    return q[head+1];
  }

  /*
  return the last item
  */
  public int peekLast() {
    return q[tail-1];
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

    return q[--tail];
  }

  /*
  move num items from first to last
  TODO: test
  */
  public void circ(int num) {
    for (int i = 0; i < num; i++) {
      putLast(getFirst());
    }
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
