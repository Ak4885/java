package Sorting;


public class SelectionSort 
{
public static void main(String[] args) 

{
int arr[]= {10,40,20,50,30};
int temp;

for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		
	}
		
}
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}


}
}
