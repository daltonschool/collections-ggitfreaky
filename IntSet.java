import java.util.ArrayList;

public class IntSet {
	public static void main(String[] args) {
        IntSet devin = new IntSet(100);

        System.out.println(devin.contains(30));
        devin.add(30);
        System.out.println(devin.contains(30));



        //ContainsAll Test Code
        IntSet kenny = new IntSet(100);
        IntSet david = new IntSet(100);
        IntSet franzese = new IntSet(100);
        kenny.add(1);
        kenny.add(11);
        kenny.add(21);
        kenny.add(31);
        franzese.add(1);
        franzese.add(11);
        david.add(22);
        System.out.println(kenny.containsAll(franzese));
        System.out.println(kenny.containsAll(david));



        //retainAll test code
        IntSet isha1 = new IntSet(10);
        isha1.add(1);
        isha1.add(2);
        isha1.add(3);
        isha1.add(4);
        IntSet isha2 = new IntSet(10);
        isha2.add(1);
        isha2.add(3);
        isha2.add(5);
        isha2.add(7);
        isha1.retainAll(isha2);
        isha1.print();




    }

	boolean[] arr;
	
	public IntSet(int size) {
		arr = new boolean[size];
	}

	void add(int i) {
		arr[i] = true;
	}

	void remove(int i) {
		arr[i] = false;
	}

	boolean contains(int i) {
		return arr[i];
	}

	//BULK FUNCTIONS:

    /*
    returns true if s is a subset of set
    */
    boolean containsAll(IntSet s) {
        for (int i = 0; i < s.arr.length; i++) {
            if(s.contains(i) && !this.contains(i)){
                return false;
            }

        }
        return true;
    }

    /*
    add all items in set s to this set.
    */
    void addAll(IntSet s) {
        for (int i = 0; i < arr.length; i++) {
            if(s.contains(i)) this.add(i);

        }

    }

    /*
    remove all items from this set that are not in set s (intersection)
    TODO:
    */
    void retainAll(IntSet s) {
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!(s.contains(i))) {
                arr[i]=false;
            }
        }
    }
    /*
    remove all items in s from this set
    */
    void removeAll(IntSet s) {
        for(int i= 0; i< arr.length; i ++){
            if (s.contains(i)) this.remove(i);
            }
        }


    /*
    increment every number in the set by 1
    */
    void incrementAll(IntSet s) {
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i-1] == true)  arr[i] = true;
            else arr[i] = false;
        }
        arr[0] = false;
        if (arr[arr.length-1]){
            boolean[] newArr = new boolean[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[newArr.length-1] = true;
            arr = newArr;
        }
    }

    /*
      for any number in set s that is in this set, multiply this set by multiplier
    */
    void multiplyAll(IntSet s, int multiplier) {

    }

    /*
    does the set contain all of the prime factors of number
    */
    boolean containsPrimeFactors(int number) {
    	return false;
    }

    /*
    all the subsets that can be generated of subSetSize size
    */
    IntSet[] subSets(int subSetSize) {
    	return null;
    }

    /*
    the subSetSize largest items
    */
    IntSet maxSubSet(int subSetSize) {
    	return null;
    }

    /*
    return an array of two sets,
    the set of numbers above divide, and those below
    */
    IntSet[] discrete(int divide) {
    	return null;
    }

    /*
    finds this intersection of this and all sets in the array
    */
    boolean containsAll(IntSet[] s) {
    	return false;
    }

    /*
    print the set pretty like.
    */
    void print() {

    }

		/*
		finds the gcd of the set
		*/
		int gcd() {
			return 0;
		}

		/*
		finds the mean of the set
		*/
		int mean() {
			return 0;
		}

		/*
		returns a set with only the bottom n items in the set
		*/
		IntSet bottom(int n) {
            return null;
		}

}

