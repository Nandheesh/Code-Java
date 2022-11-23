Program to find the initials of a name.
Input  : prabhat kumar singh
Output : P K S
We take the first letter of all
words and print in capital letter.

Input  : Jude Law
Output : J L

Input  : abhishek kumar singh
Output : A K S

class Main{
  static void letter(String S){
    if(S.length() == 0)
        return 0;
        
    System.out.print(Character.toUpperCase(S.charAt(0));
    
    for(int i=1;i<S.length()-1;i++){
      if(S.charAt(i) == " "){
        System.out.print(Character.toUpperCase(S.charAt(i+1));
        }
     }
