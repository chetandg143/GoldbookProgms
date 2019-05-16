package Myprograms;

public class ArrayDesceding {

	public static int[] main(String[] args)
	{
	int[] arr = {25,15,13,17,19,50,10};
	for(int i=0;i<arr.length-1; i++)
	{
		for(int j=i+1;j<arr.length-1;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp =arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				System.out.println(temp);
		
		}	}
			
	}
	return arr;
  
	}

}
