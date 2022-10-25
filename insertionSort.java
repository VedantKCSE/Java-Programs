
public class InsertionSort {
	void sort(int array[])
	{
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array [j]> key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	static void printArr(int array[])
	{
		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(array[i] + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		int array[] = { 34,45,2,35,99 };

		InsertionSort ob = new InsertionSort();
		ob.sort(array);

		printArr(array);
	}
};


/* This code is contributed by Shubham Kumar. */
