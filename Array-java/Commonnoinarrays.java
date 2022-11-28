Common elements in sorted Array

public class Main {
    public static void main(String[] args) {
        int a[]= {2,4,6,8,9};
        int b[]= {1,3,5,6,9};
        int c[]= {2,4,5,6,7,8,9};

        int i=0 ,j=0 ,k=0;
        while(i < a.length && j < b.length && k < c.length){
            if(a[i] == b[j] && b[j] == c[k]){
                System.out.print(a[i]+" ");i++;j++;k++;
            }
            else if(a[i] < b[j]) i++;
            else if (b[j] < c[k]) j++;
            else k++;
        }
    }
}
