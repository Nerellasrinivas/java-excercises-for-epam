public String repeatEnd(String str, int n) {
  int i,len=str.length();
  String res="";
  String result="";
  for(i=len-n;i<len;i++)
  {
    char ch=str.charAt(i);
    res+=ch;
  }
  for(i=0;i<n;i++)
  {
    result+=res;
  }
  return result;
}
