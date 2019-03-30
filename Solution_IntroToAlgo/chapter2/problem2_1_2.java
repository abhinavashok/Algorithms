public class problem2_1_2{

/*
    Rewrite the INSERTION-SORT procedure to sort into nonincreasing instead of nondecreasing
    order.
*/
public static void sort(int[] input){

    for(int i=1;i<input.length;i++){
        int key = input[i];
        int j = i-1;
        while(j>=0 && input[j]<key){
            input[j+1]=input[j];
            j--;
        }
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