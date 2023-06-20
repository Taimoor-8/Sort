package Sorting;

public class Merge_Sort {

    public void sort(int [] arr , int [] temp , int low , int high){
        if (low < high){
            int mid = low + (high - low)/2; // situation for garbage values

            sort(arr , temp , low , mid);
            sort(arr , temp , mid + 1 , high);
            merge(arr , temp , low , mid , high);
        }
    }

    private void merge(int[] arr, int[] temp, int low, int mid, int high) {

        if (mid + 1 - low >= 0) System.arraycopy(arr, low, temp, low, mid + 1 - low);
        /*for (int i = low; i <= mid; i++){
            temp[i] = arr[i];
        }*/
        int i = low; // used for traversing left sub-array
        int j = mid +1; // used for traversing right sub-array
        int k = low; // used for merging both sorted sub-arrays
        while (i <= mid && j <= high){
            if (temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            }
            else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            arr[k] = temp[i];
            k++;
            i++;
        }

        while(j <= high){
            arr[k] = temp[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args) {

        Merge_Sort ms = new Merge_Sort();
        Bubble_Sort bs = new Bubble_Sort();

        int [] arr = {5,2,9,7,1,17,13};
        int [] temp = new int[arr.length];

        bs.print(arr);


        ms.sort(arr , temp , 0 , arr.length-1);
        bs.print(arr);
    }
}
