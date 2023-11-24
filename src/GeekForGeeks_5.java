import java.util.LinkedList;
import java.util.Queue;

public class GeekForGeeks_5 {
    public void segregateElements(int arr[], int n) {
        // Your code goes here
        Queue<Integer> positiveElements = new LinkedList<>();
        Queue<Integer> negativeElements = new LinkedList<>();

        for (int element : arr) {
            if (element < 0) negativeElements.add(element);
            else positiveElements.add(element);
        }
        int index = 0;
        while (!positiveElements.isEmpty()) {
            arr[index++] = positiveElements.poll();
        }
        while (!negativeElements.isEmpty()) {
            arr[index++] = negativeElements.poll();
        }
    }

    public static void main(String[] args) {

    }

}
