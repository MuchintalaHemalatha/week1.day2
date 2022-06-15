package week1.day2;

public class FindInterSection {

	public static void main(String[] args) {

		// a) Declare An array for {3,2,11,4,6,7};	
		int[] arr1= {3,2,11,4,6,7};
		// b) Declare another array for {1,2,8,4,9,7};
		int[] arr2={1,2,8,4,9,7};
		//length of array1
		int length1 = arr1.length;
		int length2 = arr2.length;

		// c) Declare for loop iterator from 0 to array length
		for(int i=0;i<length1;i++)
		{

			// d) Declare a nested for another array from 0 to array length
			for(int j=0;j<length2;j++)
			{
				//e) Compare Both the arrays using a condition statement
				if(arr1[i]==arr2[j])

					System.out.println(arr1[i]);

				// f) Print the first array (should match item in both arrays)

			}

		}
	}
}
