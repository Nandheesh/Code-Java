Input  : N = 5
Output : 1 5 15 34 65
  
Explaination :
1 = 1
2+3 = 5
4+5+6 = 15
7+8+9+10 = 34
11+12+13+14+15 = 65
  
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int val=1;
        for(int i=1; i<=n; i++){
            int res=0;
            for(int j=1; j<=i; j++){
                res+=val++;
            }
            System.out.print(res+" ");
        }
	}
}
