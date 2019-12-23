import java.io.*;
import java.util.*;
class Week36
{
public static void main(String[]args)
{int n,i,k,temp;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for (i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
for(i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}
}
