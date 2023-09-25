import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer n = 125;
        Printer<Integer> printerInteger = new Printer(); // Reason 2 CONSIDERED BAD (Changing DataType in Java is considered "BAD")
        printerInteger.setContent(4096);
        printerInteger.print();
        // ERROR printerInteger.setContent("September 25 2023"); // This line should give us error

        Printer generalPrinter = new Printer(); // GENERAL PRINTER
        generalPrinter.setContent("String");
        generalPrinter.setContent(false);
        generalPrinter.print();

        Printer<String> stringPrinter = new Printer<>(); // STRING PRINTER
        stringPrinter.setContent("November 2023");
        //  stringPrinter.setContent(12345);
        stringPrinter.print();

        ArrayList generalList = new ArrayList(); // GENERAL ARRAYLIST
        generalList.add(10);
        generalList.add("Mark");
        for (Object ele: generalList) {
            System.out.println(ele);
        }
        ArrayList<String> stringList = new ArrayList<>(); // STRING ARRAYLIST
        stringList.add("Mark");
        stringList.add("Alice");
            //        stringList.add(1);

    }
}
class Printer <OBJECT> {
    OBJECT content;
    Printer() {}
    Printer(OBJECT obj) {
        this.content = obj;
    }
    void print() {
        System.out.println(this.content);
    }
    OBJECT getContent() {
        return this.content;
    }
    void setContent(OBJECT content) {
        this.content = content;
    }
}
