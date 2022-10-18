import java.util.*;

class Mergesort{
	
	void merge_sort(int num[], int left, int mid, int right)
	{
		int size1 = mid - left + 1;
		int size2 = right - mid;

		int L[] = new int[size1];
		int R[] = new int[size2];

		for (int i = 0; i < size1; ++i)
			L[i] = num[left + i];
			
		for (int j = 0; j < size2; ++j)
			R[j] = num[mid + 1 + j];

		int i = 0, j = 0;

		int flag = left;
		while (i < size1 && j < size2) 
		{
			if (L[i] <= R[j]) 
			{
				num[flag] = L[i];
				i++;
			}
			else 
			{
				num[flag] = R[j];
				j++;
			}
			flag++;
		}

		while (i < size1) 
		{
			num[flag] = L[i];
			i++;
			flag++;
		}

		while (j < size2) 
		{
			num[flag] = R[j];
			flag++;
			j++;
		}
	}

	void sort(int num[], int left, int right)
	{
		if (left < right) {
			
			int mid = (left + right) / 2;

			sort(num, left, mid);
			sort(num, mid + 1, right);

			merge_sort(num, left, mid, right);
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

		Merge object = new Merge();
		object.sort(num, 0, num.length - 1);

		System.out.println("\nSorted array");
		for (int i = 0; i < n; ++i)
			System.out.print(num[i] + " ");
		System.out.println();
	}
}


