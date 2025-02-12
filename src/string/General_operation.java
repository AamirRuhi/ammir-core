package string;

public class General_operation {
public static void main(String[] args) {
	 String str="aamir khinrk";
	 System.out.println("dublicate charecter");
	 char[] ch = str.toCharArray();
	 for(int i=0;i<ch.length;i++)
	 {
		 for(int j=i+1;j<ch.length;j++)
		 {
			 if(ch[i]==ch[j]) {
				 System.out.print(ch[i]);
			 }
		 }
	 }
	}
}
