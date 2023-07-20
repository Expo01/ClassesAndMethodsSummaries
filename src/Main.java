import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] setLengthUnknownValues = new int[3];
        setLengthUnknownValues[0] = 1;
        setLengthUnknownValues[2] = 6;
        setLengthUnknownValues[1] = 4; // etc.

        int[] setLengthKnownValues = {1,4,6};
        int[] duplicate = setLengthKnownValues;
        System.out.println(setLengthKnownValues.equals(duplicate)); // instance .equals method checks for memory address
        // equivalency where this yields true
        System.out.println(setLengthKnownValues.equals(setLengthUnknownValues)); // this yields false

        System.out.println(Arrays.equals(setLengthKnownValues,setLengthUnknownValues)); // static method from Arrays
        // class compares contents, not memory address, so this is true
        setLengthUnknownValues[0] = 10;
        System.out.println(Arrays.equals(setLengthKnownValues,setLengthUnknownValues)); // this is false

        System.out.println();
        String mem = setLengthKnownValues.toString(); // memory address through instance method
        System.out.println(mem);
        String s = Arrays.toString(setLengthKnownValues); // static method actually yields string
        System.out.println(s); // [1, 4, 6] is the result
        System.out.println(s.charAt(2)); // string includes brackets, spaces, etc. this will printt a comma
        System.out.println(setLengthKnownValues.length); // this instance methods gives number of elements, not indexes
        Integer.


        /*
        array: .equals(), .toString(), .length --> instance methods
        Arrays: .equals(a,b), .toString() --> static methods
               sort, binarySearch, copyOf

        String: charAt, length, equals, indexOf, toLowerCase, toUpperCase, toCharArray, replace, substing, contact,
        isEmpty, contains, compareTo, trim

         */
    }
}
// array
// String
// ArrayList
// Map
// LinkedList
// List
// Binary tree
/// Integer