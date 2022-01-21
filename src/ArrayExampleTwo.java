import java.util.Arrays;

public class ArrayExampleTwo {

    static void printOrder(int[] arr, int n) {
        // sorting the array
        Arrays.sort(arr);

        // printing first half in ascending
        // order


        // printing second half in descending
        // order
        for (int j = n - 1; j >= n / 2; j--)
            System.out.print(arr[j] + " ");

        for (int i = 0; i < n / 2; i++)
            System.out.print(arr[i] + " ");


    }

    public static void main(String[] args) {
        int[] arr = { 1,3,2,5,9,4 };
        int n = arr.length;
        printOrder(arr, n);
    }
}


