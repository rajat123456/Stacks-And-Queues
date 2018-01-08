//Stack Operations Via Array namely-> Push, Pop, Peek

import java.util.Scanner;

class Stack
{
	static int max=3;
	static int array[]=new int[max];
	static int topofstack=0;
	
	void push(int item)
	{
		if(topofstack==array.length)
		{
			System.out.println("Overflow condition, Stack is full");
			return;
		}
		
		else
		{
			array[topofstack]=item;
			++topofstack;
		}
		
	}
	
	int pop()
	{
		if(topofstack==0)
		{

			System.out.println("Underflow condition, Stack is empty");
			return -1;	
		}
		
		else
		{
			int temp=array[topofstack-1];
	            array[topofstack-1] =0;
			
			--topofstack;
			return temp;
		}
	}
	
	int peek()
	{
		if(topofstack==0)
		{

			System.out.println("Stack is empty");
			return -1;
		}
		
		else
		{
			return array[topofstack-1];
		}
	}
	
  public static void main(String[]args)
  {
	  int choice;
	  do
	  {
	  System.out.println("Enter your choice->/t 1)Push /n 2) Pop /n 3) Peek");
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
		  for(int i=0;i<array.length;i++)
		  {
			  System.out.print(array[i]+" ");
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
