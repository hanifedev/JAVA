package nesne;
import java.util.HashSet;
import java.util.Iterator;
public class main 
{
	public static void main(String[] args) 
  {
		String []dizi={"ayse","fatma","ozan"};
		HashSet<String> kume=new HashSet<String>();
		for (String s: dizi)
			kume.add(s);
		System.out.println("eleman sayisi : " + kume.size());
		Iterator<String> itr=kume.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
