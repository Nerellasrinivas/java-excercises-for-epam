public String repeatFront(String str, int n) {
   int i,j,len=str.length();
  String res="";
  String result="";
  for(i=0;i<n;i++)
  {
    char ch=str.charAt(i);
    res+=ch;
  }
  result+=res;
  for(j=1;j<n;j++)
  {
 for(i=0;i<res.length()-j;i++)
 {
  result+=res.charAt(i); 
 }
  }
  return result;
}
