package DSA;

public class QueueUsingList {
	QueueUsingList head;
	QueueUsingList next;
	int data;
	
	QueueUsingList(int data)
	{
		this.data=data;
		this.next=null;
	}
	
	void enQueue(int data)
	{
		QueueUsingList newNode= new QueueUsingList(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		QueueUsingList currnode=head;
		while(currnode.next != null)
		{
			currnode=currnode.next;
	}
		currnode.next=newNode;
	}
	
	
	void deQueue()
	{
		if(head==null)
		{
			System.out.println("Queue is empty...");
			return;
		}
		head=head.next;
		return;
	}
		void display()
		{
			QueueUsingList currnode = head;
			if(head==null) {
				System.out.println("Stack is Empty...");
				return;
		}
			System.out.println("Queue: ");
		while(currnode != null)
		{
			System.out.print(currnode.data+" ");
			currnode=currnode.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		QueueUsingList q1 = new QueueUsingList(10);
		q1.enQueue(10);
		q1.enQueue(20);
		q1.enQueue(30);
		q1.enQueue(40);
		q1.enQueue(50);
		q1.display();
		q1.deQueue();
		q1.display();

	}

}
