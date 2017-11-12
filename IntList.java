import java.util.ArrayList;
import java.util.Random;

public class IntList {

    public static void main(String[] args) {

        //replaceAll testing code
        IntList ashley = new IntList(20);
        ashley.add(4);
        ashley.add(2);
        ashley.add(5);
        ashley.add(4);
        ashley.add(4);
        ashley.add(7);
        ashley.add(4);
        System.out.println("Should be 5: " + ashley.get(3));
        System.out.println("Should be 4: " + ashley.get(0) + ", " + ashley.get(3) + ", " + ashley.get(4) + ", " + ashley.get(6));
        ashley.replaceAll(ashley, 4, 10);
        System.out.println("Should be 10: " + ashley.get(0) + ", " + ashley.get(3) + ", " + ashley.get(4) + ", " + ashley.get(6));

        //Henry's test code
        IntList mergeThis = new IntList(10);
        mergeThis.add(2);
        mergeThis.add(3);
        mergeThis.add(8);
        mergeThis.add(1);
        mergeThis.add(9);
        mergeThis.add(5);
        mergeThis.add(2);
        mergeThis.add(8);
        mergeThis.add(7);
        mergeThis.add(6);

        sort(mergeThis);
        System.out.print("Should be: 1, 2, 2, 3, 5, 6, 7, 8, 8, 9,   it is: ");
        for (int i = 0; i < mergeThis.size; i++) {
            System.out.print(mergeThis.get(i));
            System.out.print(", ");
        }

    }

    private int[] arr;
    int size = 0;

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
        //creating List of Lists (LoL) to hold all the broken up parts of l
        ArrayList<IntList> listOfLists = new ArrayList<IntList>();
        for(int i=0; i<l.size; i++){
            IntList smallList = new IntList(1);
            smallList.add(l.get(i));
            listOfLists.add(smallList);
        }
        while(listOfLists.size() != 1) {
            ArrayList<IntList> mergedLists = new ArrayList<IntList>();
            if(listOfLists.size()%2 != 0){
                IntList dummy = new IntList(0);
                listOfLists.add(dummy);
            }
            for (int i = 0; i < listOfLists.size(); i += 2) {
                mergedLists.add(merge(listOfLists.get(i), listOfLists.get(i + 1)));
            }
            listOfLists = mergedLists;
        }

        l.arr = listOfLists.get(0).arr; //l is now the
    }
    static IntList merge(IntList l1, IntList l2) {
        int i1 = 0;
        int i2 = 0;

        IntList m = new IntList(l1.size + l2.size + 2);

        while(i1<l1.size && i2<l2.size) {
            if(l1.get(i1) > l2.get(i2)) {
                m.add(l2.get(i2++));
            }
            else {
                m.add(l1.get(i1++));
            }
        }
        while (i1<l1.size) {
         m.add(l1.get(i1++));
        }
        while(i2<l2.size){
            m.add(l2.get(i2++));
        }

        return m;
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
    */
    static void rotate(IntList l) {
        IntList copylist = new IntList(l.size);
        for (int i = 0; i < l.size; i++) {
            copylist.add(l.get(i), i);
        }
        for (int i = 0; i < l.size; i++) {

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
