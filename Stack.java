package Stack;

import java.util.*;

public class Stack 
{
	private Node top;
	private int size;
	
	private class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
		this.data=data;
		this.next=next;
		}
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public void push(int data)
	{
		Node newnode=new Node(data);
		newnode.next=top;
		top=newnode;
		size++;
	}
	
	public int pop()
	{
		if(top==null) 
		{
			System.out.println("Empty Stack");
			return size;
		}
			
		int result=top.data;
		top=top.next;
		size--;
		return result;
	}
	
	public int peek()
	{
		if(top==null) 
		{
			System.out.println("Empty Stack");
			return size;
		}

		return top.data;
	}
	
	public void display()
	{
		if(top==null)  return ;
		Node current=top;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
		
		
	}
		
public static void main(String[] args) 
{
	Stack st=new Stack();
	st.pop();
	st.peek();
	System.out.println(st.size);
	st.push(10);
	st.push(20);
	st.push(30);
	System.out.println(st.size);
	st.display();
	System.out.println("-----------");
	st.pop();
	st.display();
	System.out.println("-----------");
	st.peek();
	st.display();
	st.isEmpty();
	
}
}
