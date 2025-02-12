package list;

import java.util.Arrays;
import java.util.List;

public class Asc_Dsc {
public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,8,7,2,9,-1,0,10,-17,8,-1,5,7);
		System.out.println("asc order");
		for (int i = 0; i < list.size(); i++) {
           for(int j=i+1;j<list.size();j++)
           {
        	   if(list.get(i)>list.get(j))
        	   {
        		   int temp=list.get(i);
        		 list.set(i, list.get(j));
        		 list.set(j, temp);
        	     }
           }
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}

