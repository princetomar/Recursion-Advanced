public class QuickSort
{
    public static int Partition(int arr[], int si, int ei)
    {
        int pivot = arr[si];
        int count = 0;
        for (int i=si+1 ; i<= ei ; i++)
        {
            if (arr[i] <= pivot)
                count += 1;
        }

        // Setting pivot element position
        int pivotPos = si+count;
        arr[si] = arr[pivotPos];
        arr[pivotPos] = pivot;

        int i=si;
        int j = ei;

        // Ensuring step
        while (i < j)
        {
            while (i <= ei && arr[i]<= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i <= j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }

        return pivotPos;
    }

    public static void quickSort(int arr[],int si, int ei)
    {
        if (si >= ei)
            return;

        int pivotPos = Partition(arr,si,ei);
        quickSort(arr,si,pivotPos-1);
        quickSort(arr,pivotPos+1,ei);
    }


    public static void main(String[] args) {
        int arr[] = {10,18,19,9,2,6,11};
        quickSort(arr,0, arr.length-1);
        System.out.println("Quick Sort Result : ");
        for (int i=0 ; i< arr.length ; i++)
            System.out.print(arr[i]+" ");
    }
}
