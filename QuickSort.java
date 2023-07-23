package untitled.src.Quicksort;

public class QuickSort
{
    public static void main(String[] args)
    {
        int A[] = {6,5,7,8,4,3,4,5,10};
        int n = A.length; //n=9

        quicksort(A, 0, n - 1);
        System.out.println("Sorted Array is: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(A[i] + " ");
        }
    }
    public static void quicksort(int A[], int s, int e)
    {
        if(s>=e)
            return ;
        int p = rearrange(A,s,e);
        quicksort(A,s,p-1);
        quicksort(A,p+1,e);
    }

    public static int rearrange(int A[], int s, int e)
    {
        int l = s+1;
        int r = e;
        while(l<=r)
        {
            if(A[l]<=A[s])
                l++;
            else if(A[r]>A[s])
                r--;
            else
            {
                int temp = A[l];
                    A[l] = A[r];
                    A[r] = temp;
                    l++; r--;
            }
        }
        int temp = A[s];
            A[s] = A[l-1];
            A[l-1] = temp;

            return l-1;
    }
}
