import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {9, 8, -1, 7};
        Arrays.sort(arr, new CompareReverse());
    }
}

class CompareReverse implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}
