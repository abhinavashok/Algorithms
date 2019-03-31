public class problem2_1_4{
    /*
    problem :Consider the problem of adding two n-bit binary integers, stored in two n-element
    arrays A and B. The sum of the two integers should be stored in binary form in
    an (n + 1) element array C. State the problem formally and write pseudocode for
    adding the two integers.

    Solution: 
    Already given in problem statement : 
    
    - Two n-bit binary integers.
    Two arrays say A[] and B[] of equal length say n where n>=0.
    - Element at each index: 0 or 1.
    As both the arrays are binary integers so each index of the input array will contain 
    either 1 or 0.

    Now , Law of binary addition :
    for 1 bit binary addition
    1+1 = 0 ,with carry 1
    1+0 = 1, with carry 0
    0+0 = 0, with carry 0

    As in question it is n-bit so we also need to consider carry while adding the bits.
    So for n-bit binary addition we have:

    Expression(Bit1+Bit2+Carry)	 |   Result |	Carry
    ---------------------------------------------------
                1+1+1	         |   1	    |    1
                1+0+1	         |   0	    |    1
                0+0+1	         |   1	    |    0
                0+1+0	         |   1	    |    0
                1+1+0	         |   0	    |    1
                0+0+0	         |   0	    |    0
    ----------------------------------------------------
    In the above table,I have mentioned the case where bit1 is 1 and bit2 is 0 only once as instead of 
    again showing bit1 as 0 and bit2 as 1 because the result remains same.
    
    Approach: 
    Declare an array c[] of size n+1.

    Iterate through the arrays(a[] and b[]) from right to left till we reach 0th index.
    Initialize carry=0 outside the loop.
    consider the above table for evaluating the result as well as carry for each bit.
    Assign the result to c[index] and carry to carry variable.

    After we are done with iteration of the array assign carry to 0th index of c[]
    */
    public static int[] addBinaryNumbers(int[] a,int[] b){
        int[] c = new int[a.length+1];
        int carry =0;
        for(int i=a.length-1;i>=0;i--){
            int bit1 = a[i];
            int bit2 = b[i];
            int j=i+1;
            switch(bit1){
                case 1:
                        switch(bit2){
                            case 1:c[j] = (carry==1)?1:0;
                                    carry =1;
                                    continue;

                            case 0:c[j] =(carry==1)?0:1;
                                    continue;
                            default:System.out.println("Error ! Not a binary number!");
                                    break;

                        }
                        continue;
                case 0:
                        switch(bit2){
                            case 1:c[j] =(carry==1)?0:1;
                                    continue;

                            case 0:c[j] =carry;
                                    carry =0;
                                    continue;
                            default:System.out.println("Error ! Not a binary number!");
                            break;

                        }
                        continue;
                default:System.out.println("Error ! Not a binary number!");
                        break;
            }
        }
        c[0]=carry;
        return c;
    }

    public static void main(String[] args) {
        /*
        101+111 = 1100 which is 5+7 =12
        */
        int[] a = {1,0,1};
        int[] b= {1,1,1};

        int[] c = addBinaryNumbers(a, b);
        for(int i:c){
            System.out.print(i);
        }
    }

}