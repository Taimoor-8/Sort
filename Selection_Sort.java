package Sorting;

public class Selection_Sort {

    public void sort(int [] arr){
        int n = arr.length-1;
        for (int i = 0; i < n-1; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        Selection_Sort ss = new Selection_Sort();
        Bubble_Sort bs = new Bubble_Sort();

        int [] arr = {4,2,8,4,13,17,5};
        System.out.println("Array before selection sorting is");
        bs.print(arr);

        ss.sort(arr);
        System.out.println("Array after selection sorting is");
        bs.print(arr);

    }
}
