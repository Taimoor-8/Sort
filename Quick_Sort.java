package Sorting;

public class Quick_Sort {

    public void sort(int [] arr , int low , int high){

        if (low < high){
            int p = partition(arr , low , high);
            sort(arr , low , p-1);
            sort(arr , p+1 , high);
        }
    }

    private int partition(int [] arr , int low , int high){
        int i = low , j = low;
        int pivot = arr[high];

        while (i <= high){
            if (arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j-1;
    }

    public static void main(String[] args) {

        Quick_Sort qs = new Quick_Sort();
        Bubble_Sort bs = new Bubble_Sort();

        int [] arr = {3,9,6,8,12,16,2,8};
        System.out.println("Array before sorting is ");
        bs.print(arr);


        qs.sort(arr , 0 , arr.length-1);
        System.out.println("Array after sorting is ");
        bs.print(arr);
    }
}
