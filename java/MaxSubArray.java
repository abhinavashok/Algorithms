class MaxSubArray{

    static int[] findCrossOverMaxArray(int[] in,int low,int high, int mid){

        int leftMax = Integer.MIN_VALUE;
        int leftLow = Integer.MIN_VALUE;

        int sum =0;
       
        for(int i=mid;i>=0;i--){
            sum=sum+in[i];
            if(sum>leftMax){
                leftMax=sum;
                leftLow=i;
            }
        }

        sum=0;

        int rightMax =Integer.MIN_VALUE;
        int rightHigh = Integer.MIN_VALUE;

        for(int j=mid+1;j<in.length;j++){
            sum+=in[j];
            if(sum>rightMax){
                rightMax = sum;
                rightHigh = j;
            }
        }
        int out[] = new int[]{leftLow,rightHigh,leftMax+rightMax};
        return out;
    }

    static int[] max(int[] left,int[] right , int[] cross){
        if(left[2]>right[2] && left[2]>cross[2]){
            return left;
        }else if(right[2]>left[2] && right[2]>cross[2]){
            return right;
        }
       return cross;
    
    }

    static int[] findMaxSubArray(int[] in, int low,int high){
        if(low == high){
            return new int[]{low,high,in[low]};
        }else{
            int mid = (low+high)/2;
            int[] leftSubArraymax = findMaxSubArray(in,low,mid);
            int[] rightSubArrayMax =  findMaxSubArray(in,mid+1,high);
            int[] crossOvrMax = findCrossOverMaxArray(in,low,high,mid);
            return max(leftSubArraymax,rightSubArrayMax,crossOvrMax);
        }
    }

    public static void main(String[] args){
        int[] input =new int[]{10,-1,2,5,-6};
        int[] result =findMaxSubArray(input,0,input.length-1);
        System.out.println("low :"+result[0]+" ,hight :"+result[1]+", maxsum="+result[2]);

    }


}