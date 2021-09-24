import java.util.Scanner;

public class merge_sort_algorithm
{
    public static void mergeSort(int input[])
    {
        if (input.length <= 1){
            return;
        }
        int mid = input.length/2;
        int part1 []= new int[mid];
        int part2[] = new int[input.length - mid];


        
        int k = 0;
        
        for(int i=mid ; i<input.length ; i++)
        {
        	part2[k] = input[i];
        	k++;
        }
        mergeSort(part1);
        mergeSort(part2);
        
        merge(part1, part2, input);
    }

    public static void merge(int[] input1, int input2[], int []output)
    {
        int i =0, j =0, k = 0;
        

        while (i <input1.length && j < input2.length)
        {
            if (input1[i] < input2[j])
            {
                output[k] = input1[i];
                k++;
                i++;
            }
            else if(input1[i] > input2[j]){
                output[k] = input2[j];
                k++;
                j++;
            }
            else {
                output[k] = input1[i];
                i++;
                k++;
                j++;
            }
        }

        // Copying remaining elements from the larger part
        while (i< input1.length)
        {
            output[k] = input1[i];
            k++;
            i++;
        }
        while (j < input2.length)
        {
            output[k] = input2[j];
            k++;
            j++;
        }

       
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size of arr : ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements of array : ");
        for (int i=0 ;i< n ; i++)
        {
            arr[i] = scan.nextInt();
        }

        mergeSort(arr);

        System.out.println("After Merge Sort : ");
        for (int i=0 ; i< arr.length ; i++)
            System.out.print(arr[i]+ " ");
    }
}
