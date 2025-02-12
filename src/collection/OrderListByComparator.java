package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class OrderListByComparator {

	public static List<User> getAccending()
	{
		List<User> list = new  LinkedList<User>();
	User u1=new User(1,"aamir","noida",40000);	
	User u2=new User(2,"aarif","noida",30000);	
	User u3=new User(3,"kashif","noida",50000);	
	User u4=new User(4,"asif","noida",20000);	
	User u5=new User(5,"iqbal","noida",80000);	
	
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u5);
		
		return list;
		
	}
	public static void main(String[] args) {
		List<User> list = OrderListByComparator.getAccending();
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u1.getSalary(), u2.getSalary());
               //  return Integer.compare(u2.getSalary(), u1.getSalary()); // for Reverse order

            }
        });

        // Print sorted list
        for (User user : list) {
            System.out.println(user);
        }

	}
	
}