package MyFrameWork;

public class DoubleEndedList <Type>
{
	private Node<Type> head;
	private int size = 0;
	private Node<Type> tail;
	
	public DoubleEndedList()
	{
		head = new Node<Type>();
		tail = head;
	}
	
	public void add(Type element)
	{
		Node<Type> newNode = new Node<Type>(size,element);
		if(head.getElement()==null)head = newNode;
		else
		{
			Node<Type> prev = new Node<Type>();
			Node<Type> next = head;
			while(next!=null)
			{
				prev = next;
				next = next.next;
			}
			prev.next = newNode;
			newNode.next = next;
			newNode.prev = prev;
		}
		tail = newNode;
		size++;
	}
	public int size()
	{
		return size;
	}
	public Type get(int index)throws Exception
	{
		if(index<0 || index>size) {
			throw new Exception(index+" is out of bound for "+size);
		}
		Node<Type> cur = new Node<Type>();
		int cmp = 0;
		if(index<size/2)
		{
			cur = head;
			while(cur.getIndex()!=index)
			{
				cur = cur.next;
				cmp++;
			}
		}
		else
		{
			cur = tail;
			while(cur.getIndex()!=index)
			{
				cur = cur.prev;
				cmp++;
			}
		}
		//System.out.println("Number of comparison : "+cmp);
		return cur.getElement();
	}
	public void remove(int index)throws Exception
	{
		if(index<0 || index>size) {
			throw new Exception(index+" is out of bound for "+size);
		}
		Node<Type> cur = new Node<Type>();
		if(index<size/2)
		{
			cur = head;
			while(cur.getIndex()!=index)
			{
				cur = cur.next;
			}
		}
		else
		{
			cur = tail;
			while(cur.getIndex()!=index)
			{
				cur = cur.prev;
			}
		}
		cur.prev.next = cur.next;
		cur.next.prev = cur.prev;
		while(cur!=null)
		{
			cur.setIndex(cur.getIndex()-1);
			cur = cur.next;
		}
		size--;
	}
}
