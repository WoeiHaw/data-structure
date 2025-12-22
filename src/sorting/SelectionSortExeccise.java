package sorting;

import java.util.Arrays;

public class SelectionSortExeccise {

    public static void selectionSort(int[] array){
        for(int i = 0 ; i<array.length;i++){
            int minIndex = i;
            for(int j = i+1; j<array.length;j++){
                if(array[minIndex]>array[j]){
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        selectionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }
}
