package example;

import java.util.Scanner;

public class reverse_integer

{
public static void main(String args[])

{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int no=sc.nextInt();
int reverse=0;

while(no!=0)
{
	reverse=reverse*10 +no%10;
	no=no/10;
	
			
}
System.out.println("reverse number is "+reverse);
}
}