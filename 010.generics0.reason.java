import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer n = 125;
        Printer printerInteger = new Printer(); // Reason 2 CONSIDERED BAD (Changing DataType in Java is considered "BAD")
        printerInteger.setContent(n);
        printerInteger.print();
        printerInteger.setContent("September 25 2023");
        printerInteger.print();

        Printer printerString = new Printer();
        printerString.setContent("String");
        printerString.setContent(false);
        printerString.print();
        // String s = printerString.getContent(); // Reason 1 CONSIDERED BAD

        // Generics will help us keep the dataType general but CONSTANT throughout the life of 1 variable
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(n);
        // listOfIntegers.add("String"); // Having this error is considered "GOOD" in JAVA // we want listOfIntegers to always have Integer in it.
    }
}
class Printer {
    Object content;
    Printer() {}
    Printer(Object obj) {
        this.content = obj;
    }
    void print() {
        System.out.println(this.content);
    }
    Object getContent() {
        return this.content;
    }
    void setContent(Object content) {
        this.content = content;
    }
}
