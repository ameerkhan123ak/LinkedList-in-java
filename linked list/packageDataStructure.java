package dataStructure;

public class LinkedList
{
	class Node
	{
		int data;
		Node next;
		
		Node(int val)
		{
			data = val;
			next = null;
		}
	}
	Node head;
	LinkedList()
	{
		head = null;
	}
	
	public void insertAtBeginning(int val)
	{
		Node newNode = new Node(val);
		
		if(head==null)
			head = newNode;
		
		else
		{
			newNode.next = head;
			head = newNode;
		}	
	}
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	public void insertAtPos(int pos,int val)
	{
		if(pos==0)
		{
			insertAtBeginning(val);
			return;
		}
		Node temp = head;
		Node newNode = new Node(val);
		for(int i=1;i<pos;i++)
		{
			temp = temp.next;
			if(head==null)
			{
				throw new IndexOutOfBoundsException("INVALID POSITION");
			}
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	public void deleteAtPos(int pos)
	{
		if(head==null)
		{
			throw new IndexOutOfBoundsException("DELETION ATTEMPTED ON EMPTY LIST");
		}
		if(pos==0)
		{
			head = head.next;
			return;
		}
		Node temp = head;
		Node prev = null;
		
		for(int i=1;i<=pos;i++)
		{
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
	}
}

