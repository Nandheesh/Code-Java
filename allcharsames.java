check if all the characters of a string are same

Input : s = “geeks”
Output : No

Input : s = “gggg” 
Output : Yes

class Main {
  public static boolean checkchar(Stirng n){
    for(int i=0;i<n.length();i++){
      if(S.charAt(i) != S.charAt(0){
        return false;
      }
    }
   return true;
  }
  
  public static void main(String[] args){
  String n = "gggg";
  if(checkchar(n)){
    System.out.print("Yes"):
    }
  else{
    System.out.print("No");
  }
}
