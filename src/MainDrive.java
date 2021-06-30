import java.io.*;
import MyFrameWork.List;
import MyFrameWork.DoubleEndedList;
public class MainDrive {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*List is an duplicate of ArrayList present in "java.util" package */
//      System.out.println("Enter initial capacity : ");
		
		
//		List<Integer> list = new List<Integer>(Integer.parseInt(br.readLine()));
//		System.out.println("Enter the number of element you want to add : ");
//
//		int n = Integer.parseInt(br.readLine());
//
//		for(int i=0;i<n;i++)
//		{
//			System.out.println("Enter the element you want to add : ");
//			list.add(Integer.parseInt(br.readLine()));
//		}
//		System.out.print("Printing the list:\n[ ");
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.print(list.get(i)+" ");
//		}
//		System.out.println("]");
//		list.set(3, 25);
//		System.out.print("Printing the list:\n[ ");
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.print(list.get(i)+" ");
//		}
//		System.out.println("]");
//		list.remove(5);
//		System.out.print("Printing the list:\n[ ");
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.print(list.get(i)+" ");
//		}
//		System.out.println("]");
		
		/* "DoubleEndedList" is an duplicate implementation of "LinkedList" present in "java.util" package */
		
		DoubleEndedList<Integer> dle = new DoubleEndedList<Integer>();
		
		System.out.println("Enter number of element you want to enter : ");
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element : ");
			dle.add(Integer.parseInt(br.readLine()));
		}
		System.out.print("[");
		for(int i=0;i<dle.size();i++)
		{
			System.out.print(dle.get(i)+" ");
		}
		System.out.println("]");
		dle.remove(3);
		System.out.print("[");
		for(int i=0;i<dle.size();i++)
		{
			System.out.print(dle.get(i)+" ");
		}
		System.out.println("]");
	}

}
