package java8;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfWord {
public static void main(String[] args) {
	String str="my name is aamir khan my name is unique aamir khan name";
	List<String> list = Arrays.asList(str.split(" "));
	Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	Set<Entry<String,Long>> entry=map.entrySet();
	Iterator<Entry<String, Long>> it = entry.iterator();
	while(it.hasNext()) {
		Entry<String, Long> p=it.next();
		System.out.println(p.getKey()+"::"+p.getValue());
	}
}
}
