package Week1.Day2;

import java.util.Arrays;

public class MissingElementsInArray {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		Arrays.sort(arr);	
				// loop through the array (start i from arr[0] till the length of the array)
		for(int i=0; i< arr.length-1;i++)
		{
			if(arr[i]+1!=arr[i+1])
			{
				System.out.println(arr[i]+1);
				break;
			}
		}
	}
			// check if the iterator variable i

}
