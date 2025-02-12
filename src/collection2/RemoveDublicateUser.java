package collection2;

import java.util.HashSet;
import java.util.Set;

import collection.User;

public class RemoveDublicateUser {
public static Set<User> getRomoveDublicate(){
	Set<User> set= new HashSet<User>();
	User u1=new User(1,"aamir","noida",40000);	
	User u2=new User(2,"aarif","noida",30000);	
	User u3=new User(3,"kashif","noida",50000);	
	User u4=new User(4,"asif","noida",20000);	
	User u5=new User(5,"iqbal","noida",80000);	
	User u6=new User(6,"aarif","noida",30000);	
	set.add(u1);
	set.add(u2);
	set.add(u3);
	set.add(u4);
	set.add(u5);
	set.add(u6);
	return set;
	
}
public static void main(String[] args) {
	Set<User> romoveDublicate = RemoveDublicateUser.getRomoveDublicate();
	
	// Print unique users
    for (User user : romoveDublicate) {
        System.out.println(user);
    }

}
}
