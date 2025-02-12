package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceOfLetter {
public static Map<Character,Integer> getOccurence(String str)
{
	char[] ch = str.toCharArray();
	Map<Character,Integer> map=new HashMap<>();

	for(char c:ch)
	{
		if(map.containsKey(c))
		{
			int p=map.get(c)+1;
			System.out.println("keys are "+p);
			map.put(c, p);
		}else {
			map.put(c, 1);
		}
	}
	return map;
	
}
public static void main(String[] args) {
	Map<Character, Integer> m = OccurenceOfLetter.getOccurence("my name is aamir");
	Set<Entry<Character,Integer>> entry=m.entrySet();
	Iterator<Entry<Character,Integer>> it=entry.iterator();
  while(it.hasNext()) {
	  Entry<Character,Integer> et =it.next();
	  Character character =et.getKey();
	  Integer value = et.getValue();
	  System.out.println(character+"::"+value);
  }
}
}
