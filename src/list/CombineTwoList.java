package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombineTwoList {
public static void main(String[] args) {
	List<Integer> l1 = Arrays.asList(1,3,5,7,9);
	List<Integer> l2 = Arrays.asList(2,4,6,8,10);
	List<Integer> comb=new LinkedList<>();
	comb.addAll(l1);
	comb.addAll(l2);
comb.stream().forEach(x->System.out.print(x));

for(int i=0;i<comb.size();i++)
{
	for(int j=i+1;j<comb.size();j++)
	{
		if(comb.get(i)>comb.get(j))
		{
			int temp=comb.get(i);
			comb.set(i, comb.get(j));
			comb.set(j, temp);
		}
	}
}
System.out.println();
comb.forEach(x->System.out.print(x));
}
}
