import java.util.*;

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

//        String sup = "suspicious";
//        String hi = "hi";
//        System.out.println(sup.equals(hi)); //contents not address
//        System.out.println(sup.indexOf('s')); //returns indeex of first occurence
//        char[] supArray = sup.toCharArray();
//        System.out.println(sup.substring(2, sup.length()-1));
//        System.out.println(sup.contains("ouss"));
//        String spaces = "        me ep       ";
//        System.out.println(spaces);
//        System.out.println(spaces.trim());
//        System.out.println(spaces.replace(" ",""));

        Map<Integer, String> derp = new HashMap<>();
        derp.put(1, "a");
        derp.put(2, "b");
        derp.put(3, "c");
        derp.remove(3);
        System.out.println(derp.get(2));
        String answer = (derp.keySet() + "keyset");
        System.out.println(answer + "answer");
//        System.out.println(derp.toString());
//
//        Map<Integer, String> herp = new HashMap<>();
//        herp.put(1, "a");
//        herp.put(2, "b");
//        System.out.println(derp.equals(herp));
//        herp.replace(2, "q");
//        System.out.println(herp.get(2));


//
//        Integer number = 10;
//        String ten = number.toString();
//        System.out.println(ten);
//        System.out.println(ten.replaceFirst("1", "") + " replaced");
//
//        StringBuilder sb = new StringBuilder("hi");
//        System.out.println(sb);
//        sb.append("ho");
//        System.out.println(sb);
//        sb.deleteCharAt(2);
//        sb.reverse();
//        System.out.println(sb.charAt(0));
//        System.out.println(sb.substring(1, 2));
//
//        StringBuilder num = new StringBuilder("10");
//        int numToInt = (int)num; //can't cast

        Integer.


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


           LinkedList: addFirst, removeFirst, addLast, removeLast, add, remove, get, set, size, contains, pop,
            peek() returns head, peekLast() returns tail, push, pop


            Map: put, remove, get, equals() based on contents, replace, containsKey, containsValue, size, isEmpty, toString, keySet

            Integer: toString, parseInt, max_value, min_value

            StringBuilder: append(""), length, deleteCharAt, delete, reverse, charAt, subString, isEmpty
         */

    }
}

// StringBuilder.