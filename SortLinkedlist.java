package demo;

public class SortLinkedlist
{
	node head;
	node sorted;

	class node
	{
		int val;
		node next;

		public node(int val)
		{
			this.val = val;
		}
	}

	void addNode(int val)
	{
		
		node newnode = new node(val);
		newnode.next = head;
	    head = newnode;
	}

	void insertionSort(node headref)
	{
		
		sorted = null;
		node current = headref;
		
		
		while (current != null)
		{
			node next = current.next;
			sortedInsert(current);
			current = next;
		}
		
		head = sorted;
	}

	
	void sortedInsert(node newnode)
	{
		if (sorted == null || sorted.val >= newnode.val)
		{
			newnode.next = sorted;
			sorted = newnode;
		}
		else
		{
			node current = sorted;
			
			while (current.next != null && current.next.val < newnode.val)
			{
				current = current.next;
			}
			
			newnode.next = current.next;
			current.next = newnode;
		}
	}

	
	void display (node head)
	{
		while (head != null)
		{
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
	
	public static void main(String[] args)
	{
		SortLinkedlist list = new SortLinkedlist();
		
		list.addNode(15);
		list.addNode(12);
		list.addNode(19);
		list.addNode(10);
		list.display(list.head);
		System.out.println();
		list.insertionSort(list.head);
		list.display(list.head);
	}
}
