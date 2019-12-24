public String doubleChar(String str) {
  String result="";
  int i,j;
  for(i=0;i<str.length();i++)
  {
    char ch=str.charAt(i);
    result=result+ch+ch;
  }
  return result;
}
