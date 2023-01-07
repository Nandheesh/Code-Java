Reverse Array by giving input
Example : n = 6 , d = 4;
arr[] = {1,2,3,4,5,6}

o/p : {5,6,1,2,3,4}

public static void main(String []args){
        int n = 6 , d = 4;
        int arr[] = {1,2,3,4,5,6};
        if(d>=n){
            d=d%n;
        }
            reverse(arr,0,d-1);
            reverse(arr,d,n-1);
            reverse(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
        static void reverse(int k[],int l,int h){
        while(l<h){
            int t=k[l];
            k[l]=k[h];
            k[h]=t;
            l++;
            h--;
        }
    }
