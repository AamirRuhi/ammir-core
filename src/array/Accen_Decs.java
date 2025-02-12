package array;

public class Accen_Decs {

	public static void main(String[] args) {

		int a[] = { 13, 2, 5, 6, 8, 1, 0, 9, 11 };

		System.out.println("asc order");
		for (int i = 0; i < a.length; i++) {
           for(int j=i+1;j<a.length;j++)
           {
        	   if(a[i]>a[j])
        	   {
        		   int temp=a[i];
        		   a[i]=a[j];
        		   a[j]=temp;
        	   }
           }
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
