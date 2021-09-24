package Recursion_2_Lecture15;

import java.util.Scanner;

public class Merge_Sort
{

    public static void merge(int p1[],int p2[],int output[])
    {
        int i=0,j=0,k=0;
        while (i<p1.length && j<p2.length)
        {
            if (p1[i] < p2[j]){
                output[k] = p1[i];
                k++;
                i++;
            }
            else
            {
                output[k] = p2[j];
                k++;
                j++;
            }
        }
        while (i < p1.length)
        {
            output[k] = p1[i];
            k++;
            i++;
        }
        while (j < p2.length)
        {
            output[k] = p2[j];
            k++;
            j++;
        }


    }

    public static void MergeSort(int arr[])
    {
        // If it is an empty array
        if (arr.length <= 1)
            return;

        int mid = arr.length/2;
        int p1[] = new int[mid];
        int p2[] = new int[arr.length- mid];

        for (int i=0;i<mid ; i++)
        {
            p1[i] = arr[i];
        }
        int k=0;
        for (int i=mid+1; i<mid ; i++)
        {
            p2[k] = arr[i];
            k++;
        }
        MergeSort(p1);
        MergeSort(p2);
        merge(p1,p2,arr);

    }

    public static void main(String[] args) {

        int arr[] = {2,6,5,4,8,3};
        MergeSort(arr);

        for (int i=0 ; i< arr.length ; i++)
            System.out.print(arr[i]+" ");
    }

}
