Round the given number to nearest multiple of 10
Input : 4722
Output : 4720

Input : 38
Output : 40

Input : 10
Output: 10

class Main{
  static void mul(int n){
    int a = (n/10)+10;
    int b = a+10;
    
    return (n-a > b-n) ? b : a;
  }
}
