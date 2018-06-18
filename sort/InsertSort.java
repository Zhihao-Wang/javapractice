package sort;


import java.util.Arrays;

public class InsertSort {
   public static void insertSort(int[] arr){
       for(int i=1;i<arr.length;i++){
           int temp= arr[i];
           int j=i-1;
           for(;j>=0&&arr[j]>temp;j--){
               arr[j+1]=arr[j];
           }
           arr[j+1]=temp;
       }
       System.out.println(Arrays.toString(arr));
   }

    public static void main(String[] args) {
        int[] arr={1,3,4,8,2,5,7,6};
        insertSort(arr);
    }
}


