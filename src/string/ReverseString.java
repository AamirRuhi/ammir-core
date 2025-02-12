package string;

public class ReverseString {
public static String getReverse(String str)
{
	char[] a = str.toCharArray();
	String rev="";
	for(int i=a.length-1;i>=0;i--)
	{
		rev+=a[i];
	}
	return rev;
}
public static void main(String[] args) {
	System.out.println(ReverseString.getReverse("aamir"));
}
}
