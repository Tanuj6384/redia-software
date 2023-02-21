public class C_Sort_0s_1s_1loop {
    public static void main(String[] args) {
        int [] arr={2,2,1,0,1,0,1,1};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int [] arr){
        int start=0, mid=0, end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                swap(arr,start,mid);
                mid++;
                start++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,end);
                end--;
            }
        }
    }
        public static void swap(int[] arr, int start, int mid){
            int temp=arr[start];
            arr[start]=arr[mid];
            arr[mid]=temp;
        }
    }
/*
0 0 1 1 1 1 2 2 
*/

