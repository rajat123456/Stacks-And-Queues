package freshly;
//Queue Implementation using Circular Array

import java.util.Scanner;

class Queue
{
   static int max=4;
   static int array[]=new int[max];
   static int front=0,rear=0;
   
	
	void enque(int item)
	{
		rear=(rear+1)%max;
		if(front==rear)
		{
			System.out.println("Overflow Condition, Queue is Full");
			rear=rear-1;
		
		}
		
		else
		{
			array[rear]=item;
		}
		
	}
	
	int deque()
	{
		if(front==rear)
		{

			System.out.println("Underflow condition, Queue is empty");
			return -1;	
		}
		
		else
		{
			front=(front+1)%max;
			int data=array[front];
			array[front]=0;
			
			return data;
		}
		
	}

  public static void main(String[]args)
  {
	  int choice;
	  do
	  {
	  System.out.println("Enter your choice-> 1)Enque 2) Deque 3) Retrieve 4) Exit");
	  Scanner sc=new Scanner(System.in);
	  
	  choice=sc.nextInt();
	  
	  switch(choice)
	  {
	  case 1: 
		  System.out.println("Enter the element to be inserted");
		  new Queue().enque(sc.nextInt());
		  break;
	  
	  case 2:
		  int item=new Queue().deque();
		  System.out.println(item);
		  break;
	
	  case 3:
		  System.out.println("Queue is->");
		 
		  for(int i=0;i<array.length;i++)
		  {
			  System.out.println(array[i]);
		  }
		  
	  case 4:
		  //Exit here
		  break;
		  
		  default:
		  System.out.println("Wrong input, enter a valid one");
	  }
}
		  while(choice!=4);
}
}