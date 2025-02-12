package list;

import java.util.Arrays;
import java.util.List;

public class IndexKey {
public static int findIndex(List<Integer> l,int key)
{
	for(int i=0;i<l.size();i++)
	{
		if(l.get(i)==key) {
			return i;
		}
	}
	return -1;
}
public static void main(String[] args) {
	int key=50;
	List<Integer> l2 = Arrays.asList(2,34,11,50,87,61);
	System.out.println(IndexKey.findIndex(l2, key));
}
}
