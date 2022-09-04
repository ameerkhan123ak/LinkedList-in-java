package dataStructure;

public class Demo 
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		
		list.insertAtBeginning(0);
		list.insertAtBeginning(1);
		list.insertAtBeginning(2);
		list.display();
		System.out.println();
		list.insertAtPos(0, 5);
		list.display();
		System.out.println();
		list.deleteAtPos(1);
		list.display();
	}
}
