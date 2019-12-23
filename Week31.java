import java.io.*;
import java.util.*;
class Week31
{
public static void main(String[]args)
{int n,i,sum=0,avg;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
sum+=arr[i];
}
System.out.println(sum);
avg=sum/n;
System.out.println(avg);
}
}
