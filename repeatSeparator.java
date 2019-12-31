public String repeatSeparator(String word, String sep, int count) {
  String res="";
  String result="";
  int i,j,k;
  for(j=0;j<count;j++)
  {
    for(i=0;i<word.length();i++)
    {
      res+=word.charAt(i);
    }
  res+=sep;
  }
  for(i=0;i<res.length()-sep.length();i++)
  result+=res.charAt(i);
  return result;
}
