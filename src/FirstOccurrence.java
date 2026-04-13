import java.util.Scanner;
public class FirstOccurrence {
    
        public static int findIndex(int[] arr,int n,int k){
               for(int i =0;i<n;i++){
                   if(arr[i]==k){
                          return i+1;
                        }
                   }
                return -1;
          }
         public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                int n =sc.nextInt();
                int[] arr =new int[n];
                int k =sc.nextInt();
                for(int i=0;i<n;i++){
                     arr[i]=sc.nextInt();
                 }
                System.out.println(findIndex(arr,n,k));
}
    
}
