import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    private static Integer[] bubbleSort(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = read.nextInt();
        read.nextLine();
        System.out.println("Enter the elements:");
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = read.nextInt();
        }
        System.out.println(Arrays.deepToString(bubbleSort(array)));
    }

}
