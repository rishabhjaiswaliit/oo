import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        print(intList);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.0);
        doubleList.add(2.0);
        print(doubleList);

//        List<String> stringList = new ArrayList<>();
//        stringList.add("Ram");
//        print(stringList); // LET's say we doont want stringList to be accessed by print() functio // solution is Bounded Wildcard
    }

    // This Bounded wildcard will restrict Lists of datatypes which are subclasses of Number 
    // Ex: It will allow List<Number>, List<Integer>, List<Double> 
    static void print(List<? extends Number> obj) {
        System.out.println(obj);
    }
}

