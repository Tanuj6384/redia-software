public class C_Second_Largest_no1 {
    public static void main(String[] args) {
        int[] arr ={3,5,6,7,9,7,1}; //first decendecing order
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){ // small k liye 
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        System.out.println(arr[1]);
    }
}
