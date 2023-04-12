import java.util.*;

public class nsel {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 6, 1, 4 };
        int[] result = nextSmallerElement(arr);
        System.out.println(Arrays.toString(result)); 
    }

    public static int[] nextSmallerElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!stack.empty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.empty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }
}
