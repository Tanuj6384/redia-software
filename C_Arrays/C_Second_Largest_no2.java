public class C_Second_Largest_no2 {
    public static void main(String[] args) {
        int [] arr={3,5,6,7,8,2,1};
        int largest=arr[1];
        int secLargest=arr[0];
        if(arr[0]>arr[1]){
            largest=arr[0];
            secLargest=arr[1];
        }
        for(int i=2; i<arr.length; i++){
            if(arr[i]>largest){
                secLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secLargest){
                secLargest=arr[i];
            }
        }
        System.out.println("Largest="+largest+" "+" SecLargest="+secLargest);
    }
}
/*
 Largest=8  SecLargest=7
 */
