package array;

public class IndexNo {
public int indexNumber(int a[],int key) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==50) {
			return i;
		}
	}
	return -1;
	
}
public static void main(String[] args) {
	IndexNo indexNo=new IndexNo();
	int key=500;
	int a[]= {4,6,2,12,45,87,50,78,90};
	System.out.println(indexNo.indexNumber(a,key));
}
}
