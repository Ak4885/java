package example;

public class merging_sort
{
	static int i,j,k;
	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40};
		int b[] = {20,10,50};
		
		int c = a.length+b.length;
		
		int d[] = new int[c];
		for(i = 0;i<a.length;i++)
		{
			d[i] = a[i];
		}
		k=i;
		for(j = 0 ; j<b.length;j++)
		{
			d[k] = b[j];
			k++;
		}
		
		for(int i = 0 ;i<d.length;i++)
		{
			for(int j = i+1;j<d.length;j++)
			{
				if(d[i]>d[j])
				{
					int temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		for(int i = 0 ; i<d.length;i++)
		{
			System.out.print(d[i]+" ");
		}
	}
	
}