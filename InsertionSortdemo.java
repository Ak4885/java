package Sorting;

public class InsertionSortdemo 

{
	static void InsertionSort(int arr[],int n)
	 {
		 int i,j,temp;
		 
		 for(i=1;i<n;i++)
		 {
			 temp=arr[i];
			 j=i-1;
			 
			 while(j>=0&&arr[j]>temp)
			 {
				 arr[j+1]=arr[j];
				 j=j-1;
			 }
			 arr[j+1]=temp;
		 }
	 }
	
	
	
public static void main(String[] args) 

{
	int arr[]= {17,19,16,15,18};
	InsertionSort(arr,5);
	
	for(int i=0;i<5;i++)
	{
		System.out.println(arr[i]);
	}
	
	
	
}
}
