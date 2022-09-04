package quicksortalgo;
import java.util.Scanner; 
import java.util.Random; 
import java.util.Arrays; 

public class quicksortcomplexity {

	static Scanner scan = new Scanner(System.in); 
	static final int MAX = 10000;
	static int n ; 
	static  int  a[]=new int [MAX];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random= new  Random();
		System.out.println("enter the size of the array"); 
		n=scan.nextInt(); 
		for(int i=0 ; i<n;i++)
			a[i]=random.nextInt(1000); 
		a= Arrays.copyOf(a,n);
		System.out.println("the array elements are"); 
		for(int i=0; i<n;i++)
			System.out.println(a[i]+" "); 
		
	      long  starttime=System.nanoTime(); 
		QuickSortAlgorithm(0,n-1); 
		long stoptime =System.nanoTime();
		long time= stoptime-starttime; 
		System.out.println("time elapsed "+(double)time/1000000); 
		System.out.println("arrray elements after sorted is "); 
		for(int i=0; i<n;i++)
			System.out.println(a[i]+" "); 
		
		
	}
		
		
		public static void QuickSortAlgorithm(int p, int r) 
		{
			
			int i, j, temp, pivot;
		
			if (p < r) 
		
		{
			i = p;
			j = r + 1;
			pivot = a[p]; // mark first element as pivot
			while (true) 
			{
			i++;
			while (a[i] < pivot && i < r)
			i++;
			j--;
			while (a[j] > pivot)
			j--;
			if (i < j) 
			{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			} 
			else
			break; // partition is over
			}
			a[p] = a[j];
			a[j] = pivot;
			QuickSortAlgorithm(p, j - 1);
			QuickSortAlgorithm(j + 1, r);
			
		

	}

}

	}
