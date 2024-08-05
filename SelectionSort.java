import java.util.Arrays;

/**
 * Main
 */
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,7,3,2,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            // find the max item in the remaining array and swap with correct index 
            int last = arr.length-i-1;
            int maxIndext = getMaxIndex(arr,0,last);

            swap(arr, maxIndext, last);

        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;

        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}