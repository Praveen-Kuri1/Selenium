package arraystest;

public class array1 
{
	public static void main(String[] args) 
	{
		int[] arr =new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println("the array of arr[1] is: "+arr[1]);
		
		int[] arr2 = {100,200,300,400,400};
		System.out.println("the array of arr2[1] is: "+arr2[1]);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]); 
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]); 
		}
		String[] arr3= {"Praveen","Kuri","Selenium"};
		
		for(int i=0; i<arr3.length;i++)
		{
			System.out.println("The arr3 of string is:"+arr3[i]);
			
		}
		System.out.println("The arr of string is:"+arr3[0]);
	}

}
