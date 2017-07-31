import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by smeleyka on 31.07.17.
 */
public class Main {
    static int a;
    static int b;
    static int min;
    static int count = 0;

    public static void main(String[] args) throws Exception {

        Math

        int arr[] = new int[20];
        File file = new File("src/data.txt");
        Scanner sc = new Scanner(file);

        int i = 0;
        while (sc.hasNext()) {
            arr[i] = Integer.parseInt(sc.next());
            i++;
        }

        int min = arr[0];
        for (int e = 0; e < arr.length; e++) {
            for (int j = 1; j < arr.length; j++) {
                count++;
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j);
                }
                if (min > arr[j]) {
                    min = arr[j];
                    e = j;
                }
                System.out.println(count + " " + Arrays.toString(arr));
            }
            arr[e] = min;
        }


    }

    public static void swap(int[] a, int i) {
        int x = a[i - 1];
        a[i - 1] = a[i];
        a[i] = x;
    }

}
