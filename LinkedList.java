package LinkedList;

class Node
{
	int data;
	Node link;
	
	Node()
	{
		data=0;
		link=null;
	}
	
	public Node(int d, Node n) 
	{
		data=d;
		link=n;
		
	}
	void setdata(int d)
	{
		data=d;
	}
	void setlink(Node n)
	{
		link=n;
	}
	 int getdata()
	{
		return data;
	}
	 
	 Node getlink()
	 {
		 return link;
	 }
	
	}

     class LinkedList{

     Node start;
     Node end;
     int size;
     Node current;


   LinkedList()
   {
	start=null;
	end=null;
	size=0;
   }
   int getsize()
   {
	return size;
   }

    void addatstart(int val)

    {
	Node nptr=new Node (val,null);
	size++;
	if(start==null)
	{
		start=nptr;
		end=start;
		
	}
	else 
	{
	 nptr.setlink(start);
	 start=nptr;
		
	}
    }
    void addatend(int val)
	{
		Node nptr=new Node(val,null);
		size++;
		if(start==null)
		{
			start=nptr;
			end=start;
		}
		else
		{
			end.setlink(nptr);
			end=nptr;
		}
	}
    
     void removeFirst()
    {
        if(start == null)
        {
        	System.out.println("empty list");
        }
        
       start=start.getlink();
       return;
    }
      
       
    void removelast()
             {
    	
             Node s = start;
             Node t = start;
             while (s != end) 
             {
                 t = s;
                 s = s.getlink();
             }
             end = t;
             end.setlink(null);
             size--;
             return;
         }
        
          public void display()
         { 
    	 System.out.print(" Linked List = ");
         if (size == 0) {
             System.out.print("empty");
             return;
         }
     
        if (start.getlink() ==null) 
         {
        	 
             System.out.println(start.getdata());
             return;
             
         } 
         Node ptr = start;
         System.out.print(start.getdata() + "->");
         ptr = start.getlink();
         while (ptr.getlink() != null) {
             System.out.print(ptr.getdata() + "->");
             ptr = ptr.getlink();
         }
         System.out.println(ptr.getdata() + "  ");
     }
     

public static void main(String[] args) 
{
LinkedList ls=new LinkedList();
ls.addatend(10);
ls.addatend(20);
ls.addatend(30);
ls.addatstart(40);
ls.addatstart(50);
System.out.println("After inserting values");
ls.display();
System.out.println("After deleting first element");
ls.removeFirst();
ls.display();
System.out.println("After deleting last element");
ls.removelast();
ls.display();
}
}
