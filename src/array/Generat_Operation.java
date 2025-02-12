package array;

public class Generat_Operation {
public static void main(String[] args) {
	int a[]={12,51,111,8,61,1,11,2,5,34,61,0};

//reverse array
	System.out.println("reverse");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	
	System.out.println();
	System.out.println("even no");
	for(int i=0;i<a.length;i++)  //i=0
	{
		if(a[i]%2==0) {
			System.out.print(a[i]+" ");

		}
		}
	System.out.println();
	System.out.println("odd no");
	for(int i=0;i<a.length;i++)  //i=0
	{
		if(a[i]%2!=0) {
			System.out.print(a[i]+" ");
			
		}
	}
	
	System.out.println();
	System.out.println("dublicate");
	for(int i=0;i<a.length;i++)  //i=0
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.print(a[j]+" ");
			}
		}
		
	}
	
	System.out.println();
	System.out.println("unique element");
	//	int a[]={2,5,11,8,6,2,11,5,34};
	for(int i=0;i<a.length;i++)  //i=0
	{
		boolean isDublicate=false;
		for(int j=0;j<a.length;j++)
		{
			if( i!=j && a[i]==a[j])
			{
				isDublicate =true;
				break;
			}
		}
		if(!isDublicate) {
			System.out.print(a[i]+" ");
		}
	}
	System.out.println();
	System.out.println("max element");
	//	int a[]={2,5,11,8,6,2,11,5,34};
	int max=0;
	for( int i=0;i<a.length;i++)  //i=0
	{
		if(max<a[i])
          max=a[i];   
	}
	System.out.println(max);
	
	System.out.println();
	System.out.println("min element");
	//	int a[]={2,5,11,8,6,2,11,5,34};
	int min=a[0];
	for( int i=0;i<a.length;i++)  //i=0
	{
		if(min>a[i])
			min=a[i];   
	}
	System.out.println(min);
	
	System.out.println();
	System.out.println("first unique element");
	//	int a[]={2,5,11,8,6,2,11,5,34};
	for(int i=0;i<a.length;i++)  //i=0
	{
		boolean isDublicate=false;
		for(int j=0;j<a.length;j++)
		{
			if( i!=j && a[i]==a[j])
			{
				isDublicate =true;
				break;
			}
		}
		if(!isDublicate) {
			System.out.print(a[i]+" ");
			break;
		}

	}
	
	System.out.println();
	System.out.println("first dublicate");
	for(int i=0;i<a.length;i++)  //i=0
	{
		boolean isDublicate=false;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				isDublicate=true;
				break;
			}
		}
		if(isDublicate) {
			System.out.println(a[i]);
		}
		
	}
	System.out.println();
	System.out.println("second max no");
	int maxx1=Integer.MIN_VALUE;
	int maxx2=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>maxx1)
		{
			maxx2=maxx1;
			maxx1=a[i];
		}else {
			if(a[i]>maxx2)
			{
				maxx2=a[i];
			}
		}
	}
	System.out.println(maxx2);
	
	System.out.println();
	System.out.println("second min no");
	int m1=Integer.MAX_VALUE;
	int m2=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++)
	{//	int a[]={12,51,111,8,61,1,11,2,5,34,61};

		if(a[i]<m1)  //i=0 m1=12,m2=1000,i=1 m2=51
		{
			m2=m1;
			m1=a[i];
		}else {
			if(a[i]<m2)
			{
				m2=a[i];
			}
		}
	}
	System.out.println(m2);
	
}
}
