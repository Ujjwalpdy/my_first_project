import java.util.*;
public class EleInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int item=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=find(arr,item);
        System.out.println(r);
    }
    public static int find(int[] arr,int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
}
