import java.util.*;

class quicksort{
	
	static void swap(int[] num, int i, int j)
    {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
  
    static int partition(int[] num, int left, int right)
    {
  
        int pivot = num[right];
  
        int i = (left - 1);
  
        for (int j = left; j <= right - 1; j++) {
  
            if (num[j] < pivot) {
  
                i++;
                swap(num, i, j);
            }
        }
        swap(num, i + 1, right);
        return (i + 1);
    }
    
    static void qsort(int[] num, int left, int right)
    {
        if (left < right) {
  
            int pivot = partition(num, left, right);
  
            qsort(num, left, pivot - 1);
            qsort(num, pivot + 1, right);
        }
    }

	
	public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in); 
	    int n = sc.nextInt();
	    
		int num[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    num[i] = sc.nextInt();
		}

		qsort(num, 0, num.length - 1);

		System.out.println("\nSorted array");
		for (int i = 0; i < n; ++i)
			System.out.print(num[i] + " ");
		System.out.println();
	}
}

