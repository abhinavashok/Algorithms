
class InsertionSort{
	public void swap(int[] a,int i,int j){
		int temp = a[i];
		a[i] = a[j];
		a[j]= temp;
	}
	
	public void sort(int[] a){
		for(int i=1;i<a.length;i++){
			int j=i-1;
		for(;j>=0 && a[j]>a[i];j--);
		swap(a, i, j);	
		}	
		
	}

	public static void main(String[] args) {
		int[] a={5,4,3,2,1};
		new InsertionSort().sort(a);

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
}
