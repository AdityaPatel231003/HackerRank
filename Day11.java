import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Day11{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int Task=sc.nextInt();
        for(int K=1;K<=Task;K++){
            
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            
            int count[]=new int[n+1];
            
             for(int i=0;i<count.length;i++){
                count[i]=i;
            }
            
              for(int i=0;i<arr.length;i++){
                  for(int j=0;j<=n;j++){
                            if(arr[i]==j){
                                count[j]=0;
                            }
                      }
                    }
                    int max=0;
                    for(int L=0;L<count.length;L++){
                           if(count[L]>=0){
                               max=Math.max(max,count[L]);
                               
                           }
                            }
                  System.out.println(max);
                  
            
            
                      
            }


            
            
        }
    }
