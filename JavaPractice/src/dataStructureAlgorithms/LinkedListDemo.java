package dataStructureAlgorithms;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		list.insertAtHead(2);
		list.insertAtHead(4);
		list.insertAtHead(6);
		list.insertAtHead(8);
		list.insertAtHead(10);
		list.insertAtHead(12);
		
		list.deleteAtHead();
		
//		System.out.println(list);
//		System.out.println("Length : "+ list.length());
		
		System.out.println("Found : "+list.find(12));
		
		
		

	}

}
