// Implement 2 Stacks in an Array

public class Main
{
    static int left=-1;
    static int right=0;
	public static void main(String[] args) {
		
		int[]arr=new int[10];
		right=arr.length;
		System.out.println(popfirst(arr));
		System.out.println(popsecond(arr));
		pushsecond(6,arr);
		pushsecond(7,arr);
		pushfirst(1,arr);
		pushfirst(2,arr);
		System.out.println(popsecond(arr));
		System.out.println(popfirst(arr));
		pushfirst(3,arr);
		System.out.println(popfirst(arr));
		pushsecond(8,arr);
		System.out.println(popsecond(arr));
		System.out.println(popsecond(arr));
		pushsecond(9,arr);
		System.out.println(popfirst(arr));
		pushfirst(4,arr);
		pushfirst(5,arr);
		System.out.println(popfirst(arr));
		pushsecond(10,arr);
		System.out.println(popsecond(arr));
		System.out.println(popfirst(arr));
		System.out.println(popfirst(arr));
		System.out.println(popsecond(arr));
		System.out.println(popsecond(arr));
		
	}
	
	static void pushfirst(int value, int[]arr)
	{
	  ++left;  
	    
      if(left==right)
      {
       System.out.println("Overflow");
       return;
      }
      
      else
          arr[left]=value;
	}
	
	static void pushsecond(int value, int[]arr)
	{
	    --right;  
	    
      if(left==right)
      {
       System.out.println("Overflow");
       return;
      }
      
      else
          arr[right]=value;
	}
	
	static int popfirst(int[]arr)
	{
	    
      if(left==-1)
      {
       System.out.print("Underflow ");
       return -1;
      }
      
      else
      {
          int val=arr[left];
          --left;
          return val;
      }
	}
	
	static int popsecond(int[]arr)
	{
	    
      if(right==arr.length)
      {
       System.out.print("Underflow ");
       return -1;
      }
      
      else
      {
          int val=arr[right];
          ++right;
          return val;
      }
	}
}
