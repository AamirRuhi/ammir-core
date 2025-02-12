package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generate_operation {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(2,3,4,11,21,47,3,11);
	System.out.println("even no");
	list.stream().filter(x->x%2==0).forEach(x->System.out.print(x));
	System.out.println();
	System.out.println("asc no");
	 list.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList()).forEach(x->System.out.println(x));
	 System.out.println();
	 System.out.println("sum no");
	 Integer integer = list.stream().reduce((a,b)->a+b).map(x->x+2).get();
	 System.out.println(integer);
	 
	 System.out.println();
	 System.out.println("max no");
     Integer integer2 = list.stream().max((a,b)->a.compareTo(b)).map(x->x+3).get();//.map(x->x+2)
   System.out.println(integer2);
   
   System.out.println();
   System.out.println("min no");
   Integer integer3 = list.stream().max((a,b)->b.compareTo(a)).map(x->x+3).get();//.map(x->x+2)
   System.out.println(integer3);
   
   System.out.println();
   System.out.println("second max no");
      list.stream().sorted((a,b)->b.compareTo(a)).limit(2).skip(1).collect(Collectors.toList()).forEach(x->System.out.println(x));
    
}
}
