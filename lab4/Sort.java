
public class Sort{
    public static void print(int[]a){
        for(int i =0;i<a.length-1;i++){
            System.out.print(a[i]+"->");
        }
        System.out.print(a[a.length-1]);
    }
    public static void selection_sort(int[] a){
        for( int i = 0;i<a.length;i++){
            int min_index = i;
            for(int j =i+1;j<a.length;j++){
                if(a[j]<a[min_index]){
                    min_index = j;
                }
            }
            int tmp = a[i];
            a[i] = a[min_index];
            a[min_index]= tmp;
    }
}
    public static void BubbleSort(int a[]){
        int n = a.length;
        for(int i =0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.println(a[j]);
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j]= a[j+1];
                    a[j+1]= tmp;
                }
            }
        }
    }
    public static void insert_sort(int a[]){
        int n = a.length;
        for(int i =1;i<n;i++){
            int key = a[i];
            int j = i-1;
            
            while(j>=0 && a[j]>key){
                print(a);
                System.out.println();
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1]= key;
        }   
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        System.out.println(pivot);
        int i = (low - 1);
        for (int j = low; j < high; j++){
            print(arr);
            System.out.println();
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
    public static void main (String[] args){
        int array[]= {5,2,7,10,11,8,1};
        // selection_sort(array);
        // BubbleSort(array);
        // insert_sort(array);
        QuickSort(array, 0,array.length-1);
        print(array);
        

    }
}