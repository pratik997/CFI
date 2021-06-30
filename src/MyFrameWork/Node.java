package MyFrameWork;

public class Node <Type>
{
	Node<Type> prev;
	private int index;
	private Object element;
	Node<Type> next;
	Node(){
		
	}
	
	Node(int index,Type element)
	{
		this.index = index;
		this.element = element;
	}
	public int getIndex()
	{
		return this.index;
	}
	public Type getElement()
	{
		return (Type)this.element;
	}
	public void setIndex(int index)
	{
		this.index = index;
	}
}
