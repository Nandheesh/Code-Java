Input: str1 = “listen”  str2 = “silent”
Output: “Anagram”
Explanation: All characters of “listen” and “silent” are the same.

Input: str1 = “gram”  str2 = “arm”
Output: “Not Anagram”

class main{
  static boolean areAnagram(char[] str1, char[] str2  {
        int n1 = str1.length;
        int n2 = str2.length;
 
        if (n1 != n2)
            return false;
            
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
   }
   public static void mian(String[] args){
      String a = "listen";
      Stirng b = "silent";
      char str1[] = a.toCharArray();
      char[] str2 = b.toCharArray();
      
      if(areAnagram(str1 , str2){
        System.out.print("Anagram"):
       }
       else{
        System.out.print("Not Anagram"):
       }
 }   
