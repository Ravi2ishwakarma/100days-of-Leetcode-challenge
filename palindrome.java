// If any number is palindrome then return true else false

class Solution()
  public boolean Ispalindrome(int a){
  if(a<0){
   return false;
  }
  int n= a;
  int revnum=0;
  while(n>0){
    int d= n%10;
    revnum= revnum*10 +d;
    n= n/10;
      }
   if(a==revnum){
     return true;
    }
   else{
     return false;
    }
  }
