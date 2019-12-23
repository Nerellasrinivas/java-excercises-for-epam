import java.io.*;
import java.util.*;
class Week32
{
public static void main(String[]args)
{int n,i,min,max;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}min=arr[0];
max=arr[0];
for(i=0;i<n;i++)
{
if(max<arr[i])
max=arr[i];
if(min>arr[i])
min=arr[i];
}
System.out.println(max+"\n"+min);
}
}
