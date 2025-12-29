package sorting;

import java.util.Arrays;

public class QuickSortExercise {

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static int pivot(int[] array,int firstIndex, int lastIndex){
        int pivotIndex = firstIndex;
        int swapIndex = pivotIndex;

        for(int i = pivotIndex+1; i<=lastIndex;i++){
            if(array[i] < array[pivotIndex]){
                swapIndex++;
                swap(array,swapIndex,i);
            }
        }
        swap(array,pivotIndex,swapIndex);
        return swapIndex;
    }

    public static void quickSortHelper(int[] array,int firstIndex,int lastIndex){
        if(firstIndex<lastIndex){
            int pivotIndex = pivot(array,firstIndex,lastIndex);
            quickSortHelper(array,firstIndex,pivotIndex-1);
            quickSortHelper(array,pivotIndex+1,lastIndex);
        }

    }

    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length-1);
    }

    public static void main(String[] args) {

//        int[] myArray = {4,6,1,7,3,2,5};
//
//        int returnedIndex = pivot(myArray, 0, 6);
//
//        System.out.println( "Returned Index: " + returnedIndex);
//
//        System.out.println( Arrays.toString( myArray ) );

        int[] myArray = {4,6,1,7,3,2,5};

        quickSort(myArray);

        System.out.println( Arrays.toString( myArray ) );


        /*
            EXPECTED OUTPUT:
            ----------------
            Returned Index: 3
            [2, 1, 3, 4, 6, 7, 5]

         */

    }
}
