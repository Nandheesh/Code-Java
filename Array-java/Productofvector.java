Maximum scalar product of two vector

Input : {1, 2, 6, 3, 7}
        {10, 7, 45, 3, 7}

Output : 413
  
Explaination : Sort the array and find product of two vector arrays
                  1*3 + 2*7 + 3*7 + 6*10 + 7*45

class Main
{
    public static void main (String[] args)
    {
           int arr1[] = {1, 2, 6, 3, 7};
           int arr2[] = {10, 7, 45, 3, 7};
           int n = arr1.length;

            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){ if(arr1[i]>arr1[j]){
                       int temp = arr1[i];
                       arr1[i] = arr1[j];
                       arr1[j] = temp;
                    }
                }
            }

           for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){ if(arr2[i]>arr2[j]){
                        int temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                 }
            }
          int product = 0;
          for(int i=0; i<n; i++)
              product += arr1[i]*arr2[i];

          System.out.print(product);
   }
}
