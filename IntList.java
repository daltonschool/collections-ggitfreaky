import java.util.Random;

public class IntList {
    private int[] arr;
    int size = 0;

    public static void main(String[] args){
        //rotate Code
        System.out.println("Rotate");
        IntList reverse = new IntList(4);
        reverse.add(1);
        reverse.add(2);
        reverse.add(3);
        reverse.add(4);
        reverse.rotate();
        System.out.println(reverse.get(0));
    }

    public IntList(int default_size) {
      arr = new int[default_size];
    }

    int get(int index) {
      return arr[index];
    }

    void set(int index, int element) {
      arr[index] = element;
    }

    void add(int element) {
      arr[size++] = element;
      if(size==arr.length) resize();
    }

    void add(int index, int element) {
      for(int i = size; i>index; i--) {
        arr[i] = arr[i-1];
      }

      arr[index] = element;

      size++;
      if(size==arr.length) resize();

    }

    void remove(int index) {
      for(int i = index; i<size; i++) {
        arr[i] = arr[i+1];
      }
        //resize here. Ask before tho. But probs
      size--;
    }

    void resize() {

    }

    /*
    sort — sorts a List using a merge sort algorithm, which provides a fast, stable sort. (A stable sort is one that does not reorder equal elements.)
    */
    static void sort(IntList l) {

    }

    /*
    shuffle — randomly permutes the elements in a List.
    */
    static void shuffle(IntList l) {
        Random gen = new Random();
        IntList dumbyList = new IntList(l.size);
        int x;
        int spot;
        for(int i = 0; i<l.size; i++){
            spot = gen.nextInt(l.size);
            x = l.arr[spot];
            l.remove(spot);
            dumbyList.add(x);
        }
        copy(dumbyList, l);
    }

    /*
    reverse — reverses the order of the elements in a List.
    */
    static void reverse(IntList l) {

    }

    /*
    rotate — rotates all the elements in a List by a specified distance.
    shifts it one to the right
    */
     void rotate() {
        int[] copylist = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            copylist[i] = this.get(i);
        }
         for (int i = 0; i < copylist.length; i++) {
             if (i == this.size-1) arr[0] = copylist[i];
             else {
                 arr[i] = copylist[i + 1];
             }
         }
    }

    /*
    swap — swaps the elements at specified positions in a List.
    */
    static void swap(IntList l, int i, int j) {

    }

    /*
    replaceAll — replaces all occurrences of one specified value with another.
    */
    static void replaceAll(IntList l, int find, int rep) {
        for (int i = 0; i < l.size; i++) {
            if(l.get(i) == find){
                l.set(i, rep);
            }
        }
    }

    /*
    fill — overwrites every element in a List with the specified value.

        iterate through
        replace everything
    */
    static void fill(IntList l, int rep) {
        for(int i = 0; i < l.size; i ++){
            l.remove(i);
            l.add(i, rep);
        }
    }

    /*
    copy — copies the source List into the destination List.
    */
    static void copy(IntList l1, IntList l2) {
        for(int i = 0; i < l1.size; i ++){
            l2.add(i);
            l1.remove(i);
        }
    }
    }

    /*
    search — searches for an element in an List.
    */
    static boolean search(IntList l, int i) {
        return false;
    }

    /*
    indexOfSubList — returns the index of the first sublist of one List that is equal to another.
    */
    static int indexOfSubList(IntList l, IntList sublist) {
        return 0;
    }

    /*
    lastIndexOfSubList — returns the index of the last sublist of one List that is equal to another.
    */
    static int lastIndexOfSubList(IntList l, IntList sublist) {
        return 0;
    }

    /*
    difference returns a list of all items that are in only one of the two lists (XOR)
    */
    static IntList difference(IntList l1, IntList l2) {
        return null;
    }

		/*
		return a new list with only the odd items
		*/
		static IntList oddList(IntList l) {
			return null;
		}

		/* 
		returns true if all items in i are in list l
		*/
		static boolean search(IntList l, int[] i) {
			return false;
		}

}
