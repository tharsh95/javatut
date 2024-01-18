package ArrayEasy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3 };
        int arr1[] = new int[] { 1, 2, 2, 3, 4 };
        int arr3[] = new int[] { 2,1,0,1,0,2};
        // sortedArray(arr, arr1);
        sort012(arr3);

        // int[] arr1= shiftByDplaces(arr,9);
        // for(int i:arr1){
        // System.out.print(i+" ");
        // }
    }

    public static int[] reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static int[] shiftByDplaces(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        return arr;
    }

    public static int[] moveZeros(int n, int[] a) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp.add(a[i]);
            }
        }
        int diff = n - temp.size();
        for (int i = n - diff; i < n; i++) {
            temp.add(0);
        }
        for (int j = 0; j < n; j++) {
            a[j] = temp.get(j);
        }

        return a;
    }

    public static int[] moveZerosOptimal(int n, int[] a) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return a;

        for (int k = j + 1; k < n; k++) {
            if (a[k] != 0) {
                int temp = a[k];
                a[k] = a[j];
                a[j] = temp;
                j++;
            }
        }
        for (int z = 0; z < n; z++) {
            System.out.print(a[z] + " ");
        }
        return a;
    }

    public static List<Integer> sortedArray(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        for (int s : set) {
            list.add(s);
        }
        System.out.println(list);
        return list;
    }

    public static int[] sort012(int[] arr) {
        int mid = 0, low = 0, high = arr.length - 1;
        while (mid <= high) {
            if(arr[mid]==0){ 
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;

            }
            if(arr[mid]==1){ 
                mid++;

            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;

            }

        }
         for(int i:arr){
        System.out.print(i+"-->");
        }
        return arr;
    }

}
