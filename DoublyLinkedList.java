package DoublyLinkedList;

 class Link
{
Link prev;
int data;
Link next;

  Link(int data)
{
	this.data=data;
	prev=null;
	next=null;
}

  Link(Link prev,int data,Link next)
{
	this.prev=prev;
	this.next=next;
	this.data=data;
}


}
public class DoublyLinkedList 
{
Link head;
int size;

DoublyLinkedList()
{
	head=null;
	size=0;
}

boolean isEmpty() 
{
	return head==null;
	
}

void addFirst(int data)
{
	if(head==null)
	{
		head =new Link(null,data,null);
		
	}
	else
	{
		Link newlink=new Link(null,data,head);
		head.prev=newlink ;
		head=newlink;
		
	}
	size++;
}

void addLast(int data)
{
	if(head==null) 
	{
	head =new Link(null,data,null);
		
	}
	else
	{
	Link current=head;
	while(current.next!=null)
	{
		current=current.next;
		
    }
	Link newlink= new Link(current,data,null);
	current.next=newlink;
	
	}
	size++;
	
	
}
void InsertAtIndex(int index, int data)
{
	if(head==null) return;
	
	if(index<1||index>size) return;
	
	Link current=head;
	
	int i=1;
	while( i <index)
	{
		current=current.next;
		i++;
	}
	
	if(current.prev==null)
	{
		Link newlink=new Link(null,data,current);
		current.prev=newlink;
		head=newlink;
	}
	else
	{
		Link newlink=new Link(current.prev,data,current);
		current.prev.next=newlink;
		current.prev=newlink;
	}
	size++;
}
	void RemoveAtIndex(int index)
{
	if(head==null) return;
	
	if(index<1||index>size)  return;
	
	Link current=head;
	
	int i=1;
	
	while(i<index)
	{
	   current=current.next;
	   i++;
	}
	
	
	if(current.next==null)
	{
		current.prev.next=null;
		
	}
	
	if(current.prev==null)
	{
		current.next=current;
		current.prev=null;
		head=current;
	}
	
	else
	{
	current.prev.next=current.next;
	current.next.prev=current.prev;
	
	}
	size--;
}

void removeFirst()
{
	if(head==null)  return;
	
	
	head=head.next;
	head.prev=null;
	size--;
}

void removeLast()
   {
	
	if(head==null) return;
	
	if(head.next==null)
	{
		head=null;
	}
	Link current =head;
	while(current.next.next!=null)
	{
		current=current.next;
	}
	current.next=null;
	size--;
   }

  void display()
{
	Link current=head;
	while(current!=null)
	{
		System.out.println(current.data);
		current=current.next;
	}
}

int size()
{
	return size;
}

public static void main(String[] args)
{
	DoublyLinkedList dll=new DoublyLinkedList();
	dll.addFirst(11);
	dll.addFirst(22);
	dll.addFirst(33);
        dll.addLast(44);
	dll.addLast(55);
	dll.removeFirst();
	dll.removeLast();
	dll.display();
	System.out.println("--------------");
	dll.InsertAtIndex(2,200);
	dll.InsertAtIndex(4,400);
	dll.display();
	System.out.println("--------------");
	dll.RemoveAtIndex(2);
	dll.display();
}
}
