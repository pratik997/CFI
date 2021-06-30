package MyFrameWork;

public class List<Type> 
{
	private int size = 0;
	private int capacity = 10;
	private Object arr[];
	
	public List()
	{
		arr = new Object[capacity];
	}
	
	public List(int capacity)
	{
		this.capacity = capacity;
		arr = new Object[capacity];
	}
	
	public void add(Type val)
	{
		arr[size] = val;
		size++;
		if(size>=capacity)
		{
			Object arrTemp[] = new Object[2*capacity];
			for(int i=0;i<size;i++)
			{
				arrTemp[i] = arr[i];
			}
			arr = arrTemp;
		}
	}
	public Type get(int index) throws Exception
	{
		if(index<0 || index>size) {
			throw new Exception(index+" is out of bound for "+size);
		}
		return (Type)arr[index];
	}
	public int size()
	{
		return size;
	}
	public void set(int index,Type val)throws Exception
	{
		if(index<0 || index>size) {
			throw new Exception(index+" is out of bound for "+size);
		}
		arr[index] = val;		
	}
	public void remove(int index)throws Exception
	{
		if(index<=0 || index>size) {
			throw new Exception((index-1)+" is out of bound for "+size);
		}
		for(int i=index-1;i<size-1;i++)
		{
			arr[i] = arr[i+1];
		}
		size--;
	}
}
