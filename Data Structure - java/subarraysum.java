Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
  
class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int id = 0 , sum = 0;
        ArrayList<Integer> arrlis = new ArrayList<Integer>();
        arrlis.add(-1);
        if(s > 0){
            for(int i=0;i<n;i++){
                if(sum < s){
                    sum += arr[i];
                }
                while(sum > s){
                    sum -= arr[id];
                    id++;
                }
                if(sum==s){
                    arrlis.remove(0);
                    arrlis.add(id+1);
                    arrlis.add(i+1);
                    break;
                }
            }
        }
        return arrlis;
    }
}
