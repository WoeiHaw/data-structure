package sorting;

import java.util.Arrays;

public class BubbleSortExercise {
    public static void bubbleSort(int[] nums){

        for(int i = nums.length-1; i>0;i--){
            for(int j = 0 ; j<i;j++){

                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }


        }
    }

    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};
        bubbleSort(myArray);

        System.out.println( Arrays.toString(myArray) );
    }
}
