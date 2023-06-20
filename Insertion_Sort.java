package Sorting;

public class Insertion_Sort {

    public void sort(int [] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > arr[j+1]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

   /* public void reverseSort(int [] arr){
        int n = arr.length-1;
        for (int i = n-1; i > 0; i--){
            int temp = arr[i];
            int j = i+1;
            while(j <= n && arr[j] < arr[j+1]){
                arr[j+1] =
            }
        }
    }*/

    public static void main(String[] args) {
        Insertion_Sort is = new Insertion_Sort();
        Bubble_Sort bs = new Bubble_Sort();

        int [] arr = {4,2,8,4,13,17,5};
        System.out.println("Array before insertion sorting is");
        bs.print(arr);

        is.sort(arr);
        System.out.println("Array after insertion sorting is");
        bs.print(arr);
    }
}
