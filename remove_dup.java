package example;
import java.util.*;


public class remove_dup 
{
public static void main(String[] args)
{
int arr[]= {5,3,3,2,4,7,5};

int temp;
int a,b = 0;
int len=arr.length;


for (int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			}
	}
}
		
	
	
	for( a=0;a<arr.length-1;a++)
	{
		if(arr[a]!=arr[a+1])
		{
			
			arr[b++]=arr[a];
			
		}
	
	}
	arr[b++]=arr[arr.length-1];
	
	
	
	for(int i=0;i<b;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
}
}

