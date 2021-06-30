package MyFrameWork;

public class HashedSet <Type>
{
	private int size = 0;
	private int capacity = 10;
	private Object arr[];
	
	public HashedSet()
	{
		arr = new Object[capacity];
	}
	
	public HashedSet(int capacity)
	{
		this.capacity = capacity;		arr = new Object[capacity];
	}
	
	public int computeHash(Object obj)
	{
		String s = obj.toString();
		int param = 0;
		for(int i=0;i<s.length();i++)
		{
			param+=(int)s.charAt(i);
		}
		return param%size; 
	}
}
