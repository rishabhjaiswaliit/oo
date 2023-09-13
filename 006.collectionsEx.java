import com.sun.source.tree.Tree;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        Collection<Integer> list = new ArrayList<>();
        // list = new LinkedList<>();
        // list = new Stack<>();
        // list = new Stack<>();
        // Interface obj = new Class1();
        // Interface obj = new Class2();

        //        for (double input = sc.nextDouble(); input != -1; input = sc.nextDouble()) {
        //            list.add(input);
        //        }
        list.add(10);
        list.add(-1);
        list.add(20);
        list.add(20);

        System.out.println("List ArrayList " + list);


        Collection<Integer> s = new LinkedHashSet<>(); // in insertion order (since this is a set, so no duplicate elements)
        s.add(10);
        s.add(-1);
        s.add(20);
        s.add(20);
        System.out.println("Set LinkedHashSet" + s);
        s = new HashSet<>(s); // unordered (no particular order)
        System.out.println("Set HashSet" + s);
        s = new TreeSet<>(s); // always in sorted order aka ascending order
        System.out.println("Set TreeSet" + s);
        for (int c: s) {
            System.out.println(c);
        }


        Map<String, String> map = new HashMap<>(); // HashMap: unordered
        map = new LinkedHashMap<>(); // LinkedHashMap: keys will be in inserted order
        map = new TreeMap<>(); // keys will arranged in sorted order aka ascending order
        map.put("India", "New Delhi");
        map.put("USA", "Washington DC");
        System.out.println(map);
        System.out.println(map.keySet());
        for (String c: map.keySet()) { // .keySet is the extra method you have to use for maps
            System.out.println(c); // KEY
            System.out.println(map.get(c)); // VALUES # python map[c]
        }

//
//        Set<Integer> s = new HashSet<>();
//        s.add(10);
//        s.add(-1);
//        s.add(20);
//        s.add(20);
//        System.out.println("Set HashSet" + s);
//        s = new LinkedHashSet<>(s);
//
//        s = new TreeSet<>(s); // always in sorted order
//        System.out.println("Set TreeSet" + s);

    }
}

// list = []        | List<Integer> list = new ArrayList<>();
// list.append(10)  | list.add(10)
// list[0] = 100    | list.set(0, 100)
// print(list[0])   | System.out.println(list.get(0));

// s = set()        | Collection<Integer> s = new HashSet<>();
// s.add(10)        | s.add(10)
// for c in s:
    // print(c)
// for (int c: s) {
    // System.out.println(c);
//}

// map = dict()
// map['India'] = 'New Delhi'
// map['USA'] = 'Washington DC'

//Map<String, String> = new HashMap<>();
//map.put('India', 'New Delhi');
//map.put('USA', 'Washington DC');
