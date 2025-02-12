package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class DublicateNo {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(2,3,4,11,21,47,3,11);

	Set<Integer> set=new HashSet<>();
	System.out.println("dublicate");
	list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.print(x));
	
}
}
