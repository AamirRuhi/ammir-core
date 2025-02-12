package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OrderByComparable {
	public static List<Employee> getAccending()
	{
		List<Employee> list = new  LinkedList<Employee>();
		Employee u1=new Employee(1,"aamir","noida",40000);	
		Employee u2=new Employee(2,"aarif","noida",30000);	
		Employee u3=new Employee(3,"kashif","noida",50000);	
		Employee u4=new Employee(4,"asif","noida",20000);	
		Employee u5=new Employee(5,"iqbal","noida",80000);	
	
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u5);
		
		return list;
		
	}
	public static void main(String[] args) {
		List<Employee> list = OrderByComparable.getAccending();
		Collections.sort(list);

		 // Print sorted list
        for (Employee user : list) {
            System.out.println(user);
        }

	}
}
