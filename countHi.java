public int countHi(String str) {
  int c=0,i;
 for(i=0;i<str.length()-1;i++)
 {
   if((str.substring(i,i+2)).equals("hi"))
   c++;
 }
  return c;
}
