public class IntDeque {
  int[] q;
  int head, tail;


    public static void main(String[] args) {
        IntDeque id = new IntDeque(100);
        id.putFirst(3);
        id.putFirst(4);
        id.putFirst(5);
        id.putLast(7);
        id.print();

     // System.out.println(id.getLast());
      //System.out.println(id.getLast());
      //System.out.println(id.getFirst());

      //testing circ
      id.print();
      id.circ(2);
      id.print();


      id.putLast(8);
      id.putLast(9);
      id.putLast(10);
      System.out.println(id.getLast());
      System.out.println(id.getLast());
      System.out.println(id.getFirst());

      //peekFirst testing code
      IntDeque ashley = new IntDeque(10);
      ashley.putFirst(2);
      ashley.putFirst(3);
      ashley.putFirst(4);
      ashley.putLast(5);
      ashley.putLast(6);
      System.out.println("Peek First should be four: " + ashley.peekFirst());

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
    if(head == tail) resize();
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
    q[tail++] = item;
    if(tail == q.length) {
      tail = 0;
    }
    if (head==tail) resize();
  }

  /*
  double the size of the array
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
    if(head == q.length-1) return q[0];
    else return q[head+1];
  }

  /*
  return the last item
  */
  public int peekLast() {
      if (tail == q.length - 1) return q[1];
        else {
          return q[tail-1];
      }
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
    System.out.print("HEAD > ");
    int i = (head+1)%q.length;

    while(i!=tail) {
      System.out.print( q[i++] + " > ");
      if(i==q.length) i = 0;
    }
    System.out.println( "TAIL");
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
