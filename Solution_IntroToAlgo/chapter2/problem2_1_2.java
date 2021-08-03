public class problem2_1_2{

/*
    Problem : Rewrite the INSERTION-SORT procedure to sort into nonincreasing instead of nondecreasing
    order.
*/
/**
 * As part of this program its needed to sort the array into nonincreasing order or decreasing order which means
 * from lowest number to highest number.
 * 
 * So for example if we have an array : 5,3,9,6,1
 * then the output should be : 9,6,5,3,1
 * 
 * Above the array is ordered from highest to lowest.
 * 
 * This method takes an integer array as input and then reorders it in decreasing order.
 * 
 * @param input
 */
public static void sort(int[] input){
    //start the loop from second element till the end of the array.
    for(int i=1;i<input.length;i++){
        //store the element at the i'th index as key because we need to shift the element on its left if it is less than the element 
        //at i.Which means we will be overwriting the value at i'th index.
        int key = input[i];
        //as we assume left of key is always sorted so we assign j ,one less than i.We will use this value to find the exact
        //position where the key must be inserted/put so that it makes left array again sorted.
        int j = i-1;
        //iterate and move the elements to right 
        // till either we reach 0th index or till we find an element left of key where key is greater than the element.
        while(j>=0 && input[j]<key){
            input[j+1]=input[j];
            j--;
        }
        //put the key at its place
        input[j+1]=key;
    }
}
    public static void main(String[] args) {
        int[] input ={1,2,3,4,5};
        sort(input);
        for(int i:input){
            System.out.print(i +" ");
        }
    }
}