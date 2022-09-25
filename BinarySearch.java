package array;
public class BinarySearch
{
	public static void main(String[] args) 
	{
		int a[] = {12,34,45,65,83};
		BinarySearch obj = new BinarySearch();
		int i = obj.SearchIndex(a,83,0,a.length-1);
		if (i==-1) 
		{
			System.out.println(" Value does't exist in array");
		}
		else 
		{
			System.out.println(i);
		}
		
	}
	public static int SearchIndex(int a[],int val,int start,int end) {
		if (a.length==0 || start>end) {
			return -1;
			
		}
		int mid = (start+end)/2;
		if (val == a[mid]) {
			return mid;
		}
		if (val<a[mid]) {
			return SearchIndex(a,val,start,mid-1);
		}
		else {
			return SearchIndex(a,val,mid+1,end);
		}
				
		
	}


}

