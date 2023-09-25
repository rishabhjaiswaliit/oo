import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        print("String");
//        print(false);
        print(12345);
        print(12.3);
//        print(new Object());
    }

    static <T extends Number> void print(T obj) {
        System.out.println(obj);
    }
}

