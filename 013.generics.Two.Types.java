import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Printer generalPrinter = new Printer("tom", 1234); // GENERAL PRINTER
        generalPrinter.print();
        generalPrinter.content1 = "sam";
        generalPrinter.content2 = "jerry";
        generalPrinter.content2 = 12345;
        generalPrinter.content2 = false;
        generalPrinter.print();

        Printer<String, String> stringPrinter = new Printer<>(); // STRING, STRING PRINTER
        stringPrinter.content1 = "tom";
        stringPrinter.content2 = "jerry";
        stringPrinter.print();
//        stringPrinter.content2 = 12345; // ERROR


        HashMap generalHMap = new HashMap<>(); // GENERAL HASHMAP
        generalHMap.put(1, 1);
        generalHMap.put(2, 4);
        generalHMap.put(3, "jerry");
        System.out.println(generalHMap);

        HashMap<Integer, Integer> numToSquare = new HashMap<>(); // INTEGER, INTEGER HASHMAP
        numToSquare.put(1, 1);
        numToSquare.put(2, 4);
//        numToSquare.put(3, "jerry");
        System.out.println(numToSquare);


    }
}
class Printer <E, T> {
    public E content1;
    public T content2;
    public Printer() {}
    public Printer(E obj1, T obj2) {
        this.content1 = obj1;
        this.content2 = obj2;
    }
    public void print() {
        System.out.println(this.content1);
        System.out.println(this.content2);
    }

}
