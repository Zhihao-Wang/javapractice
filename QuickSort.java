public class QuickSort{
	public static void main(String[] args){
		int[] data={1,3,4,7,2,5,6,8};
		Quicksort qs=new Quicksort();
		qs.data=data;
		qs.sort(0,data.length-1);
		for(int n:data){
			System.out.println(n+" ");
		}
	}
	
	static class Quicksort{
		public int data[];
		private int partition(int array[],int low,int high){
			int key=array[low];
			while(low<high){
				while(low<high&&array[high]>=key)
					high--;
				array[low]=array[high];
				while(low<high&&array[low]<=key)
					low++;
				array[high]=array[low];
				}
			array[low]=key;
			return low;
	      }
		
		public int[] sort(int low,int high){
			if(low<high){
				int mid=partition(data,low,high);
				sort(low,mid-1);
				sort(mid+1, high);
			}
			return data;
		}
	}
	
}