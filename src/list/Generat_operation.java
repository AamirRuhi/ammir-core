package list;

import java.util.Arrays;
import java.util.List;

public class Generat_operation {
public static void main(String[] args) {
	
	List<Integer> list=Arrays.asList(5,8,7,2,9,-1,0,10,-17,8,-1,5,7);
	
	System.out.println("reverse list");
	for(int i=list.size()-1;i>=0;i--)
	{
		System.out.print(list.get(i)+" ");
	}
	System.out.println();
	System.out.println("even no");
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)%2==0)
		{
			System.out.print(list.get(i)+" ");
		}
	}
	
	System.out.println();
	System.out.println("first max no");
	int max=0;
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)>max)
		{
			max=list.get(i);
		}
	}
	System.out.println(max);
	
	System.out.println();
	System.out.println("first min no");
	int min=0;
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)<min)
		{
			min=list.get(i);
		}
	}
	System.out.println(min);
	
	System.out.println();
	System.out.println("dublicate no");
	for(int i=0;i<list.size();i++)
	{
	for(int j=i+1;j<list.size();j++)
	{
		if(list.get(i)==list.get(j))
		{
			System.out.print(list.get(j));
		}
	}
	}
	System.out.println();
	System.out.println("non dublicate no");
	//	List<Integer> list=Arrays.asList(5,8,7,2,9,-1,0,10,-17,8,-1);
	for(int i=0;i<list.size();i++)
	{
		boolean isDublicate =false;
		for(int j=0;j<list.size();j++)
		{
			if(i!=j && list.get(i)==list.get(j))
			{
				isDublicate=true;
				break;
			}
		}
		if(!isDublicate) {
			System.out.print(list.get(i)+" ");
		}
	}
	
	System.out.println();
	System.out.println("second max no");
	//	List<Integer> list=Arrays.asList(5,8,7,2,9,-1,0,10,-17,8,-1);
int max1=Integer.MIN_VALUE;
int max2=Integer.MIN_VALUE;
for(int i=0;i<list.size();i++)
{
	if(list.get(i)>max1)
	{
		max2=max1;
		max1=list.get(i);
	}else {
		if(list.get(i)>max2)
		{
			max2=list.get(i);
		}
	}
}
	System.out.println(max2);
	
	System.out.println();
	System.out.println("first dublicate no");
	for(int i=0;i<list.size();i++)
	{
		boolean isDublicate=false;
		for(int j=i+1;j<list.size();j++)
		{
			if(list.get(i)==list.get(j))
			{
				isDublicate=true;
				break;
			}
		}
		if(isDublicate) {
			System.out.print(list.get(i));
			break;
		}
	}
	//	List<Integer> list=Arrays.asList(5,8,7,2,9,-1,0,10,-17,8,-1,5,7);
	System.out.println();
	System.out.println("first non dublicate no");
	for(int i=0;i<list.size();i++)
	{
		boolean isDublicate=false;
		for(int j=0;j<list.size();j++)
		{
			if(i!=j && list.get(i)==list.get(j))
			{
				isDublicate=true;
				break;
			}
		}
		if(!isDublicate) {
			System.out.println(list.get(i));
			break;
		}
	}
	
}
}
