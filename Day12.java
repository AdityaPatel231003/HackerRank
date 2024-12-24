
import java.util.Scanner;
public class Day12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Task=sc.nextInt();
        for(int i=1;i<=Task;i++){
            int d=sc.nextInt();
             int k=sc.nextInt();
             int l=sc.nextInt();
             int m=sc.nextInt();
             int n=sc.nextInt();
            int arr[]=new int[d+1];
            
              for(int j=1;j<d;j++){
                  arr[j]=j;
              }
             
            
            Call(arr,k,l,m,n);
          
            int get=0;
             for(int j=1;j<d;j++){
                 if(arr[j]>0){
                    
                    get++;
                 }
                  
              }
              int sum=Math.abs(d-get);
              System.out.println(sum);
            
            }
       
    
    }
    public static void Call(int arr[],int  k,int l,int m,int n){
int kk=k;
int ll=l;
int mm=m;
int nn=n;
        while(k<=arr.length-1){
            arr[k]=0;
            k=k+kk;
        }
        while(l<=arr.length-1){
            arr[l]=0;
            l=l+ll;
        }
        while(m<=arr.length-1){
            arr[m]=0;
           m=m+mm;
        }
        while(n<=arr.length-1){
            arr[n]=0;
           n=n+nn;
        } 
    }
}
// 1, 7, 11, 13, 17, 19 and 23