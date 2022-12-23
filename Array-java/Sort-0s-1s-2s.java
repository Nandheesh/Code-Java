Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
  
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.
  
class Solution {
    public static void main(String args[]) {
      Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        int []arr = new int[N];
        int start = 0;
        int mid = 0;
        int end = n-1;
        int temp = 0;
        
        while(mid <= end) {
            
            switch(arr[mid]) {
                
                case 0 : temp = arr[start];
                         arr[start] = arr[mid];
                         arr[mid] = temp;
                         start++;
                         mid++;
                         break;
                         
                case 1 : mid++;  
                         break;
                         
                
                case 2 : temp = arr[mid];
                         arr[mid] = arr[end];
                         arr[end] = temp;
                         end--;
                         break;
            }
        }
      for(int i = 0 ;i<N ;i++){
        System.out.print(arr[i]);
      }
    }
}
