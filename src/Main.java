import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //ARRAY
//        int[] setLengthUnknownValues = new int[3];
//        setLengthUnknownValues[0] = 1;
//        setLengthUnknownValues[2] = 6;
//        setLengthUnknownValues[1] = 4; // etc.
//
//        int[] setLengthKnownValues = {1,4,6};
//        int[] duplicate = setLengthKnownValues;
//        System.out.println(setLengthKnownValues.equals(duplicate)); // instance .equals method checks for memory address
//        // equivalency where this yields true
//        System.out.println(setLengthKnownValues.equals(setLengthUnknownValues)); // this yields false
//
//        System.out.println(Arrays.equals(setLengthKnownValues,setLengthUnknownValues)); // static method from Arrays
//        // class compares contents, not memory address, so this is true
//        setLengthUnknownValues[0] = 10;
//        System.out.println(Arrays.equals(setLengthKnownValues,setLengthUnknownValues)); // this is false
//
        //STRING
//        System.out.println();
//        String mem = setLengthKnownValues.toString(); // memory address through instance method
//        System.out.println(mem);
//        String s = Arrays.toString(setLengthKnownValues); // static method actually yields string
//        System.out.println(s); // [1, 4, 6] is the result
//        System.out.println(s.charAt(2)); // string includes brackets, spaces, etc. this will printt a comma
//        System.out.println(setLengthKnownValues.length); // this instance methods gives number of elements, not indexes
//

//        ArrayList<Integer> ALTest = new ArrayList<>();
//        ALTest.add(2);
//        ALTest.add(4);
//        ALTest.add(6);
//        ALTest.remove(2);
//        System.out.println(ALTest.get(0) + " get()");
//        ALTest.set(1,5);
//        Object[] converted = ALTest.toArray();
//        System.out.println(Arrays.toString(converted) + " to array");
//        ALTest.add(7);
//        ALTest.add(9);
//        System.out.println(ALTest.subList(2,4));
//        System.out.println(ALTest.toString() + " to string"); // unlike an array, this instance method returns contents, not memory address
//
//        ArrayList<Integer> same = new ArrayList<>();
//        same.add(2);
//        same.add(5);
//        same.add(7);
//        same.add(9);
//        System.out.println(ALTest.equals(same)); // unlike array instance method, this compares contents not address
//        String sameString = same.toString();
//        System.out.println(sameString.charAt(0)); // '['
//
//        System.out.println(sameString.replace(',','*'));
        String sup = "suspicious";
        String hi = "hi";
        System.out.println(sup.equals(hi)); //contents not address
        System.out.println(sup.indexOf('s')); //returns indeex of first occurence
        char[] supArray = sup.toCharArray();
        System.out.println(sup.substring(2, sup.length()-1));
        System.out.println(sup.contains("ouss"));
        String spaces = "        me ep       ";
        System.out.println(spaces);
        System.out.println(spaces.trim());
        System.out.println(spaces.replace(" ",""));

        /*
        array: .equals(), .toString(), .length --> instance methods
        Arrays: .equals(a,b), .toString() --> static methods
               sort, binarySearch, copyOf

        ArrayList: add(Integer), add(index,Integer), remove(index), remove(object), contains(object), get(index),indexOf(object),
               set(index,element) isEmpty, size, equals(object), clear, sublist(sIndex,eIndex) end index non-inclusive,
                toString,toArray,

                 sort, iterator,??? not sure how to use these

        String: charAt(index), replace('char', 'char'), length, equals, indexOf, toLowerCase, toUpperCase, toCharArray,
            substring(sIndex,eIndex) non inclusive end index, isEmpty, contains("stuff"), compareTo, trim, replace(char,char)
            orr "" for removal without replace

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
// StringBuildr