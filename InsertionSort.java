import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    private static Integer[] insertionSort(Integer[] array){

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i-1;
            while (j>=0 && array[j]>key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        
        return array;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = read.nextInt();
        System.out.println("Enter the elements:");
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = read.nextInt();
        }
        System.out.println(Arrays.deepToString(insertionSort(array)));
    }
}
