//Stack Operations Via Link List namely-> Push, Pop, Peek

import java.util.Scanner;

class Stack
{
	static Node head=null;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	void push(int item)
	{
		if(head==null)
		{
			head=new Node(item);
			return;
		}
		
		else
		{
			Node temp;
			temp=head;
			head=new Node(item);
			head.next=temp;
		}
		
	}
	
	int pop()
	{
		if(head==null)
		{

			System.out.println("Underflow condition, Stack is empty");
			return -1;	
		}
		
		else
		{
			Node temp1;
			temp1=head;
			int data=head.data;
			head=head.next;
			temp1.next=null;
			temp1=null;
			return data;
		}
		
	}
	
	int peek()
	{
		if(head==null)
		{

			System.out.println("Stack is empty");
			return -1;
		}
		
		else
		{
			return head.data;
		}
	}
	
  public static void main(String[]args)
  {
	  int choice;
	  do
	  {
	  System.out.println("Enter your choice->/t 1)Push 2) Pop 3) Peek 4) Retrieve 5) Exit");
	  Scanner sc=new Scanner(System.in);
	  
	  choice=sc.nextInt();
	  
	  switch(choice)
	  {
	  case 1: 
		  System.out.println("Enter the element to be inserted");
		  new Stack().push(sc.nextInt());
		  break;
	  
	  case 2:
		  int item=new Stack().pop();
		  System.out.println(item);
		  break;
	  
	  case 3:
		  int data=new Stack().peek();
		  System.out.println(data);
		  break;
	  
	  case 4:
		  System.out.println("Stack is->");
		 
		  Node trav=head;
		  while(trav!=null)
		  {
			  System.out.println(trav.data+" ");
			  trav=trav.next;
		  }
		  
	  case 5:
		  //Exit here
		  break;
		  
		  default:
		  System.out.println("Wrong input, enter a valid one");
	  }
}
		  while(choice!=5);
}
}