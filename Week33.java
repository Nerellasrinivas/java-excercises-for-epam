import java.io.*;
import java.util.*;
class Week33
{
public static void main(String[]args)
{int n,i,k,flag=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
k=sc.nextInt();
for(i=0;i<n;i++)
{
if(k==arr[i])
{flag=1;
break;
}
}
if(flag==1)
{
System.out.println(i+1);
}
else
{
System.out.println("-1");
}
}
}
