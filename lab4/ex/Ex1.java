public class Ex1{
    public static void SelectionSort(int a[] ){
        int n = a.length, minidx;
        for(int i = 0; i< n; i++){
            minidx = i;
            for(int j = i+1; j < n; j++){
                if(a[j] < a[minidx]) minidx = j;
            }
            int temp = a[minidx];
            a[minidx] = a[i];
            a[i] = temp;
        }
    }

    public static void BubbleSort(int a[]) {
        int n = a.length;
        for(int i = 0; i< n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void InsertionSort(int a[]) {
        int n = a.length, key, j;
        for(int i = 1; i < n; i++){
            key = a[i];
            j = i - 1;
            while(j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    private static void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for(int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int first , int last){
        if (first < last){
            int middle = (first + last)/2;
            mergeSort(arr, first , middle);
            mergeSort(arr, middle + 1, last);
            merge(arr, first , middle , last);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void QuickSort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 0, 9, 5, 10, -5, 15, 3};
        int arr2[] = {5, 8, 9, 10, 5, -1, 4, 0};
        int arr3[] = {-1, 10, 4, 5, 1, -5, 15, 3};
        int arr4[] = {1, 3, 9, 2, 0, 5, 5, 3};
        int arr5[] = {1, 10, 1, -5, 13, 7, 9, 3};
        SelectionSort(arr1);
        System.out.println("arr1 after sorting");
        for (int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println();
        BubbleSort(arr2);
        System.out.println("arr2 after sorting");
        for (int x : arr2) {
            System.out.print(x + " ");
        }
        System.out.println();
        InsertionSort(arr3);
        System.out.println("arr3 after sorting");
        for (int x : arr3) {
            System.out.print(x + " ");
        }
        System.out.println();
        mergeSort(arr4, 0, arr4.length - 1);
        System.out.println("arr4 after sorting");
        for (int x : arr4) {
            System.out.print(x + " ");
        }
        System.out.println();
        QuickSort(arr5, 0, arr5.length - 1);
        System.out.println("arr5 after sorting");
        for (int x : arr5) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}