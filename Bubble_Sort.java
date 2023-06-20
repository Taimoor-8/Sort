package Sorting;

public class Bubble_Sort {

    public void print(int [] arr){
//        Using for each loop or enhanced for loop
        for (int j : arr) {
            System.out.print(j + " ");
        }
//        using for loop
        /*for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }*/
        System.out.println();
    }

    public void reversePrint(int [] arr){
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int [] arr){
        boolean isSwapped;
        for (int i=0; i<arr.length-1; i++){
            isSwapped = false;
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }
    }

    public void ReverseSort(int [] arr){
        boolean isSwaped;
        for (int i = arr.length-1; i > 0; i--){
            isSwaped = false;
            for (int j = arr.length-1-i; j > 0; j--){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr [j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwaped = true;
                }
            }
            if (!isSwaped){
                break;
            }
        }
    }

    public static void main(String[] args) {

        Bubble_Sort bs = new Bubble_Sort();

        int [] arr = {4,2,8,4,13,17,5};
        System.out.println("Array before sorting is");
        bs.print(arr);


        bs.sort(arr);
        System.out.println("Array after sorting is");
        bs.print(arr);


        bs.ReverseSort(arr);
        System.out.println("Array after reverse bubble sorting is");
        bs.reversePrint(arr);
    }
}
