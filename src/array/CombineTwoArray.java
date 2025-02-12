package array;

import java.util.Arrays;

public class CombineTwoArray {
public static void main(String[] args) {
	int a[]= {1,3,5,7,9};
	int b[]= {2,4,6,8};
	
	int c[]=new int[a.length+b.length];
	int index=0;
	
	for(int i=0;i<a.length;i++)
	{
		 c[index++]=a[i];
		 
	}
//	System.out.println(Arrays.toString(c));
	for(int i=0;i<b.length;i++)
	{
		c[index++]=b[i];
		
	}
	System.out.println(Arrays.toString(c));
	
	for (int i = 0; i < c.length; i++) {
        for(int j=i+1;j<c.length;j++)
        {
     	   if(c[i]>c[j])
     	   {
     		   int temp=c[i];
     		   c[i]=c[j];
     		   c[j]=temp;
     	   }
        }
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	
	
	
	
	
}
}
