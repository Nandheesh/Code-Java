Smallest number with sum of digits as N and divisible by 10^N

Input : N = 5
Output : 500000
500000 is the smallest number divisible
by 10^5 and sum of digits as 5.

Input : N = 20
Output : 29900000000000000000000
  
class Main {
  public static void main(String[] args){
    int n = 10;
    if(n % 9 != 0){
      System.out.print(n % 9);
    }
    for(int i = 1;i<=n/9;i++){
      System.out.print("9");
    }
    int i = 0;
    while(i < n) {
      System.out.print("0");
    }
  }
}
