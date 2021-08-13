package Sorting;

public class BubbleSort 
{
public static void main(String[] args) 
{
int arr[]= {22,23,12,54,61};
int n=arr.length;
int temp;


for(int j=0;j<n-1;j++)
{
	for(int i=0;i<n-j-1;i++)
	{
		if(arr[i]>arr[i+1])
		{
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			}
	}
	
}
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}

}
}
