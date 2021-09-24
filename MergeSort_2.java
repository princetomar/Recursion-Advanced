package Recursion_2_Lecture15;

public class MergeSort_2
{
    static void MergeSort(int arr[],int si,int ei)
    {
        if (si >= ei)
            return;

        int mid = (si+ei)/2;
        // Part 1
        MergeSort(arr,si,mid);

        // Part 2
        MergeSort(arr,mid+1,ei);

        merge(arr,si,ei);
    }

    private static void merge(int[] arr,int si,int ei)
    {
        int mid = ( si+ei) /2;
        int out[] = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i <= mid && j <= ei)
        {
            if (arr[i] < arr[j])
            {
                out[k] = arr[i];
                i++;
                k++;
            }
            else {
                out[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i<=mid)
        {
            out[k] = arr[i];
            i++;
            k++;
        }
        while (j<=ei)
        {
            out[k] = arr[j];
            j++;
            k++;
        }

        for (int index=0; index < out.length ; index++) {
            arr[si+i] = out[i];

        }
    }

    public static void main(String[] args) {

        int arr[] = {2,6,5,4,8,3};
        MergeSort(arr,0, 5);

        for (int i=0 ; i< arr.length ; i++)
            System.out.print(arr[i]+" ");
    }

}
