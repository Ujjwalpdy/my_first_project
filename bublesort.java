public class bublesort {
    public static void main(String[] args) {
        int [] arr={1,3,5,4,6,2};
        sort(arr);
        int l=arr.length;
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr){
        int l=arr.length;
        for(int j=0;j<l;j++){
            for(int i=0;i<l-1;i++){
                if(arr[i]>arr[i+1]){           //this is the line which deecides our sorting is gonna be increasing or decreasing;"just change signs"
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            
        }
    }
}
