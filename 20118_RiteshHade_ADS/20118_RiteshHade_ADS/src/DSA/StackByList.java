package DSA;

public class StackByList 
{
	static StackByList head;
	StackByList next;
	int data,size;
	
	public StackByList(int data)
	{
		this.data=data;
		this.next=null;
	}
	
	public void push(int data)
	{
		StackByList newNode=new StackByList(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
	}
	
	public void pop()
	{
		if(head==null)
		{
			System.out.println("Stack is Empty...");
			return;
		}
		head=head.next;
		return;
	}
	
	void peek()
	{
		System.out.println(head.data);
	}
	
	void display()
	{
		System.out.print("Element of an stack: ");
		StackByList currnode= head;
		while(currnode != null)
		{
			System.out.println(currnode.data+" ");
			currnode=currnode.next;
		}
		System.out.print("NULL");
		
		if(head ==null)
		{
			System.out.println("Stack is Empty......");
			return;
		}
	}
	public static void main(String[] args) {
		
		StackByList sl= new StackByList(5);
		sl.push(10);
		sl.push(20);
		sl.push(8);
		sl.push(9);
		sl.push(66);
		sl.push(89);
		sl.push(13);
		sl.peek();
		sl.display();
		

	}

}
