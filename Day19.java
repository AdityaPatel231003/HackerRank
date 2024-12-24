import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Day19 {
    
    public static void Call(int arr[],int target,int i){
        
        if(i==arr.length){
            return;
        }
        if(arr[i]==target){
            System.out.print(i +" ");
        }
        Call(arr,target,i+1);
        
    }

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   int Task=sc.nextInt();
        for(int i=1;i<=Task;i++){
            
            int N=sc.nextInt();
            int target=sc.nextInt();
            int arr[]=new int[N];
            for(int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();
            }
              Arrays.sort(arr);
            Call(arr,target,0);
             System.out.println();
        }
    }
}
// 9 10 8 1 6 10 6 11 2 14

// 3 12
// 12 15 0